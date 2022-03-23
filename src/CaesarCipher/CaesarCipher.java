package CaesarCipher;

import java.util.Arrays;

public class CaesarCipher {

    // Encryption
    public String encrypt(String input, int key){


//        0. Make StringBuilder to work with Strings (encrypted)
        StringBuilder encrypted = new StringBuilder(input);

//        1. Wrote down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";

//        2. Computed the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        String shiftedLowerAlphabet = lowerAlphabet.substring(key) + lowerAlphabet.substring(0,key);

//        3. Count from 0 to < message.length,  (i)
       for (int i = 0 ; i < encrypted.length(); i++){

//        4. Looked at ith letter of message (currChar)
           char currChar = encrypted.charAt(i);

//        5. Find the index of currChar in the alphabet (idx)
           int idx = alphabet.indexOf(Character.toUpperCase(currChar));

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
    public String encryptWithTwoKey(String input, int key1, int key2){
//        0. Make StringBuilder to work with Strings (encrypted)
        StringBuilder encrypted = new StringBuilder(input);

//        1. Wrote down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";

//        2. Computed the shifted alphabet
        String shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0,key2);
        String shiftedLowerAlphabet1 = lowerAlphabet.substring(key1) + lowerAlphabet.substring(0,key1);
        String shiftedLowerAlphabet2 = lowerAlphabet.substring(key2) + lowerAlphabet.substring(0,key2);

//        3. Count from 0 to < message.length,  (i)
       for (int i = 0 ; i < encrypted.length(); i++){

           String shiftedAlphabet, shiftedLowerAlphabet;
           if ( i % 2 == 0){
               shiftedAlphabet = shiftedAlphabet1;
               shiftedLowerAlphabet = shiftedLowerAlphabet1;
           }else{
               shiftedAlphabet = shiftedAlphabet2;
               shiftedLowerAlphabet = shiftedLowerAlphabet2;
           }


//        4. Looked at ith letter of message (currChar)
           char currChar = encrypted.charAt(i);

//        5. Find the index of currChar in the alphabet (idx)
           int idx = alphabet.indexOf(Character.toUpperCase(currChar));

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

    // Decryption Without Keys
    public int[] countLetters(String message){
        // alphabet
        String alph = "abcdefghijklmnopqrstuvwxyz";
        // array for each char of alphabet
        int[] counts = new int[26];
        // Go through the message chars and add counts for that char
        for (int k = 0; k<message.length();k++){
            char ch = Character.toLowerCase(message.charAt(k));
            int dex =alph.indexOf(ch);
            if (dex!=-1){
                counts[dex] += 1;
            }
        }
        return counts;
    }

    // Most Frequent char index
    public int maxIndex(int[] vals){
        int maxDex = 0;
        for (int k=0; k<vals.length;k++){
            if(vals[k] >= vals[maxDex]){
                maxDex = k;
            }
        }
        return maxDex;
    }

    public String decrypt (String encrypted){
        // create an CaesarCipher object
        CaesarCipher cc = new CaesarCipher();

        // get the Frequency of the letters
        int[] freqs = countLetters(encrypted);
        System.out.println("freqs " + Arrays.toString(freqs));

        // get the index of the most frequent char
        int maxDex = maxIndex(freqs);
        System.out.println("maxDex " + maxDex);

        int dkey = maxDex-4;
        if(maxDex<4){
            dkey = 26 - (4-maxDex);
        }
        System.out.println("dKey " + dkey);

        return cc.encrypt(encrypted,26-dkey);
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String message = "When trying to decrypt a cipher text based on a substitution cipher, we can use a frequency analysis to help identify the most recurring letters in a cipher text and hence make hypothesis of what these letters have been encoded as (e.g. E, T, A, O, etc). This will help us decrypt some of the letters in the text. We can then recognise patterns/words in the partly decoded text to identify more substitutions.";
        String encrypted = caesarCipher.encrypt(message,12);
        System.out.println(encrypted);
        String decrypted = caesarCipher.decrypt(encrypted);
        System.out.println(decrypted);
    }
}