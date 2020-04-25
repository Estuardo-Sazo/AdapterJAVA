
package patronadapter;

import java.util.GregorianCalendar;

/**
 *
 * @author Jaime Sazo
 */
public class AdapterVieja_Nueva implements PersonaNueva{
    private PersonaVieja personaV; //Lamar interfaz

    public AdapterVieja_Nueva(PersonaVieja personaV) {
        this.personaV = personaV;
    }

        
    @Override
    public String getNombre() {
        return personaV.getNombre() + " "+ personaV.getApellido();
    }

    @Override
    public void setNombre(String nombreCompleto) {
        String[] name =nombreCompleto.split(" ");
        String nombre=name[0];
        String apelllido=name[1];
        personaV.setNombre(nombre);
        personaV.setApellido(apelllido);
  }

    @Override
    public int getEdad() {
        GregorianCalendar c= new GregorianCalendar();
        GregorianCalendar c2= new GregorianCalendar();
        c2.setTime(personaV.getFechadeNacimiento());
        
        return c.get(1) - c2.get(1);
        
    }

    @Override
    public void setEdad(int edad) {
        GregorianCalendar c= new GregorianCalendar();
        int anioActual = c.get(1);
        c.set(1,anioActual-edad);
        personaV.setFechadeNacimiento(c.getTime());
    }
    
}
