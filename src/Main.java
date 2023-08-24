import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int [][] matriz;
    }
    public static void ValidacionMatriz(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una matriz MxN");
        System.out.println("Introduzca un número para m:");
        int m = leer.nextInt();
        System.out.println("Introduzca un número para n:");
        int n = leer.nextInt();
        if (m > 0 && n > 0){
            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }
}
