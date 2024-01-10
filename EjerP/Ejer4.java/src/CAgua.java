public class CAgua extends Congelados{
    private int gramosSal;
    public CAgua(int fechaC, int numLote, int fechaE, String paisO , int temperaturaR, 
    int gS) {
        super(fechaC, numLote, fechaE, paisO, temperaturaR);
        gramosSal = gS;

    }
    public int getGramosSal() {
        return gramosSal;
    }
    public void setGramosSal(int gramosSal) {
        this.gramosSal = gramosSal;
    }

    public String toString(){
        String s = "Cantidad de gramos de sal por litro de agua: " + gramosSal;
        return (super.toString() + s);
    }
}
