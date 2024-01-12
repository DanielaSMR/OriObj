
package EjerP.Ejer16.src;
import java.util.Scanner;

public class Conversor {
    private Integer valor;

    public Conversor(Integer valor){
        this.valor = valor;
    }

    public String getNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe que quieres utilizar \n B-Binario \n H-Hexadecimal \n O-Octal");
        String s = sc.nextLine();
        if(s.equals("B")){
            return Integer.toBinaryString(valor);

        }else if(s.equals("H")){
            return Integer.toHexString(valor);

        }else if(s.equals("O")){
            return Integer.toOctalString(valor);
        }else{
            return "Elegiste mal";
        }
    }
}
