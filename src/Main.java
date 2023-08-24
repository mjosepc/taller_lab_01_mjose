import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        menu();
    }
    public static void Menu() {
        Scanner leer = new Scanner(System.in);
        int M , N;
        int [][] matriz;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar dimensiones de la matriz");
            System.out.println("2. Crear matriz");
            System.out.println("3. Llenar matriz");
            System.out.println("4. Mostrar fila");
            System.out.println("5. Verificar si la matriz es de TIPO CERO");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            int opcion = leer.nextInt();

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
    public static void crearmatriz(){
        int[][] matriz = new int [m][n];

    }
}

