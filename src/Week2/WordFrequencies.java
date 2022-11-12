//package Week2;
//
//
//import java.util.*;
//import edu.duke.*;
//
///**
// * Write a description of WordFrequencies here.
// *
// * @author (your name)
// * @version (a version number or a date)
// */
//public class WordFrequencies {
//    private ArrayList<String> myWords;
//    private ArrayList<Integer> myFreqs;
//
//    public WordFrequencies(){
//        this.myWords = new ArrayList<String>();
//        this.myFreqs = new ArrayList<Integer>();
//    }
//
//    public boolean contains(ArrayList<String> list, String word){
//        for(int k=0; k < list.size(); k++){
//            if(list.get(k).equals(word)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void findUnique(){
//        this.myWords.clear();
//        this.myFreqs.clear();
//        int numStored = 0;
//        FileResource resource = new FileResource();
//        for(String word : resource.words()){
//            if(!contains(this.myWords,word.toLowerCase())){
//                numStored = 0;
//                this.myWords.add(word.toLowerCase());
//                this.myFreqs.add(numStored);
//            }
//            numStored = this.myFreqs.get(this.myWords.indexOf(word.toLowerCase())) + 1;
//            this.myFreqs.set(this.myWords.indexOf(word.toLowerCase()),numStored);
//        }
//    }
//
//    public int findIndexOfMax(){
//        int max = 0;
//        for(int i=0; i < this.myFreqs.size(); i++){
//            if(this.myFreqs.get(i) > max){
//                max = i;
//            }
//        }
//        return max;
//    }
//
//    public void tester(){
//        findUnique();
//        for(int k=0; k<this.myWords.size(); k++){
//            if(this.myFreqs.get(k) != 1){
//
//            }
//        }
//
//        System.out.println("Number of unique words: " + this.myWords.size());
//        System.out.println("Most Frequent word count " + this.myFreqs.get(findIndexOfMax()) + " word: " + this.myWords.get(findIndexOfMax()));
//
//    }
//}
//
