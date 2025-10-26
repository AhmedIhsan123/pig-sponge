import java.util.*;
public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) {
        // something -> omethingsay

        // Set to store vowels
        Set<Character> vowels = new HashSet<>();

        // Populate the set
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Variable to store the updated string
        String finalStr = "";

        // Split the sentance into an array of words/strings
        String[] words = sentence.split(" ");

        // for each word
        for (String word : words) {
            // Check if its starts with a vowel
            if (!vowels.contains(word.charAt(0))) {
                // Otherwise, move the first letter to the back of the string, and add ay to it.
                String newWord = "";

                // Go from the index 1 to the end of the word
                newWord += word.substring(1, word.length());
                newWord += word.charAt(0);
                newWord += "ay";

                // Add the word to a new string
                finalStr += (newWord + " ");
            } else {
                // If true, just add the word
                finalStr += (word + " ");
            }
        }

        // Return the updated string
        return finalStr.trim();
    }









    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  