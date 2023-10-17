import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas, cols;
        int[][] matriz;
        int opcion;
        int filamostrar;

        System.out.println("ingrese las dimensiones de la matriz MxN");
        System.out.println("ingrese las dimensiones de M");
        filas = scanner.nextInt();
        System.out.println("ingrese las dimensiones de N");
        cols = scanner.nextInt();

        do {

            Menu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("validacion de las dimensiones: "+ ValidacionMatriz(filas, cols));
                    break;

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
                    break;
                case 3:
                    System.out.println("la matriz completa");
                    matriz = crearmatriz(filas, cols);
                    llenarMatriz(matriz);
                    break;
                case 4:
                    System.out.println("ingrese el numero de fila que quiere mostrar");
                    matriz = crearmatriz(filas, cols);
                    llenarMatriz(matriz);
                    filamostrar = scanner.nextInt();
                    mostrarFila(matriz, filamostrar);
                    break;

                case 5:
                    System.out.println("verifique si la matriz es de tipo 0");
                    matriz = crearmatriz(filas, cols);
                    llenarMatriz(matriz);
                    matrizCero(matriz);
                    break;

                case 6:
                    System.out.println("saliendo del menu");
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }

        } while (opcion != 6);
    }

    public static void Menu() {
        System.out.println("Menú:");
        System.out.println("1. Validacion de las dimensiones");
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
    public static void mostrarFila(int matriz[][], int fila){
        if (fila >=0 && fila < matriz.length){
            System.out.println("fila " + fila + ":");
            for (int j = 0; j < matriz[fila].length; j++){
                System.out.println(matriz[fila][j] + " ");
            }
            System.out.println();
        }else {
            System.out.println("fila no valida");
        }
    }
    public static Boolean matrizCero(int matriz[][]){
        int toltaElementos = matriz.length * matriz[0].length;
        int cero = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == 0){
                    cero++;
                }
            }
        }
        double porcentaje = (double) cero / toltaElementos * 100;
        return porcentaje > 50;
    }
}
