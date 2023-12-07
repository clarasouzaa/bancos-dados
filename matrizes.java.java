import java.util.Scanner;
public class Matrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] produto = new int[5];       
        int[] matrizA = new int[5];
        int[] matrizB = new int[5];
        System.out.println("Preencha a matriz A ");
        for(int i =0; i<5; i++){
            System.out.print("Número: ");
            int numero = entrada.nextInt();
            matrizA[i] = numero;
        }
        System.out.println("Preencha a matriz B ");
        for(int i =0; i<5; i++){
            System.out.print("Número: ");
            int numero = entrada.nextInt();
            matrizB[i] = numero;
        }
        for(int i=0; i<5;i++){
            produto[i] = matrizA[i]*matrizB[i];
        }
        System.out.println("Matriz produto ");
        for(int i=0;i<5;i++){
            System.out.printf("%d ", produto[i]);
        }
        entrada.close();
    }
}
