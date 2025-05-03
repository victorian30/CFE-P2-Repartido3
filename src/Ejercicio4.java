
public class Ejercicio4 {
    public static void main(String[] args) {
        int [][] matriz = {
                {2, 5, 4},
                {3, 7, 6},
                {8, 1, 9}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;

            System.out.print("[");

            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                sumaFila += matriz[i][j];
                System.out.print(" ");
            }
            System.out.println("] Suma fila " + (i+1) + ": " + sumaFila);
        }

    }
}
