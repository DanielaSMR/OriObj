public class moneda extends sorteo{
    public moneda(){

    }

    @Override
    public int lanzar(){
        int s = (int) Math.random()*2;
        if(s == 1){
            System.out.println("cara");
        }else{
            System.out.println("cruz");
        }
        return 0;
    }
}
