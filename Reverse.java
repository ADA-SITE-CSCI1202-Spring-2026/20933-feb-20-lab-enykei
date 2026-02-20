import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String original = reader.nextLine();
        
        String result = reverseString(original);
        System.out.println("Reversed: " + result);
        
        reader.close();
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        
        return sb.toString();
    }
}