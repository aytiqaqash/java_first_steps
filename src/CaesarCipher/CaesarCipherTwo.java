package CaesarCipher;

public class CaesarCipherTwo {
    private int mainKey1;
    private int mainKey2;
    private String alphabet;
    private String alphabetLowerCase;

    public CaesarCipherTwo(int key1, int key2){
        this.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.alphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
        this.mainKey1 = key1;
        this.mainKey2 = key2;
    }

    public String encryptWithTwoKey(String input){
//        0. Make StringBuilder to work with Strings (encrypted)
        StringBuilder encrypted = new StringBuilder(input);

//        2. Computed the shifted alphabet
        String shiftedAlphabet1 = this.alphabet.substring(this.mainKey1) + this.alphabet.substring(0,this.mainKey1);
        String shiftedAlphabet2 = this.alphabet.substring(this.mainKey2) + this.alphabet.substring(0,this.mainKey2);
        String shiftedLowerAlphabet1 = this.alphabetLowerCase.substring(this.mainKey1) + this.alphabetLowerCase.substring(0,this.mainKey1);
        String shiftedLowerAlphabet2 = this.alphabetLowerCase.substring(this.mainKey2) + this.alphabetLowerCase.substring(0,this.mainKey2);

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

    public String halfOfString(String message, int start) {
        StringBuilder part = new StringBuilder();
        for (int i = start; i < message.length(); i+=2) {
            part.append(message.charAt(i));
        }
        return part.toString();
    }

    // decrypt with 2 keys encrypted
    public String decryptWithTwoNoKeys(String encrypted){

        // birinci açarla şifrələnən sətri tapırıq
        String p1 = halfOfString(encrypted,0);
        String p2 = halfOfString(encrypted,1);

        // açarları tapırıq
        int k1 = getKey(p1);
        int k2 = getKey(p2);

        CaesarCipherTwo caesarCipherTwo = new CaesarCipherTwo(k1,k2);

        // deşifrələyib geri cavabı qaytarırıq
        return caesarCipherTwo.encryptWithTwoKey(encrypted);
    }

    public static void main(String[] args) {
        CaesarCipherTwo cc2 = new CaesarCipherTwo(17,23);
        String encrypted = cc2.encryptWithTwoKey("Test me one encryption Test me one encryption Test me one encryption Test me one encryption");
        String decryptedNoKeys = cc2.decryptWithTwoNoKeys(encrypted);
        System.out.println("Encrypt: " + encrypted + " | Decrypt: " + decryptedNoKeys);
    }
}
