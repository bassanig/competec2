
public class Main
{
	public static void main(String[] args) {
		int contador = 1;
		int soma = 0;
		
		while (contador <= 100) {
		    soma += contador;
		    contador++;
		}
		
		System.out.printf("Soma dos números de um a cem é: %d", soma);
	}
}
