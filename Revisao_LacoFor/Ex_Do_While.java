package Revisao_LacoFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex_Do_While {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	int n = 0;
	int fatorial = 1;
	int i = 1;
	
	System.out.println("Digite um numero:");
	n = Integer.parseInt(scan.nextLine());
	do {
		fatorial = fatorial*i;
		i++;
	}
	while (n>=i);
	
	System.out.println("O fatorial de " + n +" é "+ fatorial);
   }
}

