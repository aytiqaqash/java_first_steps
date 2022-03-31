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

    // getKey istifadə edəcək
    public int[] countLetters(String message) {
        // alphabet
        String alph = "abcdefghijklmnopqrstuvwxyz"; // kiçik hərflərdən ibarət əlifba
        // array for each char of alphabet
        int[] counts = new int[26]; // hər hərfin qarşımıza çıxmasını burada saxlayacağıq
        // Go through the message chars and add counts for that char
        for (int k = 0; k < message.length(); k++) {
            char ch = Character.toLowerCase(message.charAt(k)); // d
            int dex = alph.indexOf(ch); // 3
            if (dex != -1) {
                counts[dex] += 1; // indexin dəyərini bir dənə artır  3 => +1
            }
        }
        return counts;
    }

    // Most Frequent char index
    public int maxIndex(int[] vals) {
        int maxDex = 0;
        for (int k = 0; k < vals.length; k++) {
            if (vals[k] >= vals[maxDex]) {
                maxDex = k;
            }
        }
        return maxDex; // maksimal dəyəri olan index
    }

    public int getKey(String encrypted){
        // get the Frequency of the letters 26
        int[] freqs = countLetters(encrypted); // hər hərfdən neçə dənədir?!
        int maxDex = maxIndex(freqs); // maksimal dəyəri olan index
        int dkey = maxDex - 4;
        if (maxDex < 4) {
            dkey = 26 - (4 - maxDex); // original açar 26 - 25
        }
        return 26 - dkey; // deşifrələmək üçün istifadə oluna biləcək açarı geri qaytarırıq.
    }

    // Decryption Without Keys
    public String decryptNoKey(String encrypted) {
        // create an CaesarCipher object
        int dkey = getKey(encrypted);
        CaesarCipherOne cc = new CaesarCipherOne(dkey);

        return cc.encrypt(encrypted); // 17 | 26 - 17
    }


    public static void main(String[] args) {
        CaesarCipherOne cco = new CaesarCipherOne(17);
        String originalMessage = "Test me one encryption";
        String encrypted = cco.encrypt(originalMessage);
        String decrypted = cco.decrypt(encrypted);
        String decryptedNoKey = cco.decryptNoKey(encrypted);
        System.out.println("Encrypt: " + encrypted + " | Decrypt: " + decrypted + " | NoKey: " + decryptedNoKey);
    }
}
