/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

import java.util.Date;


public class CPersonaVieja implements PersonaVieja {
    private String nombre;
    private String apellido;
    private Date fechadeNacimiento;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Date getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    @Override
    public void setFechadeNacimiento(Date fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }
    
    
    
}
