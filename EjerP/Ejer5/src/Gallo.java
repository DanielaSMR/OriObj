public class Gallo implements PuedeCantar{
    private boolean canta = false;

    public Gallo(){

    }

    @Override
    public void PuedeCantar(){
        canta = true;
        System.out.println("El gallo canta");
    }
}
