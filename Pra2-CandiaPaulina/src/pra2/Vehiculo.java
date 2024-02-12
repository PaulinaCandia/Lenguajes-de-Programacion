/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra2;

/**
 *
 * @author Nova
 */
public class Vehiculo{
    //Atributos
    String patente;
    private String marca;
    private String modelo;
    private int velocidad;
    private int marcha;
    private int velocidadMax;
    private int marchaMax;
    Conductor conductor;
    
    //Default constructor
    public Vehiculo() {
        this.velocidad = 0;
        this.marcha = 0;
        this.velocidadMax = 140;
        this.marchaMax = 5;
        this.conductor = new Conductor();
    }
    //Constructor
    public Vehiculo(int velocidadMax, int marchaMax, String patente, String marca, String modelo) {
        this.velocidadMax = velocidadMax;
        this.marchaMax = marchaMax;
        this.modelo = modelo;
        this.patente = patente;
        this.marca = marca;
        this.conductor = new Conductor();
    }
    
    public void acelerar() {
        if (this.marcha != 0) {
            int nuevaVelocidad = this.velocidad + 10;
            if (nuevaVelocidad <= this.velocidadMax) {
                this.velocidad = nuevaVelocidad;
            } else {
                this.velocidad = this.velocidadMax;
            }
        }

    }
    
    public void frenar() {
        int nuevaVelocidad = this.velocidad - 5;
        if (nuevaVelocidad > 0) {
            this.velocidad = nuevaVelocidad;
        } else {
            this.velocidad = 0;
        }
    }
    
    public void subirMarcha() {
        if (this.marcha < this.marchaMax) {
            this.marcha++;
        }
    }
    
    public void bajarMarcha() {
        if (this.marcha > -1) {
            this.marcha--;
        }
    }
    
    public void ponerMarcha(int marcha) {
        if (marcha >= -1 && marcha <= this.marchaMax) {
            this.marcha = marcha;
        }
    }
    // Revisar
    public String getMarchaString() {
        switch (this.marcha) {
            case -1:
                return "Reversa";
            case 0:
                return "Neutro";
            case 1:
                return "Primera";
            case 2:
                return "Segunda";
            case 3:
                return "Tercera";
            case 4:
                return "Cuarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            default:
                return "Error";
        }
    }
    public String getInfo() {
        return "\n\n Marca del Vehiculo: " + this.marca + " Modelo Vehiculo: " + this.modelo + " patente: " + this.patente
                + "\nVelocidad: " + this.velocidad + " km/hr  Marcha: " + this.getMarchaString()+"";
    }
    //Revisar
    
    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", marcha=" + marcha + ", velocidadMax=" + velocidadMax + ", marchaMax=" + marchaMax + ", conductor=" + conductor + '}';
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getMarchaMax() {
        return marchaMax;
    }

    public void setMarchaMax(int marchaMax) {
        this.marchaMax = marchaMax;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    
}
