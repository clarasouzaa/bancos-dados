import java.util.Scanner;
public class Pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contPar =0;
        int contImpar = 0; 
        int[] numeros = new int[20];       
        int[] pares = new int[20];
        int[] impares = new int[20];
        for(int i =0; i<20; i++){
            System.out.print("Número: ");
            int numero = entrada.nextInt();
            numeros[i] = numero;
            if(numeros[i] % 2 == 0){
                pares[contPar] = numeros[i];
                contPar++;
            }
            else{
                impares[contImpar]= numeros[i];
                contImpar++;
            }
        }
        
        entrada.close();
        System.out.println("Pares: " + contPar + "\nImpar: " + contImpar);
        
        System.out.print("Vetor preenchido: ");
        for(int i =0; i<20;i++){
            System.out.printf("%d " , numeros[i]);
        }

        System.out.print("\nPares: ");
        for(int i =0; i<contPar;i++){
            System.out.printf("%d ", pares[i]);
        }

        System.out.print("\nÍmpares: ");
        for(int i=0; i<contImpar;i++){
            System.out.printf("%d ", impares[i]);
            
        }
    }
}
