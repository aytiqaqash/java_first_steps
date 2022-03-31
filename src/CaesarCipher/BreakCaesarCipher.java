package CaesarCipher;
import java.util.Arrays;
import java.util.Random;

public class BreakCaesarCipher {

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

    // decrypt üçün açarı ədldə edirik
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
    public String decrypt(String encrypted) {
        // create an CaesarCipher object
        CaesarCipher cc = new CaesarCipher();
        int dkey = getKey(encrypted);
        return cc.encrypt(encrypted, dkey); // 17 | 26 - 17
    }

    public void testDecrypt(String message) {
        System.out.println(" ******** TEST DECRYPT **********");

        CaesarCipher caesarCipher = new CaesarCipher();
        BreakCaesarCipher breakCaesarCipher = new BreakCaesarCipher();
        Random random = new Random();
        String encrypted = caesarCipher.encrypt(message, random.nextInt(26));
        System.out.println(encrypted);
        String decrypted = breakCaesarCipher.decrypt(encrypted);
        System.out.println(decrypted);
    }

    // used by decryptTwoKeys
    public String halfOfString(String message, int start) {
        StringBuilder part = new StringBuilder();
        for (int i = start; i < message.length(); i+=2) {
            part.append(message.charAt(i));
        }
        return part.toString();
    }

    // decrypt with 2 keys encrypted
    public String decryptWithTwoKeys(String encrypted){

        CaesarCipher caesarCipher = new CaesarCipher();

        // birinci açarla şifrələnən sətri tapırıq
        String p1 = halfOfString(encrypted,0);
        String p2 = halfOfString(encrypted,1);

        // açarları tapırıq
        int k1 = getKey(p1);
        int k2 = getKey(p2);

        // deşifrələyib geri cavabı qaytarırıq
        return caesarCipher.encryptWithTwoKey(encrypted, k1, k2);
    }

    // yoxlayaq
    public void testDecryptWithTwoKeys(String message){
        System.out.println("");
        System.out.println("******** TEST DECRYPT WITH 2 KEYS **********");

        CaesarCipher caesarCipher = new CaesarCipher();
        BreakCaesarCipher breakCaesarCipher = new BreakCaesarCipher();
        Random random = new Random();
        String encrypted = caesarCipher.encryptWithTwoKey(message, random.nextInt(26), random.nextInt(26));
        System.out.println(encrypted);
        String decrypted = breakCaesarCipher.decryptWithTwoKeys(encrypted);
        System.out.println(decrypted);
    }

    public static void main(String[] args) {
        BreakCaesarCipher breakCaesarCipher = new BreakCaesarCipher();
        String message = "When trying to decrypt a cipher text based on a substitution cipher, we can use a frequency analysis to help identify the most recurring letters in a cipher text and hence make hypothesis of what these letters have been encoded as (e.g. E, T, A, O, etc). This will help us decrypt some of the letters in the text. We can then recognise patterns/words in the partly decoded text to identify more substitutions.";
        breakCaesarCipher.testDecrypt(message);
        breakCaesarCipher.testDecryptWithTwoKeys(message);
    }


}
