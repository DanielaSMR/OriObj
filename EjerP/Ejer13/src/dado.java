public class dado extends sorteo {
    public dado(){

    }

    @Override
    public int lanzar(){
        int s = (int) Math.random()*6 + 1;
        return s;
    }
    
}
