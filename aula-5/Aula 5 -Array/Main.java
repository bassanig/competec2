import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, soma, media = 0, ma = 0, mn = 10,mediaT, somaM = 0;
		int qtdAlunos, aluno = 1, contApr = 0, contRep = 0, pApr, pRep, m0 = 0, m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0, m7 = 0, m8 = 0, m9 = 0, m10 = 0;
		System.out.println("Quantos alunos nesta turma?");
		qtdAlunos = sc.nextInt();
		while(aluno<=qtdAlunos) {
			System.out.println("Notas do " + aluno + "º aluno.");
			System.out.println("Informe a 1ª nota");
			n1 = sc.nextDouble();
			System.out.println("Informe a 2ª nota");
			n2 = sc.nextDouble();
			System.out.println("Informe a 3ª nota");
			n3 = sc.nextDouble();
			soma = (n1 + n2 + n3);
			media = (soma/3);
			System.out.println(aluno + "º aluno.\nMédia: " + media + ".");
			somaM = (somaM + media);
			if (media < 1) {
				m0 = m0 + 1;
			}
			if (media < 2 && media >= 1) {
				m1 = (m1 + 1);
			}
			if (media < 3 && media >= 2) {
				m2 = (m2 + 1);
				
			}
			if (media < 4 && media >= 3) {
				m3 = (m3 + 1);
			}
			if (media < 5 && media >= 4) {
				m4 = (m4 + 1);
			}
			if (media < 6 && media >= 5) {
				m5 = (m5 + 1);
			}
			if (media < 7 && media >= 6) {
				m6 = (m6 + 1);
			}
			if (media < 8 && media >= 7) {
				m7 = (m7 + 1);
			}
			if (media < 9 && media >= 8) {
				m8 = (m8 + 1);
			}
			if (media < 10 && media >= 9) {
				m9 = (m9 + 1);
			}
			if (media < 11 && media >= 10) {
				m10 = (m10 + 1);
			}
			if (media > ma) {
				ma = media;
			}
			if (mn > media) {
				mn = media;
			}
			if(media>=6) {
				System.out.println("Aprovado! Parabéns!");
				contApr = (contApr + 1);
			}else {
				System.out.println("Reprovado...");
				contRep++;
			}
			aluno = (aluno + 1);
			System.out.println("\n");
			
		}
		mediaT = (somaM / qtdAlunos);
		System.out.println(contApr + " alunos aprovados, nesta turma.");
		pApr = ((contApr * 100) / qtdAlunos);
		System.out.println("Percentual de alunos aprovados: " + pApr + "%");
		System.out.println(contRep + " alunos reprovados, nesta turma.");
		pRep = ((contRep * 100) / qtdAlunos);
		System.out.println("Percentual de alunos reprovados: " + pRep + "%");
		System.out.println("A maior nota é: " + ma);
		System.out.println("A media da turma é: " + mediaT);
		System.out.println("A menor nota é: " + mn);
		if (mediaT < 1) {
			System.out.println("o número de alunos que ficaram acima da média é " + (m0 + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10));
		}
		if (mediaT < 2 && mediaT >= 1) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10));
		}
		if (mediaT < 3 && mediaT >= 2) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10));
			
		}
		if (mediaT < 4 && mediaT >= 3) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10));
		}
		if (mediaT < 5 && mediaT >= 4) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m4 + m5 + m6 + m7 + m8 + m9 + m10));
		}
		if (mediaT < 6 && mediaT >= 5) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m5 + m6 + m7 + m8 + m9 + m10));
		}
		if (mediaT < 7 && mediaT >= 6) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m6 + m7 + m8 + m9 + m10));
		}
		if (mediaT < 8 && mediaT >= 7) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m7 + m8 + m9 + m10));
		}
		if (mediaT < 9 && mediaT >= 8) {
			System.out.println("o número de alunos que ficaram acima da média é " + ( m8 + m9 + m10));
		}
		if (mediaT < 10 && mediaT >= 9) {
			System.out.println("o número de alunos que ficaram acima da média é " + (m9 + m10));
		}
		if (mediaT < 11 && mediaT >= 10) {
			System.out.println("o número de alunos que ficaram acima da média é " + (m10));
		}
		if (mediaT < 1) {
			System.out.println("o número de alunos que ficaram abaixo da média é 0");
		}
		if (mediaT < 2 && mediaT >= 1) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + ( m0));
		}
		if (mediaT < 3 && mediaT >= 2) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + ( m0 + m1));
			
		}
		if (mediaT < 4 && mediaT >= 3) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + ( m0 + m1 + m2));
		}
		if (mediaT < 5 && mediaT >= 4) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + ( m0 + m1 + m2 + m3));
		}
		if (mediaT < 6 && mediaT >= 5) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + ( m0 + m1 + m2 + m3 + m4));
		}
		if (mediaT < 7 && mediaT >= 6) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + ( m0 + m1 + m2 + m3 + m4 + m5));
		}
		if (mediaT < 8 && mediaT >= 7) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + (m0 + m1 + m2 + m3 + m4 + m5 + m6));
		}
		if (mediaT < 9 && mediaT >= 8) {
			System.out.println("o número de alunos que ficaram abaixo da média é " + (m0 + m1 + m2 + m3 + m4 + m5 + m6 + m7));
		}
		if (mediaT < 10 && mediaT >= 9) {
			System.out.println("o número de alunos que ficaram abaixo da média é" + (m0 + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8));
		}
		if (mediaT < 11 && mediaT >= 10) {
			System.out.println("o número de alunos que ficaram abaixo da média é 0");
		}

	}
}