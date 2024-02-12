/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra2;

/**
 *
 * @author Nova
 */
public class Conductor {
    //Atributos
    private String rut;
    private String nombre;
    private String apellido;
    private char licencia;
    
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getLicencia() {
        return licencia;
    }

    public void setLicencia(char licencia) {
        this.licencia = licencia;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Conductor{" + "\nRut=" + rut + "\nNombre=" + nombre + "\nApellido=" + apellido + "\nLicencia=" + licencia + '}';
    }
}
