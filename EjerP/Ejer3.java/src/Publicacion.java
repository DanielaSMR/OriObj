public class Publicacion {
    
    private String titulo;
    private int codigo;
    private int anoP;

    public Publicacion(int c, String t, int aP){
        codigo = c;
        titulo = t;
        anoP = aP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int c) {
        this.codigo = c;
    }

    public int getAnoP() {
        return anoP;
    }

    public void setAnoP(int aP) {
        this.anoP = aP;
    }

    public String toString(){
        String s = "Titulo: " + titulo + "\nCodigo: " + codigo + "\nAño de Publicacion: " + anoP;
        return s;
    }
}
