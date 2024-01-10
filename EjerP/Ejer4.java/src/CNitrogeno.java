public class CNitrogeno extends Congelados{
    private String metodoCongelacion;
    private int tiempoExpo;

    public CNitrogeno(int fechaC, int numLote, int fechaE, String paisO , int temperaturaR, 
    String mC, int tE){
        super(fechaC, numLote, fechaE, paisO, temperaturaR);
        metodoCongelacion = mC;
        tiempoExpo = tE;

    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String mC) {
        this.metodoCongelacion = mC;
    }

    public int getTiempoExpo() {
        return tiempoExpo;
    }

    public void setTiempoExpo(int tE) {
        this.tiempoExpo = tE;
    }

    public String toString(){
        String s = "El metodo de congelado es: " + metodoCongelacion
                    + "El tiempo de exposicion al nitrogeno(s): " + tiempoExpo;
        return (super.toString() + s);
    }
    

}
