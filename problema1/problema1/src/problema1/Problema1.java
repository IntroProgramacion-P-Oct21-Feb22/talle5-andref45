/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andref45
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoKilovatio;
        double valorconsumidos;
        int edad; 
        double descuento;
        double porcentaje; 
        double valorTotal;
        
        porcentaje = 10;
        
        System.out.println("Ingrese el costo por kilovatio");
        costoKilovatio = entrada.nextDouble();
        
        System.out.println("Ingrese el número de kilovatios consumidos");
        valorconsumidos = entrada.nextDouble();
        
        System.out.println ("Ingrese su edad");
        edad = entrada.nextInt();
        
        valorTotal = costoKilovatio * valorconsumidos; 
        if (edad > 65){
            descuento = (porcentaje * valorTotal)/100;
            valorTotal = valorTotal - descuento;
        }
        System.out.printf("El valor total a pagar es: %.2f/n", valorTotal);
    }
    
}
