import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double tempo_falso_aluno1, tempo_falso_aluno2, tempo_falso_aluno3, tempo_falso_aluno4, tempo_falso_aluno5;
		
        System.out.print("Qual foi o tempo do aluno 1? ");
        tempo_falso_aluno1 = leitor.nextDouble(); 
		
        System.out.print("Qual foi o tempo do aluno 2? ");
        tempo_falso_aluno2 = leitor.nextDouble(); 
		
        System.out.print("Qual foi o tempo do aluno 3? ");
        tempo_falso_aluno3 = leitor.nextDouble(); 
		
        System.out.print("Qual foi o tempo do aluno 4? ");
        tempo_falso_aluno4 = leitor.nextDouble(); 
		
        System.out.print("Qual foi o tempo do aluno 5? ");
        tempo_falso_aluno5 = leitor.nextDouble(); 
        
        double tempo_real_aluno1, tempo_real_aluno2, tempo_real_aluno3, tempo_real_aluno4, tempo_real_aluno5;
        
        tempo_real_aluno1 = tempo_falso_aluno1 * 5;
        tempo_real_aluno2 = tempo_falso_aluno2 * tempo_falso_aluno2;
        if (tempo_falso_aluno3 % 2 == 0) {
            tempo_real_aluno3 = tempo_falso_aluno3 / 2;
        } else {
            tempo_real_aluno3 = tempo_falso_aluno3 * 2;
        }
        tempo_real_aluno4 = tempo_real_aluno3 * 3;
        tempo_real_aluno5 = tempo_falso_aluno5 - (tempo_real_aluno1 * 2);
        
        double maiorTempo = tempo_real_aluno1;
        String maiorTempoAluno = "Aluno 1";
        
        if (maiorTempo < tempo_real_aluno2) {
            maiorTempo = tempo_real_aluno2;
            maiorTempoAluno = "Aluno 2";
        } 
        if (maiorTempo < tempo_real_aluno3) {
            maiorTempo = tempo_real_aluno3;
                        maiorTempoAluno = "Aluno 3";
        }
        if (maiorTempo < tempo_real_aluno4) {
            maiorTempo = tempo_real_aluno4;
            maiorTempoAluno = "Aluno 4";
        } 
        if (maiorTempo < tempo_real_aluno5) {
            maiorTempo = tempo_real_aluno5;
            maiorTempoAluno = "Aluno 5";
        }
        
        System.out.println(tempo_real_aluno1);
        System.out.println(tempo_real_aluno2);
        System.out.println(tempo_real_aluno3);
        System.out.println(tempo_real_aluno4);
        System.out.println(tempo_real_aluno5);
        
        
        System.out.print(maiorTempoAluno + ": " + maiorTempo);
	}
}
