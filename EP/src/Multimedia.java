import java.text.Normalizer.Form;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public Multimedia (String t, String a,  Formato f, int d){
        titulo = t;
        autor = a;
        formato = f;
        duracion = d;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato f) {
        this.formato = f;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int d) {
        this.duracion = d;
    }

    public String toString(){
        return ("Titulo: " + titulo
                    + "\nAutor: " + autor
                    + "\nFormato: " + formato
                    + "\nDuracion: " + duracion);
    }

    public boolean equals (Multimedia m){
        if (titulo.equals(m.getTitulo()) && autor.equals(m.getAutor()))
            return true;
        return false;
    }

}