import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int tamanhoTriangulo, tamanhoLinha;
        
        System.out.print("Digite o numero de asteriscos do seu triangulo: ");
        tamanhoTriangulo = leitor.nextInt();
        tamanhoLinha = tamanhoTriangulo;
        
        for (int i = 1; i <= tamanhoTriangulo; i++) {
            for (int y = 1; y <= tamanhoLinha; y++) {
                System.out.print('*');
            }
            System.out.println("");
            tamanhoLinha--;
        }
	}
}
