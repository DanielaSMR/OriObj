package EjerP.Ejer17.src;

import java.util.Scanner;

public class Cifra {
    private Integer num;
    
    public Cifra(Integer num){
        this.num = num;
        if(num == 0) num++;
            Integer s = (int) Math.floor(Math.log10(Math.abs(num)) + 1);
            int a = 10*s;
        /*for(int x = 0; x < a;){
            
        }
        int a = num/10;
        int b = num*a;
        int c = a/10;*/
    }


}
