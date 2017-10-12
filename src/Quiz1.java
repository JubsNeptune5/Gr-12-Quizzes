/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class Quiz1 {

    public static String reverseString(String word) {
        //Return word when the word only has one letter
        if (word.length() == 1) {
            return word;
        }
        //Make 
        String newWord =  word.substring(1);
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
