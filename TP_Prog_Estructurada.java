//import javax.swing.JOptionPane;

//import java.text.BreakIterator;
import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

public class TP_Prog_Estructurada {
    public static void main(String[] args) {

/*1. Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.*/

/*for (int i = 0; i < 7; i++)
        {

    for (int k = 0; k < 6-i ; k++) {
        System.out.print(" ");

    for (int j = 0; k < i*2 + 1; k++) {
        System.out.print("*");
        
    }
    }
    System.out.print("\n");

}*/

/*2. Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo.*/

/*String nombres[] = new String[10];

int i = 0;
while (i<10) {
    String nombre = JOptionPane.showInputDialog("Introducí el nombre de tus amigos: " +(i+1));
    
    nombres[i] = nombre;
    i++;
}

JOptionPane.showMessageDialog(null, "Listado de personas \n" 
    + "Persona 1: " + nombres [0] + "\n"
    + "Persona 2: " + nombres [1] + "\n"
    + "Persona 3: " + nombres [2] + "\n"
    + "Persona 4: " + nombres [3] + "\n"
    + "Persona 5: " + nombres [4] + "\n"
    + "Persona 6: " + nombres [5] + "\n"
    + "Persona 7: " + nombres [6] + "\n"
    + "Persona 8: " + nombres [7] + "\n"
    + "Persona 9: " + nombres [8] + "\n"
    + "Persona 10: " + nombres [9] + "\n"
    + "");
*/

/*3. Suma de números : Realizar un programa que guarde un número en memoria y
determine si es par o impar.*/  


/*Scanner teclado = new Scanner(System.in); 

int num1;

System.out.print("Ingrese un número a evaluar: ");
num1 = teclado.nextInt();

    if (num1 % 2 == 0) {
        System.out.print("Su número es par");
    }
    else {
        System.out.print("Su número es impar");
    }*/


/*4. De que se trata esto? : Realizar un programa que guarde un número en memoria y
determine si es positivo, negativo o cero.*/

/*Scanner teclado = new Scanner(System.in); 

int num2;

System.out.print("Ingrese un número a evaluar: ");
num2 = teclado.nextInt();

    if (num2 > 0) {
        System.out.print("Su número es positivo");
    }

    if (num2 < 0) {
        System.out.print("Su número es negativo");
    }
    if (num2 == 0) {
        System.out.print("Su número es igual a 0");
    }*/

/*5. La suma de los primeros: Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria.*/

/*Scanner teclado = new Scanner(System.in); 

int num3;

System.out.print("Ingrese un número a evaluar: ");
num3 = teclado.nextInt();

int suma_natu = num3*(num3+1)/2; {
        System.out.print("La suma es " + suma_natu);
}*/


/*6. A mi me gustan los pares: Escribe un programa que imprima solo los N números
pares, donde los N números son guardados en variables o constantes según
corresponda.*/

/*Scanner teclado = new Scanner(System.in);

int num4, suma_pares = 0;

for(;;) {
    System.out.println("Ingresa un numero: ");

num4 = teclado.nextInt();

suma_pares = num4;
if (suma_pares % 2 == 0) {
    System.out.println("Tu número se imprime porque es par, y es el  " + suma_pares);

}

else 
    System.out.println("Tu número no es par");

}*/


/*7. Espero aprobar : Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto*/

System.out.println("       |-|-|-|RESULTADO AL EXAMEN DE INGRESO|-|-|-|");

try (Scanner leer = new Scanner(System.in)) {
    int notas;
    
    System.out.print("ingrese cantidad de notas: ");
notas = leer.nextInt();

int suma = 0;
int prom = 0; 
int nota = 0;
    
for(int i=1; i<= notas; i++){
    System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");
    nota = leer.nextInt();          
    suma = suma + nota;
}

prom = suma / notas;

if (prom >= 6) {
    System.out.println("Usted está aprobado y el promedio de sus notas es de "+ prom ); }
if (prom <= 5) {
    System.out.println("Usted no está aprobado y el promedio de sus notas es de "+ prom );

}
}
    }
}