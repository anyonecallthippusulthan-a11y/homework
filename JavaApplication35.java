package javaapplication35;

import java.util.Scanner;

public class JavaApplication35 {

        

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence:");
        String str = sc.nextLine();

      
        int Count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                Count++;
            }
        }

        
        String word[] = str.trim().split("");
        int wordCount = word.length;

       
        int vowelCount = 0;
        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Output
        System.out.println("Characters (without spaces): " + Count);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
    }
}
    
    

