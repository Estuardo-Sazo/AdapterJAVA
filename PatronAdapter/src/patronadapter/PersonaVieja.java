
package patronadapter;

import java.util.Date;

/**
 *
 * @author Jaime Sazo
 */
public interface PersonaVieja {
    public String getNombre();
    public void setNombre(String nombre);
    public String getApellido();
    public void setApellido(String apellido);
    public Date getFechadeNacimiento();
    public void setFechadeNacimiento(Date fechadeNacimieto);
    
}
