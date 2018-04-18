

package calculo.imc;
import java.util.Scanner;

public class CalculoIMC {

  
    public static void main(String[] args) {
        
        System.out.println("Ingrese su peso en kilogramos");
        Scanner sc = new Scanner(System.in);
        float peso = sc.nextFloat();
        System.out.println("Ingrese su altura en metros");
        float altura = sc.nextFloat();
        
        
        float imc = peso/(altura*altura);
        System.out.println(imc);
        
        
            
            
    }
    
}
