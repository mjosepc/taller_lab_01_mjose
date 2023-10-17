import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas, cols;
        int[][] matriz;
        int opcion;


        do {
            Menu();
            System.out.println("ingrese las dimensiones de la matriz MxN");
            filas = scanner.nextInt();
            cols = scanner.nextInt();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ValidacionMatriz(filas, cols);

                case 2:
                    System.out.println("creacion de la matriz");
                    if (ValidacionMatriz(filas, cols)){
                        matriz = crearmatriz(filas, cols);
                        for (int i = 0; i < filas; i++){
                            for(int j = 0; j < cols; j++){
                                System.out.println(matriz[i][j]);
                            }
                            System.out.println();
                        }
                    }else{
                        System.out.println("las dimensiones no son validas");
                    }
                case 3:
                    System.out.println("la matriz completa");
                    matriz = crearmatriz(filas, cols);
                    llenarMatriz(matriz);

            }

        } while (opcion != 6);
    }

    public static void Menu() {
        System.out.println("Menú:");
        System.out.println("1. Ingresar dimensiones de la matriz");
        System.out.println("2. Crear matriz");
        System.out.println("3. Llenar matriz");
        System.out.println("4. Mostrar fila");
        System.out.println("5. Verificar si la matriz es de TIPO CERO");
        System.out.println("6. Salir");
        System.out.print("Elija una opción: ");

    }

    public static Boolean ValidacionMatriz(int filas, int cols) {
        return filas > 0 && cols > 0;
    }

    public static int[][] crearmatriz(int filas, int cols) {
        if (ValidacionMatriz(filas, cols)) {
            int[][] matriz = new int[filas][cols];
            return matriz;
        } else {
            return null;
        }
    }
    public static void llenarMatriz(int matriz[][]){
        Random random = new Random();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; i < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }
    }
}
