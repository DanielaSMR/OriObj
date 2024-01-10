public class Main {
    public static void main(String[] args) {
        
        Pez pez1 = new Pez("Carpa", 5);
        Pez pez2 = new Pez("Merluza", 5);
        Pez pez3 = new Pez("Carpa", 2);

        System.out.println(pez1.equals(pez1));
        System.out.println(pez1.equals(pez2));
        System.out.println(pez1.equals(pez3));
        
        System.out.println(pez1.toString());
        System.out.println(pez3.toString());
        


    }
}
