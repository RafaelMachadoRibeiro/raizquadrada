package raizquadradababilonica;
import java.util.Scanner;
public class Raizquadradababilonica {
    public static void main(String[] args) {
        String texto = "Qual numero vc que saber a raiz quadrada?";
        double ra;// Raiz        
        double sub = 0; // double auxiliar de substituição
        double num = numeroUsuario(texto); // numero que o usuario deu 
        ra = maisProximo(num); // chamando a função numero mais proximo
        
        if (num <=0){
           System.out.println("Não é possível calcular raíz quadrada de 0 ou de número negativo");
       }else{
        
        while((ra * ra) != num){
            ra = (ra + (num/ra))/2;
            if(ra == sub){
                System.out.println("A raiz quadrada aproximada de " + num + " é " + ra);
                break;
            }
            sub = ra;
        }
        if((ra * ra) == num){
            System.out.println("A raiz quadrada exata de " + num + " é " + ra);
        }
        }
    }
   public static double numeroUsuario(String texto){
       Scanner in = new Scanner(System.in);
       double num;
       System.out.println(texto);
       num = in.nextDouble();
       
       return num;
       
   }
    public static double maisProximo(double vet){
        double raiz = 1;
        int aux = 0;
        for(int i = 0; i < vet; i++){
            aux = (i - 1) * (i - 1);
            if((i * i) > vet){
                raiz = aux;
                break;
            }
        }
        return raiz;
    }
}

