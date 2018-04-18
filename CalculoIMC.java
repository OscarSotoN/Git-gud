

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
        
        if (imc>30) {
        System.out.println("Su imc es mayor a 30 por lo tanto tiene obesidad");
        } else {
            if(imc<25 && imc>30){
                System.out.println("Su imc esta entre 25 y 30 por lo tanto tiene sobrepeso");
            }
            

        }
        
        
            
            
    }
    
}
