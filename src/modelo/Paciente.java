/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.util.Date;

/**
 *
 * @author pedro
 */
public class Paciente {

    
    private int id;
    private String nombre;
    private String dni;
    private String celular;
    private double p_actual;
    private boolean activo;
    private Date fechaNac;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String dni, String celular, double p_actual, boolean activo,Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.p_actual = p_actual;
        this.activo = activo;
        this.fechaNac = fechaNac;
    }

    
    public Paciente(String nombre, String dni, String celular, double p_actual, boolean activo,Date fechaNac) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.p_actual = p_actual;
        this.activo = activo;
        this.fechaNac = fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getP_actual() {
        return p_actual;
    }

    public void setP_actual(double p_actual) {
        this.p_actual = p_actual;
    }
    
    
}
