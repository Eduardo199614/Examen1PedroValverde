/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pedro;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputadoraView {

    //Declaro las variables
   private String marca;
    private String modelo;
    private int capacidadRAMGB;
    private int capacidadAlmacenamientoGB;
    private boolean tieneSSD;
    private double velocidadProcesadorGHz;

    // Constructores y métodos de la clase, como se indicó anteriormente...

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicito al usuario que ingrese los datos para una Computadora
        System.out.println("Ingrese los datos para la Computadora:");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Capacidad RAM (GB): ");
        int capacidadRAMGB = scanner.nextInt();

        System.out.print("Capacidad de Almacenamiento (GB): ");
        int capacidadAlmacenamientoGB = scanner.nextInt();

        System.out.print("¿Tiene SSD? (true/false): ");
        boolean tieneSSD = scanner.nextBoolean();

        System.out.print("Velocidad del Procesador (GHz): ");
        double velocidadProcesadorGHz = scanner.nextDouble();

        // Creo un objeto Computadora con los datos ingresados
        Compu miComputadora = new Compu(marca, modelo, capacidadRAMGB, capacidadAlmacenamientoGB, tieneSSD, velocidadProcesadorGHz);

        // Metodo mostrar los atributos de la Computadora utilizando el método mostrar
        mostrar(miComputadora);

   
    }

    // Método estático para mostrar todos los atributos de una Computadora
    public static void mostrar(Compu computadora) {
        System.out.println("\nAtributos de la Computadora:");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Capacidad RAM (GB): " + computadora.getCapacidadRAMGB());
        System.out.println("Capacidad de Almacenamiento (GB): " + computadora.getCapacidadAlmacenamientoGB());
        System.out.println("Tiene SSD: " + computadora.isTieneSSD());
        System.out.println("Velocidad del Procesador (GHz): " + computadora.getVelocidadProcesadorGHz());
        
        Scanner scanner = new Scanner(System.in);

        // Solicito al usuario que ingrese dos números para el método1
        System.out.println("Ingrese dos números para el método1:");

        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();

        // Crear una instancia de la clase que implementa la interfaz IPrueba
        IPrueba implementacion = new PruebaImpl();

        try {
            // Llamo al método1 y mostrar el resultado si no ocurre una excepción
            int resultadoMetodo1 = implementacion.metodo1(numero1, numero2);
            System.out.println("Resultado del método1: " + resultadoMetodo1);
        } catch (IllegalArgumentException e) {
            // Manejar la excepción lanzada por el método1
            System.err.println("Error en el método1: " + e.getMessage());
        }

        // Llamo al método2
        implementacion.metodo2();

        // Cerrar el scanner
        scanner.close();
    }
    
    
    }
    


    
    
    
   

