
package tratamentos;
import java.util.Scanner;

public class Tratamentos {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       try{
        System.out.println("Digite um Numerador");
        int num1 = teclado.nextInt();
        System.out.println("Digite um Denominador");        
        int num2 = teclado.nextInt();
        
        double result = num1 / num2;
        System.out.println("Resultdo " + result);
        }
       
       catch(Exception erro){
           System.out.println("----Erro----");   
        }
        
    }
    
}
