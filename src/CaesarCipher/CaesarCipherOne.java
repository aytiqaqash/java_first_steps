package CaesarCipher;

public class CaesarCipherOne {

    private String alphabet;
    private String alphabetLowerCase;
    private int mainKey;

    public CaesarCipherOne(int key){
        //        1. Wrote down the alphabet
        this.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.alphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
        this.mainKey = key;
    }
    // Encryption
    public String encrypt(String input){
//        0. Make StringBuilder to work with Strings (encrypted)
        StringBuilder encrypted = new StringBuilder(input);

//        2. Computed the shifted alphabet
        String shiftedAlphabet = this.alphabet.substring(this.mainKey) + this.alphabet.substring(0,this.mainKey);
        String shiftedLowerAlphabet = this.alphabetLowerCase.substring(this.mainKey) + this.alphabetLowerCase.substring(0,this.mainKey);

//        3. Count from 0 to < message.length,  (i)
        for (int i = 0 ; i < encrypted.length(); i++){

//        4. Looked at ith letter of message (currChar)
            char currChar = encrypted.charAt(i);

//        5. Find the index of currChar in the alphabet (idx)
            int idx = this.alphabet.indexOf(Character.toUpperCase(currChar));

//        6. if currChar is in the alphabet
            if (idx != -1){
//            Get the idxth character of the shifted alphabet (newChar)
                char newChar;
                if(Character.isUpperCase(currChar)){
                    newChar = shiftedAlphabet.charAt(idx);
                }else{
                    newChar = shiftedLowerAlphabet.charAt(idx);
                }

//            Replace the ith character of the message with newChar
                encrypted.setCharAt(i,newChar);
            }
//	       else
//             do nothing
        }

//        7. Your answer is the String inside of encrypted
        return encrypted.toString();
    }

    public String decrypt(String encrypted){
        this.mainKey = 26 - this.mainKey;
        return encrypt(encrypted);
    }

    public static void main(String[] args) {
        CaesarCipherOne cco = new CaesarCipherOne(17);
        String encrypted = cco.encrypt("Test Message");
        String decrypted = cco.decrypt(encrypted);
        System.out.println("Encrypt: " + encrypted + " | Decrypt: " + decrypted);
    }
}
