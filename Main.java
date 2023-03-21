import java.util.Scanner;

//write a program that checks wrether a string is a palindrome or not
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string in order to check if it is a palindrome: ");
        String user_input = input.nextLine();

        boolean isPalindrome = true;
        int last_letter = user_input.length()-1;
        int first_letter = 0;

        while (first_letter<last_letter)
        {
            if (user_input.charAt(first_letter)!=user_input.charAt(last_letter)){
                isPalindrome=false;
                break;
            }else
            {
                first_letter++;
                last_letter--;
            }
        }
        if (isPalindrome=true)
        {
            System.out.println("The written string it is a palindrome.");

        }else
        {
            System.out.println("The written string is not a palindrome.");
        }
    }
}