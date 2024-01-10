/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedro;

/**
 *
 * @author User
 */
public class Portatil extends Computadora {
    // Nuevo atributo específico para la clase Portatil
    private int bateria;

    // Constructor que llama al constructor de la clase base (Computadora)
    public Portatil(String marca, String modelo, int capacidadRAMGB, int capacidadAlmacenamientoGB,
                    boolean tieneSSD, double velocidadProcesadorGHz, int bateria) {
        super(marca, modelo, capacidadRAMGB, capacidadAlmacenamientoGB, tieneSSD, velocidadProcesadorGHz);
        this.bateria = bateria;
    }

    // Constructor adicional sin parámetros
    public Portatil() {
        // Llamada al constructor sin parámetros de la clase base
        super("", "", 0, 0, false, 0.0);
        this.bateria = 0;
    }

    // Métodos getter y setter para el atributo bateria
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

}