public class Pelicula extends Multimedia{
    private String actorP;
    private String actrizP;

    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz){
        super(titulo, autor, formato, duracion);
        if(actor == null && actriz == null){
            throw new IllegalArgumentException("Ambos atributos" + "no pueden estar vacios");
        }
        actorP = actor;
        actrizP = actriz;
    }
    
    public String getActorP() {
        return actorP;
    }

    public void setActorP(String a) {
        this.actorP = a;
    }

    public String getActrizP() {
        return actrizP;
    }

    public void setActrizP(String a) {
        this.actrizP = a;
    }

    public String toString(){
        String s = "\nProtagonizado por: ";

        if (actrizP != null){
            s += actrizP;
            if (actorP != null)
                s += " y " + actorP;
        }
        else {
            assert actorP != null;
            s += actorP;
        }
        return (super.toString() + s);
    }
}