public class Congelados extends Comun{
    private int temperaturaR;

    public Congelados(int fechaC, int numLote, int fechaE, String paisO , int tR){
        super(fechaC, numLote, fechaE, paisO);
        temperaturaR = tR;

    }

    public int getTemperaturaR() {
        return temperaturaR;
    }

    public void setTemperaturaR(int tR) {
        this.temperaturaR = tR;
    }

    public String toString(){
        String s = "La temperatura recomendada: " + temperaturaR;
        return (super.toString() + s);
    }

}
