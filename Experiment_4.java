/*Write a java program that checks whether a given string is a palindrome 
or not.
Write a java program to perform all string operation */
import java.util.Scanner;
public class Experiment_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String st=s.nextLine();
        String st1=st.replaceAll("\\s+", "").toLowerCase();
        String rev="";
        for (int i=st1.length()-1;i>=0;i--) {
            rev+=st1.charAt(i);
        }
        if(st1.equals(rev)) {
            System.out.println(st+" is a Palindrome.");
        } else {
            System.out.println(st+" is NOT a Palindrome.");
        }

        //string operations
        System.out.print("Enter the first string: ");
        String str1=s.nextLine();
        System.out.print("Enter the second string: ");
        String str2=s.nextLine();
        System.out.println("\n--- String Operations ---");
        // Length
        System.out.println("Length of first string: " + str1.length());
        System.out.println("Length of second string: " + str2.length());
        // Concatenation
        String concat = str1.concat(str2);
        System.out.println("Concatenated string: "+concat);
        // Equals
        System.out.println("Are the strings equal? " + str1.equals(str2));
        // Ignore case comparison
        System.out.println("Equal ignoring case? " + str1.equalsIgnoreCase(str2));
        // To Upper Case
        System.out.println("First string in uppercase: " + str1.toUpperCase());
        // To Lower Case
        System.out.println("Second string in lowercase: " + str2.toLowerCase());
        // Character at index
        if (str1.length() > 0)
            System.out.println("First character of first string: " + str1.charAt(0));
        // Substring
        if (str2.length() >= 3)
            System.out.println("Substring of second string (0-3): " + str2.substring(0, 3));
        // Replace
        System.out.println("Replace 'a' with '@' in first string: " + str1.replace('a', '@'));
        // Index of character
        System.out.println("Index of 'e' in second string: " + str2.indexOf('e'));
        // Trim
        String withSpaces = "   Hello World   ";
        System.out.println("Trimmed string: '" + withSpaces.trim() + "'");
    }
}

