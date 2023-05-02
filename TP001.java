import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class TP001 {
    public static void main(String[] args) {

//Ejercicios nivel : Iniciado JAVA JEDI

//1. Suma de dos números: Se le solicita que guarden dos números enteros y los sumen. 
//El resultado mostrarlo por pantalla.

/*Scanner teclado = new Scanner( System.in );
int num1, num2, suma;

System.out.println("Introduce el primer número");
num1 = teclado.nextInt();

System.out.println("Introduce el segundo número");
num2 = teclado.nextInt();   

suma = num1 + num2;
System.out.println("La suma de primer número y el segundo número es " + suma);*/


//2. Suma de dos números bis: Se les solicita que guarden dos números enteros y los sumen. 
//El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se trata de un número par o impar.

/*int num3, num4, segunda_suma, pariedad;

System.out.println("Introduce el primer número");
num3 = teclado.nextInt();

System.out.println("Introduce el segundo número");
num4 = teclado.nextInt();   

segunda_suma = num4 + num3;

pariedad = segunda_suma;
    if (segunda_suma % 2 == 0) {
        System.out.print("La suma del primer número y el segundo número es " + segunda_suma + " y es par");
    }
    else {
        System.out.print("La suma del primer número y el segundo número es " + segunda_suma + " y es impar");
    }

}
}*/

//-------------------------------------------------------------------------------------------------------------
//3. Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
//y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?

/*char[] caracteres = {'N','i','c','o'};

System.out.println(caracteres[0]);
System.out.println(caracteres[1]);
System.out.println(caracteres[2]);
System.out.println(caracteres[3]);

*/ 

/*4. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado*/

Scanner teclado = new Scanner( System.in );
int num5, num6;

System.out.println("Introduce un número");
num5 = teclado.nextInt();

System.out.println("Introduce un número");
num6 = teclado.nextInt();

double suma3 = num5/num6;

if (num5%num6 == 00) {
    System.out.println("El número " + num5 + " es divisible por el número " + num6 + "; y el resultado es " + suma3);
}
else 
System.out.println("El número " + num5 + " NO es divisible por el número " + num6 + " ; y el resultado es " + suma3;

}
}