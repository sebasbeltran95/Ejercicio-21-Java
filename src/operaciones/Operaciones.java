package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     double radio, volumen;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Porfavor ingrese el radio de la esfera");
     radio = in.nextDouble();
     
     System.out.println("volumen de la esfera de radio: " + radio + " = " + (4.0/3) * Math.PI * Math.pow(radio,3));
     

    }
}
