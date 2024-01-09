public class Revista extends Publicacion{

    private int numero;

    public Revista(int codigo, String titulo, int anoP, int num){
        super(codigo, titulo, anoP);
        numero = num;
    }   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public String toString(){
        String s = "\nEl numero es: " + numero;
        return (super.toString() + s);
    }
    
    
}
