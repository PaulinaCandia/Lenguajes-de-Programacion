/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import Class.Estado;
import Class.Flota;

/**
 *
 * @author Nova
 */
public class Flota {
    private ArrayList<Vehiculo> vehiculos;
    
    //Default constructor
    public Flota() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void add(Vehiculo vehiculo) {
        
    }
    
    public ArrayList<Vehiculo> getAll(){
        return vehiculos;
    }
    
    public Vehiculo getVehiculo(String patente) {
        return null;
    }

    public ArrayList<Vehiculo> getVehiculosByEstado(Estado estado) {
        return vehiculos;
    }
    
}
