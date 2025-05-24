import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um numero qualquer: ");
        int num = leitor.nextInt();
        
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.printf("\n%d", i);
            }
        }
	}
}
