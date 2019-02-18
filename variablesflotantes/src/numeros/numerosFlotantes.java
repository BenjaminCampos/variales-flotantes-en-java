package numeros;

import java.util.Scanner;

public class numerosFlotantes {
	
	public static void main(String args[]) {
		//numeros fotantes
		Scanner introducir=new Scanner(System.in);
		float numero1,numero2;
		float resultado,suma,div;
		System.out.println("operaciones con numeros flotantes");
		System.out.println("dame el primer numero");
		numero1=introducir.nextFloat();
		System.out.println("dame otro numero");
		numero2=introducir.nextFloat();
		resultado=numero1*numero2;
		System.out.println("el resultado de la multiplicasion es");
		System.out.println(resultado);
		suma=numero1+numero2;
		System.out.println("la suma de los dos nuermo es ");
		System.out.println(suma);
		System.out.println("y la division de tus numero es ");
		div=numero1/numero2;
		System.out.println(div);
		
	}

}
