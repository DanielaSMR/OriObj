public class Main {
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro(1, "La rosa de versalles", 1998);

        libro1.prestado();

        System.out.println(libro1.toString());

        Revista revista2 = new Revista(2, "Vogue", 2023, 15);

        System.out.println(revista2.toString());

    }

}
