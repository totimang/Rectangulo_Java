package rectangulo;

import java.util.Scanner;

/*Generar un programa que solicite la base y la altura de un rectángulo
y muestre por pantalla su área y su perímetro.*/
public class rectangulo {

	public rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double lado1, lado2, perimetro, area; //DECLARO LAS VARIABLES
		
		System.out.print("Ingrese el primer lado de un rectangulo:"); //ESCRIBO EL LADO 1
		lado1 = sc.nextDouble();
		
		System.out.print("Ingrese el segundo lado de un rectangulo:");//ESCRIBO EL LADO 2
		lado2 = sc.nextDouble();
		
		if (lado1 > 0 && lado2 > 0 && lado1 != lado2 ) {//Digo que el lado 1 y el lado 2 deben ser mayor a cero, también digo que los lados no pueden ser iguales
			perimetro = (lado1 * 2) + (lado2 * 2);		
			System.out.println("El perimetro del rectangulo es: " + perimetro + "m");
			
			area = lado1 * lado2;	
			System.out.println("El area del rectangulo es: " + area + "m²");
		} else if (lado1 <= 0 || lado2 <=0) {//Digo que el lado 1 y el lado 2 no pueden ser menor a cero
			System.out.println("El lado no puede ser cero");
		} else {
			System.out.println("Los lados no pueden ser iguales");
		}
		
	}

}
