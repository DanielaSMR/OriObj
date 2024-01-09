public class Comun {
    private int fechaC;
    private int numLote;
    private int fechaE;
    private String paisO;

    public Comun(int fC, int nL, int fE, String pO){
        fechaC = fC;
        numLote = nL;
        fechaE = fE;
        paisO = pO;
    }

    public int getFechaC() {
        return fechaC;
    }

    public void setFechaC(int fC) {
        this.fechaC = fC;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int nL) {
        this.numLote = nL;
    }

    public int getFechaE() {
        return fechaE;
    }

    public void setFechaE(int fE) {
        this.fechaE = fE;
    }

    public String getPaisO() {
        return paisO;
    }

    public void setPaisO(String paisO) {
        this.paisO = paisO;
    }

    
    
    
}
