public class Canario implements PuedeCantar {
    private boolean canta = false;

    public Canario(){

    }

    @Override
    public void PuedeCantar(){
        canta = true;
        System.out.println("El canario canta");
    }
}
