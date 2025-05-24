import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    
	    
	    
	    System.out.println("1. Cachorro Assado - 5.99");
	    System.out.println("2. Gato a Passarinho - 7.99");
	    System.out.println("3. Piriquito a Milenesa - 8.99");
	    
		System.out.println("Qual dos itens você quer? (1/2/3)");
		int escolha = leitor.nextInt();
		
		double carrinho = 0;
		
		switch (escolha) {
		    case 1:
		        carrinho += 3.99;
		        break;
		
		    case 2:
		        carrinho += 7.99;
		        break;
		  
		    case 3:
		        carrinho += 8.99;
		        break;
		 
		    default:
		        System.out.println("Produto não existente!");
		}
		    
		    System.out.println("Quanta grana você tem?");
		    double carteira = leitor.nextDouble();
		    
		    if (carteira >= carrinho){
		        System.out.print("Você consiguira adquirir os itens do carrinho");
		    } else {
		        System.out.print("Você não consiguira adquirir os itens do carrinho");
		    }
		
		
	}
}
