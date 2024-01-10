public class CAire extends Congelados {
    private int nitrogeno;
    private int oxigeno;
    private int dioxidoC;
    private int vaporA;

    public CAire(int fechaC, int numLote, int fechaE, String paisO , int temperaturaR, 
    int n, int o, int dC, int vA){
        super(fechaC, numLote, fechaE, paisO, temperaturaR);
        nitrogeno = n;
        oxigeno = o;
        dioxidoC = dC;
        vaporA = vA;

    }

    public int getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getDioxidoC() {
        return dioxidoC;
    }

    public void setDioxidoC(int dioxidoC) {
        this.dioxidoC = dioxidoC;
    }

    public int getVaporA() {
        return vaporA;
    }

    public void setVaporA(int vaporA) {
        this.vaporA = vaporA;
    }

    public String toString(){
        String s = "% de Nitrogeno: " + nitrogeno
                    + "% de Oxigeno: " + oxigeno
                    + "% de Dioxido de Carbono: " + dioxidoC
                    + "% de Vapor de Agua: " + vaporA;
        return (super.toString() + s);
    }


}
