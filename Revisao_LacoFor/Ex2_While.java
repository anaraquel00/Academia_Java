package Revisao_LacoFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex2_While {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	int num,fatorial,i=1;
	
    fatorial = 1;
    
	System.out.println("Digite um numero: ");
	num = Integer.parseInt(scan.nextLine());
    do {
    	fatorial= fatorial*i;
    	i++;
	}
   	while  (i <= num);
	
	System.out.println("O fatorial de "+ num + " é: " + fatorial );

	}
}


