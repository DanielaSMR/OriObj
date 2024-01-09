public class Refrigerados extends Comun {
    private int codSupervision;
    private int temperaturaR;

    public Refrigerados(int fechaC, int numLote, int fechaE, String paisO ,int cS, int tR){
        super(fechaC, numLote, fechaE, paisO);
        codSupervision = cS;
        temperaturaR = tR;

    }

    public int getCodSupervision() {
        return codSupervision;
    }

    public void setCodSupervision(int cS) {
        this.codSupervision = cS;
    }

    public int getTemperaturaR() {
        return temperaturaR;
    }

    public void setTemperaturaR(int tR) {
        this.temperaturaR = tR;
    }

}
