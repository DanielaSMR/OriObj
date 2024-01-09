public class Libro extends Publicacion implements Prestable{
    private boolean prestado = false;

    public Libro(int codigo, String titulo, int anoP){
        super(codigo, titulo, anoP);

    }
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void presta() {
        prestado = true;
        
    }

    @Override
    public void devolver() {
        prestado = false;
        
    }

    @Override
    public boolean prestado() {
        return prestado;
        
    }

    public String toString(){
        String s = "\nEs prestado? " + prestado;
        return (super.toString() + s);

    }

}
