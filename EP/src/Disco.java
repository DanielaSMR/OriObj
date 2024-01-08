public class Disco extends Multimedia{
    private Genero genero;

    public Disco (String titulo, String autor, Formato formato, int duracion, Genero g){
        super(titulo, autor, formato, duracion);
        genero = g;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero g) {
        this.genero = g;
    }

    public String toString(){
        String s = "\nEl genero es: " + genero;
        return (super.toString() + s);
    }
}
