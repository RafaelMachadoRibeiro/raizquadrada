package raizquadradababilonica;
import java.util.Scanner; // Importação do Scanner
public class Raizquadradababilonica {
    public static void main(String[] args) {
        
        // Interação
        String a1 = "Qual número você deseja descobrir a raiz quadrada?";
        String a2 = "Não é possível calcular raíz quadrada de 0 ou de número negativo";
        String a3 = "A raiz quadrada aproximada de ";
        String a4 = "A raiz quadrada exata de ";
        String a5 = " é ";
        
        // Doubles
        double ra; // Double que vai ser a raiz        
        double sub = 0; // Double que auxilia na substituição
        double num = numeroUsuario(a1); // Valor que o usuário digitou 
        
        ra = maisProximo(num); // RA é a função maisProximo
        
        if (num <=0){ // Se o número que o usuário digitar for 0 ou menor que 0
           System.out.println(a2); // Fala que não é possível calcular raíz quadrade de 0 ou de número negativo
        }
        else{
            while((ra * ra) != num){ // Se RA ao quadrado for diferente de num
            ra = (ra + (num/ra))/2; //  Raiz quadrada é raiz mais o valor que o usuário digitou dividio por raiz, dividido por 2
            if(ra == sub){ // Se RA for igual a SUB
                System.out.println(a3 + num + a5 + ra); // vai imprimir o valor aproximado do número que o usuário digitou
                break; // Força o fim do loop
            }
            sub = ra; // Redefine o valor de SUB para o valor de RA
        }
        if((ra * ra) == num){ // Se RA ao quadrado é igual a NUM
            System.out.println(a4 + num + a5 + ra);} // Imprime o valor exato da raiz quadrada que o usuário digitou
        }
    }
   public static double numeroUsuario(String a1){
       Scanner in = new Scanner(System.in); // Importação do Scanner 
       double num; 
       System.out.println(a1); // Pergunta qual número o usuário deseja descobrir a raiz
       num = in.nextDouble(); // O que o usuário digitar no console vai ser o valor de num
       return num; // Vai retornar a função
   }
    public static double maisProximo(double vet){
        double raiz = 1; // Raiz quadrada é igual a 1 no momento
        int aux = 0; // Auxiliar
        for(int i = 0; i < vet; i++){ // Enquanto I form enor que vet, ele vai continuar o loop 
            aux = (i - 1) * (i - 1); // auxiliar é i -1 multiplicado por i -1, ou seja, é calculado aproximação do número
            if((i * i) > vet){ // Se i * i for igual a VET, ele entra na condição
                raiz = aux; // Raiz é igua a auxiliar
                break; // Vai acabarcom o LOOP  ´
            }
        }
        return raiz; // Vai retornar a função
    }
}
