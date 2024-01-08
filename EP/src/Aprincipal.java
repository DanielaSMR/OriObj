public class Aprincipal {
    public static void main(String[] args) {
        Formato mp3 = Formato.mp3;
        Formato mpg = Formato.mpg;

        Pelicula pelicula1 = new Pelicula("Pelicula1", "Actor1", mp3, 1, "Marcos G", null);
        Pelicula pelicula2 = new Pelicula("Pelicula2", "Actor2", mpg, 2, null, "Marta D");
        Pelicula pelicula3 = new Pelicula("Pelicula2", "Actor2", mpg, 2, "Brad Pitt", null);

        System.out.println(pelicula1.equals(pelicula2));
        System.out.println(pelicula2.equals(pelicula3));
        System.out.println(pelicula3.equals(pelicula1));

        System.out.println(pelicula1.toString());
        System.out.println(pelicula2.toString());
        System.out.println(pelicula3.toString());

        Genero rock = Genero.rock;
        Genero pop = Genero.pop;

        Disco disco1 = new Disco("Disco1", "autor1", mpg, 2, rock);
        Disco disco2 = new Disco("Disco2", "autor2", mp3, 3, pop);
        Disco disco3 = new Disco("Disco2", "autor2", mpg, 1, rock);

        System.out.println(disco1.equals(disco3));
        System.out.println(disco2.equals(disco1));
        System.out.println(disco3.equals(disco2));

        System.out.println(disco1.toString());
        System.out.println(disco2.toString());
        System.out.println(disco3.toString());

        
    }
}