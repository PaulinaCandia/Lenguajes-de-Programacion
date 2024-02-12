/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Nova
 */
public class Vehiculo{
    //Atributos
    private String patente;
    private String marca;
    private String modelo;
    private Conductor conductor;
    private Estado estado;
    private int kilometraje;


    //Default constructor
    public Vehiculo() {
        this.kilometraje = 0;
        this.conductor = new Conductor();
    }
    //Constructor
    public Vehiculo(int velocidadMax, int marchaMax, String patente, String marca, String modelo) {
        this.modelo = modelo;
        this.patente = patente;
        this.marca = marca;
        this.conductor = new Conductor();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
    
}
