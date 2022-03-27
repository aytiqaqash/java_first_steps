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



    public static void main(String[] args) {

    }
}