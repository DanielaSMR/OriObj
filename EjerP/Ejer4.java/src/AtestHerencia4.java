public class AtestHerencia4 {
    public static void main(String[] args) {
        Fresco pescado1 = new Fresco(0, 1, 2023, "España");
        Fresco pescado2 = new Fresco(0, 2, 2005, "Japon");

        System.out.println(pescado1.toString());
        System.out.println(pescado2.toString());

        Refrigerados pescado3 = new Refrigerados(0, 3, 0, "España", 5, -3);
        Refrigerados pescado4 = new Refrigerados(0, 4, 0, "España", 5, -3);
        Refrigerados pescado5 = new Refrigerados(0, 5, 0, "España", 5, -3);

        System.out.println(pescado3.toString());
        System.out.println(pescado4.toString());
        System.out.println(pescado5.toString());

        CAgua agua1 = new CAgua(0, 0, 0, null, 0, 0);
        CAgua agua2 = new CAgua(0, 1, 0, null, 0, 0);
        CAire aire1 = new CAire(0, 2, 0, null, 0, 0, 0, 0, 0);
        CAire aire2 = new CAire(0, 3, 0, null, 0, 0, 0, 0, 0);
        CNitrogeno nitrogeno1 = new CNitrogeno(0, 0, 4, null, 0, null, 0);

        System.out.println(agua1.toString());
        System.out.println(agua2.toString());
        System.out.println(aire1.toString());
        System.out.println(aire2.toString());
        System.out.println(nitrogeno1.toString());
    }
}
