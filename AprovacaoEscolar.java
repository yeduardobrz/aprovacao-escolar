package exercicios;

import java.util.Scanner;

public class AprovacaoEscolar {
	public static void main(String[]args) {
		System.out.println("sistema de aprovacao escolar");
		System.out.println("digite as tres notas do aluno");
		Scanner sc = new Scanner(System.in);
		int  n1,n2,n3, media;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		media = (n1 + n2 + n3) / 3;
		
		if (media >= 7) {
			  System.out.println("aprovado");;
			} else {
				System.out.println("reprovado");
			}
		
}}
