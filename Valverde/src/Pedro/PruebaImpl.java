/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedro;

/**
 *
 * @author User
 */
public class PruebaImpl implements IPrueba {
    
    @Override
     public int metodo1(int prueba1, int prueba2) {
        // Implementación del método1
        return prueba1 + prueba2;
    }

    @Override
    public void metodo2() {
        // Implementación del método2
        System.out.println("El metodo fue ejecutado con satisfacion");
    }
}
