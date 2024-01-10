public class Pez {
    private String nombre;
    private int numPeces;

    public Pez(String nombre, int numPeces){
        this.nombre = nombre;
        this.numPeces = numPeces;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPeces() {
        return numPeces;
    }

    public void setNumPeces(int numPeces) {
        this.numPeces = numPeces;
    }

    //Copia
    public Pez (Pez r) {
        if(r != null) {
           this.numPeces= r.numPeces;
           this.nombre = r.nombre;
        }
    }

    public String equals (Pez m){
        if (nombre.equals(m.getNombre()) && numPeces == m.getNumPeces()){
            return "El nombre y el numeros de peces es el mismo";
        } else if(nombre.equals(m.getNombre())){
            return "El nombre es el mismo";
        }else if(numPeces == m.getNumPeces()){
            return "El numero de peces es el mismo";
        }
            return "No tienen nada en comun";
    }

    public String toString(){
        String s = "El numero de peces de " + nombre + " : " + numPeces;
        return s;
    }
}
