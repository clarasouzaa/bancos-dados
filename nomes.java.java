/**
 Faça um programa em Java que Leia um vetor com 10 nomes de pessoas, após peça
que o usuário digite um nome de pessoa que deve ser buscado no vetor. Se o nome
buscado for encontrado no vetor mostre a mensagem “ACHEI”, se o nome não
estiver armazenado no vetor exiba a menssagem “NÃO ACHEI”.
 */
import java.util.*; 
public class Nomes {
public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int indice = 0;
       String busca;
       boolean flag = false;
       String[] nomes = new String[10];
       System.out.println("Informe os nomes: ");
       for(int i =0; i<10;i++){
              nomes[i] = entrada.nextLine();
       }
       System.out.println("Buscar nome: ");
       busca = entrada.nextLine();
       for(int i =0; i<10;i++){
              if(busca.contains(nomes[i])){
                     flag = true;
                     indice = i;
              }  
       }
       if(flag)
              System.out.println("Achei: " + indice);
       else
              System.out.println("Não achei");      

}
    
}
