/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andref45
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
        
    double cantidad_requerida;
    double precio_unitario;
    double costoTotal;
    double porcentaje = 15;
    double descuento;
    String nombre_articulo; 
    
    System.out.println("Ingrese el nombre del artículo");
    nombre_articulo = entrada.nextLine();
    
    System.out.println("Ingrese la cantidad requerida");
    cantidad_requerida = entrada.nextDouble();
    
    System.out.println("Ingrese el precio unitario");
    precio_unitario = entrada.nextDouble();
    
    costoTotal = cantidad_requerida * precio_unitario;
    
    if (cantidad_requerida >50 ) {
        descuento = (porcentaje * costoTotal)/100;
        costoTotal = costoTotal - descuento;
        
    }
    System.out.printf("El valor total: %.2f pertenece al artículo: %s\n",
            costoTotal, nombre_articulo);
    }
    
}
