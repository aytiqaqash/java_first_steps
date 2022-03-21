package CaesarCipher;

public class CaesarCipher {
    public String encrypt(String input, int key){


//        0. Make StringBuilder to work with Strings (encrypted)
        StringBuilder encrypted = new StringBuilder(input);

//        1. Wrote down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

//        2. Computed the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);

//        3. Count from 0 to < message.length,  (i)
       for (int i = 0 ; i < encrypted.length(); i++){

//        4. Looked at ith letter of message (currChar)
           char currChar = encrypted.charAt(i);

//        5. Find the index of currChar in the alphabet (idx)
           int idx = alphabet.indexOf(currChar);

//        6. if currChar is in the alphabet
           if (idx != -1){
//            Get the idxth character of the shifted alphabet (newChar)
               char newChar = shiftedAlphabet.charAt(idx);
//            Replace the ith character of the message with newChar
                encrypted.setCharAt(i,newChar);
           }
//	       else
//             do nothing
        }

//        7. Your answer is the String inside of encrypted
       return encrypted.toString();
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();

        //encryption
        System.out.println(caesarCipher.encrypt("I AM",17));

        //decryption
        System.out.println(caesarCipher.encrypt("Z RD",26-17));
    }
}

