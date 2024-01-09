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
    public void prestado() {
        if(prestado == true){
            System.out.println("Esta prestado");
        }else{
            System.out.println("No esta prestado");
        }
        
    }

    public String toString(){
        String s = "\nEs prestado? " + prestado;
        return (super.toString() + s);

    }

}
