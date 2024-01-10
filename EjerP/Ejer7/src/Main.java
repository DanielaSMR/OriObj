public class Main {
    public static void main(String[] args) {
        
        Pez pez1 = new Pez("Carpa", 5);
        Pez pez2 = new Pez("Merluza", 5);
        Pez pez4 = new Pez(pez1);

        System.out.println(pez1.equals(pez1));
        System.out.println(pez1.equals(pez2));
        System.out.println(pez1.equals(pez4));
        
        System.out.println(pez1.toString());
        System.out.println(pez4.toString());
        


    }
}
