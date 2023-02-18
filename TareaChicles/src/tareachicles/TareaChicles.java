package tareachicles;
import java.util.Scanner;
public class TareaChicles 
{
    
    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        int chicles;
        int gana;
        int compra;
        int cantInicial;
        int suma = 0;
        System.out.print("ingrese la cantidad de chicles que debe comprar:");
        chicles = Scan.nextInt();
        System.out.print("ingrese la cantidad de chicles que se gana por la promocion:");
        gana = Scan.nextInt();
        System.out.print("ingrese la cantidad de chicles que compro Tico:");
        compra = Scan.nextInt();
        cantInicial = compra;
        while (compra % chicles != 0)
        {
            suma = suma + gana;
            compra = compra/chicles;
        }
        System.out.print("Tico consiguio al final "+suma+" chicles ademas de los "+cantInicial+" que compro");
    }
    
}
