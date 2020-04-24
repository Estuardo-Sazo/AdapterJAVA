
package patronadapter;

import java.util.Date;
import java.util.GregorianCalendar;

public class PatronAdapter {

    public static void main(String[] args) {
        CPersonaVieja personaV= new CPersonaVieja();
        personaV.setNombre("Jaime");
        personaV.setApellido("Sazo");
        
        GregorianCalendar gC= new GregorianCalendar();
        gC.set(1996, 06, 12);
        Date d=gC.getTime();
        
        personaV.setFechadeNacimiento(d);
        
        //-------
        
        AdapterVieja_Nueva personaN=new  AdapterVieja_Nueva(personaV);
        
        System.out.println("NOMBRE: "+personaN.getNombre());
        System.out.println("EDAD: "+personaN.getEdad());
        
        personaN.setEdad(22);
        personaN.setNombre("Sergio Perez");
        
        System.out.println("NOMBRE: "+personaN.getNombre());
        System.out.println("EDAD: "+personaN.getEdad());
    }
    
}
