public class CaesarCipher {

    /*
    @TODO add appropriate comments for the recording
     */

    public String encrypt(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        for(int i = 0; i< encrypted.length(); i++ ){
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            System.out.println(currChar + " | " + idx);
            if(idx != -1){
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            }
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        System.out.println(cc.encrypt("WHAT THE HELL", 9));
    }
}
