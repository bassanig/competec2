import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
            int x = 10;
            String wordOnTheContrary = "";
            boolean isPalindrome = false;
            
            String num = Integer.toString(x);
            String[] numArray = num.split("");
            
            for (int i = numArray.length -1; i >= 0; i--) {
                wordOnTheContrary += numArray[i];
            }
            
            System.out.print(wordOnTheContrary + " ");
            System.out.print(Integer.toString(x));
            
            
            if (wordOnTheContrary.equals(num)) {
                isPalindrome = true;
                System.out.print(" " + wordOnTheContrary + " is palindrome");
            } else {
                isPalindrome = false;
                System.out.print(" " + wordOnTheContrary + " is not palindrome");
    	}
    }
}
