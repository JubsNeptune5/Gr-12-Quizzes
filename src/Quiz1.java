/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *First Quiz of the year
 * @author laveh2107
 */
public class Quiz1 {
/**
 * Program to recursivly display the string backwards
 * @param word
 * @return 
 */
    public static String reverseString(String word) {
        //Return word when the word only has one letter
        if (word.length() == 1) {
            return word;
        }
        //Make a substring of the string including everything except for the first letter 
        String newWord =  word.substring(1);
        //Return the substring recusively + the first letter to print out the letters in reverse order
        return reverseString(word.substring(1)) + word.charAt(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = "light";
        System.out.println(word);
        System.out.println(reverseString(word));
    }
}
