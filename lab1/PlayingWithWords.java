
/**
 * Defines a few small method to manipulate a word, as a way to proactice 
 * with simple looping in Java
 *
 * @author Catherine Delcourt (adapted from Stella K. and prior CS230 labs)
 * @version Fall 2024
 */
public class PlayingWithWords
{
    /**
     * This method prints the input word one capital letter per line using a for-loop.
     * 
     * @word The word to be printed one capital letter per line
     */
    public static void writeLetterPerLine(String word){
        String wordCaps = word.toUpperCase();
        for(int i = 0; i < wordCaps.length(); i++){
            System.out.println(wordCaps.charAt(i));
        }
    }
    
    /**
     * It prints the input word in reverse order using a for-loop.
     * 
     * @word The word to be printed in reverse
     */
    public static void writeInReverse(String word){
        for (int i=word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(word.length()-i));
        }
        System.out.println("");
    }
    
    
    /**
     * Main method to test writeLetterPerLine() and writeInReverse()
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args){
        String s = "Hello";
        PlayingWithWords.writeLetterPerLine(s);
        PlayingWithWords.writeInReverse(s);
    }
}
