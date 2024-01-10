public class Aves implements PuedeCaminar, PuedeVolar {

    public Aves(){

    }

    @Override
    public void caminar(){
        System.out.println("El ave puede caminar");
    }

    @Override
    public void volar(){
        System.out.println("El ave puede volar");
    }
    
}
