import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        
        System.out.print("Digite um numero qualquer: ");
        double num = leitor.nextDouble();
        
        for (int i = 1; i < 11; i++) {
            System.out.printf("\n%d. %.0f x %d = %.0f", i, num, i, num*i);
        }
        
	}
}
