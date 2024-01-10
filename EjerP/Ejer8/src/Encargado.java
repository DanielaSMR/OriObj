public class Encargado extends Empleado{
    
    public Encargado(Integer sueldo){
        super(sueldo);
    }

    Integer getSueldo(){
        return (super.getSueldo()) * 110/100;
    }
}
