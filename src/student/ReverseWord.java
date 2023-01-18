
package student;

import java.util.Scanner;

public class ReverseWord {
    
    public static void main(String[] args) {
        
//        char[] myArray = new char[7];
//        myArray [0] = 's';
//        myArray [1] = 't';
//        myArray [2] = 'u';
//        myArray [3] = 'd';
//        myArray [4] = 'e';
//        myArray [5] = 'n';
//        myArray [6] = 't';
//        
//        for (int i=0; i<myArray.length; i++){
//            System.out.print(myArray[i]);
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();
        char[] letters = new char[word.length()];
        for (int i=0; i< letters.length; i++) {
        letters[i] = word.charAt(i);
        System.out.print(letters[i]);
    }
        System.out.println();
        for (int i= letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
        
        
        
    }
    
}
