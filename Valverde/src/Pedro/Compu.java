/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedro;

/**
 *
 * @author User
 */
public class Compu {
     private String marca;
    private String modelo;
    private int capacidadRAMGB;
    private int capacidadAlmacenamientoGB;
    private boolean tieneSSD;
    private double velocidadProcesadorGHz;

    public Compu(String marca, String modelo, int capacidadRAMGB, int capacidadAlmacenamientoGB, boolean tieneSSD, double velocidadProcesadorGHz) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadRAMGB = capacidadRAMGB;
        this.capacidadAlmacenamientoGB = capacidadAlmacenamientoGB;
        this.tieneSSD = tieneSSD;
        this.velocidadProcesadorGHz = velocidadProcesadorGHz;
    }

    public Compu() {
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

    public int getCapacidadRAMGB() {
        return capacidadRAMGB;
    }

    public void setCapacidadRAMGB(int capacidadRAMGB) {
        this.capacidadRAMGB = capacidadRAMGB;
    }

    public int getCapacidadAlmacenamientoGB() {
        return capacidadAlmacenamientoGB;
    }

    public void setCapacidadAlmacenamientoGB(int capacidadAlmacenamientoGB) {
        this.capacidadAlmacenamientoGB = capacidadAlmacenamientoGB;
    }

    public boolean isTieneSSD() {
        return tieneSSD;
    }

    public void setTieneSSD(boolean tieneSSD) {
        this.tieneSSD = tieneSSD;
    }

    public double getVelocidadProcesadorGHz() {
        return velocidadProcesadorGHz;
    }

    public void setVelocidadProcesadorGHz(double velocidadProcesadorGHz) {
        this.velocidadProcesadorGHz = velocidadProcesadorGHz;
    }
    
     public static void mostrar(Computadora computadora) {
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Capacidad RAM (GB): " + computadora.getCapacidadRAMGB());
        System.out.println("Capacidad de Almacenamiento (GB): " + computadora.getCapacidadAlmacenamientoGB());
        System.out.println("Tiene SSD: " + computadora.isTieneSSD());
        System.out.println("Velocidad del Procesador (GHz): " + computadora.getVelocidadProcesadorGHz());
    }
}
