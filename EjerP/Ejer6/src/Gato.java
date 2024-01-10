public class Gato implements PuedeCaminar, PuedeNadar{
    
    public Gato(){

    }

    @Override
    public void caminar(){
        System.out.println("El gato CAMINA");
    }

    @Override
    public void nadar(){
        System.out.println("El gato NADA");
    }

}
