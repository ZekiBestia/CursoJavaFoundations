package pruebas.tiposdatos;

public class Pruebas {
public static void main(String[] args) {
	System.out.println("Holamundo");
	/*Una variable sirve para almacenar datos , y esta reserva espacio en la memoria RAM
	 * 
	 */
 //Tipos de valores en JAVA
//Tipos mas comunes:
	
	boolean encendido = true;
	int numeroEntero=5;
	double numeroDe=6.5;
	float numeroFlo=7.3f;
	String cadena="Cadena";
	/*Nomenclatura inadecuada para variables
	* Dos variables no pueden tener el mismo nombre
	* int x=20;
	* double x=20;
	LASVARIABLES NO PUEDEN UTILIZAR PALARAS CLAVE CON NOMBRE DE VARIABLE
	int String = 20;
	*/
	
	int suma , resta , multiplicacion, division;
	int num1=5;
	int num2=3;
	suma = num1 + num2;
	resta= num1- num2;
	multiplicacion=num1*num2;
	division=num1/num2;
	
	System.out.println(division );
	
	/*
	short hola = (short)3.5;
	int LongAInt = (int)20L;
	System.out.println(LongAInt);
	short dobleAshort= (short)3.5;
	System.out.println(dobleAshort);
	double num3 = 4.5;
	System.out.println((short) num3);
	double money = 53.99;
	int moneyE = (int) money;
	System.out.println(moneyE);
	*/
	/*
	int a = 2;
	int b= 2;
	byte c;
	c = (byte)(a+b);
	System.out.println(c);
	short v , n , m ;
	v = 4;
	n=5;
System.out.println(m =(short)(v +n));
float float2 = 33.4;
	*/
	
	String edad = "12";
	int edadIn;
	edadIn = Integer.valueOf(edad);
	System.out.println("Cadena: " + (edad+ 2));
	System.out.println("Entero: " +(edadIn + 2));
	
}
}

