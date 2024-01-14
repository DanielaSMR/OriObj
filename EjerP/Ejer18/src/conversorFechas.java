package EjerP.Ejer18.src;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class conversorFechas {
    private String fecha;

    public conversorFechas(String fecha){
        this.fecha = fecha;
    }

    public String normaltoAmericano(){
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
        String fechaString = fecha.toString(); 
        return format2.format(fecha);
    }

    public String americanotoNormal(){
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = fecha.toString(); 
        return fechaString;
    }

}
