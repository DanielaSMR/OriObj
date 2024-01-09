public class Persona implements PuedeCantar {
    private boolean canta = false;

    public Persona(){

    }

    @Override
    public void PuedeCantar(){
        canta = true;
        System.out.println("Canta: do, re, mi, fa, sol, la, si");
    }
}   
