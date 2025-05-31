import  java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        
        int numerosInteiros [] = new int[tamanho];
        int soma = 0;
        
        for (int i = 0; i <= numerosInteiros.length -1; i++) {
            System.out.printf("Esolha o numero %d do vetor: ", i+1);
            numerosInteiros[i] = leitor.nextInt();
        }
        
        System.out.print("O vetor é: ");
        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.print(numerosInteiros[i] + " ");
        }
	}
}

11 994723395
