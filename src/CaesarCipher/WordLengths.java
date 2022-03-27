package CaesarCipher;

import Resource.FileResource;


public class WordLengths {

    // bütün sözləri bir stringə yığıb sonra hər söz arrayın bir elementi etmək
    // sonra hər sözün uzunluğunu ölçüb yeni bir arraya yığmaq
    public void countWordLengths(FileResource fileResource, int[] counts) {
        String s = fileResource.words("test.txt");
        if (s.length() != 0) {
            String[] words = s.split("\\s+");
            for (String word : words) {
                int wl = word.length();
                if (!Character.isLetter(word.charAt(0))) {
                    wl = wl - 1;
                } else if (!Character.isLetter(word.charAt(word.length() - 1))) {
                    wl = wl - 1;
                }
                if (wl >= 30) {
                    wl = 30;
                }
                counts[wl] += 1;
            }

            // pretty print the result
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] == 0) {
                    continue;
                }
                if (counts[i] > 1) {
                    System.out.println(counts[i] + " words of length " + i);
                } else {
                    System.out.println(counts[i] + " word of length " + i);
                }

            }
        } else {
            System.out.println("No content"); // sonradan əlavə etdim
        }
    }

    public void testCountWordLengths(){
        FileResource resource = new FileResource();
        WordLengths wordLengths = new WordLengths();
        int[] counts = new int[31];
        wordLengths.countWordLengths(resource, counts);
    }

    public static void main(String[] args) {
        WordLengths wordLengths = new WordLengths();
        wordLengths.testCountWordLengths();
    }

}
