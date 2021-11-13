/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andref45
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Elaborar una solución que permita leer los datos de un automóvil 
        (marca, origen y costo) imprima el impuesto por pagar y el precio de 
        venta (incluido el impuesto). Si el origen es Alemania el impuesto es 
        20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es 
        de USA, 8%
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double imp_pagar;
        double descuento = 0;
        double descuento1;
        double descuento2;
        double descuento3;
        double descuento4;
        double porcentaje1 = 20;
        double porcentaje2 = 30;
        double porcentaje3 = 15;
        double porcentaje4 = 8;
        double precio_venta;

        System.out.println("Ingrese la marca del automóvil");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen del automóvil");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();

        imp_pagar = descuento;
        precio_venta = costo - imp_pagar;

        if (origen.equals("Alemania")) {
            descuento1 = (costo * porcentaje1) / 100;
            descuento = descuento1;
            precio_venta = costo - descuento;
            System.out.printf("El impuesto a pagar es: %.2f y su precio de "
                    + "venta es:%.2f\n", descuento, precio_venta);
        } else {
            if (origen.equals("Japón")) {
                descuento2 = (costo * porcentaje2) / 100;
                descuento = descuento2;
                precio_venta = costo - descuento;
                System.out.printf("El impuesto a pagar es: %.2f y su precio "
                        + "de venta "
                        + "es:%.2f\n", imp_pagar, precio_venta);
            } else {
                if (origen.equals("Italia")) {
                    descuento3 = (costo * porcentaje3) / 100;
                    descuento = descuento3;
                    precio_venta = costo - descuento;
                    System.out.printf("El impuesto a pagar es: %.2f y su "
                            + "precio de venta "
                            + "es:%.2f\n", imp_pagar, precio_venta);
                } else {
                    if (origen.equals("USA")) {
                        descuento4 = (costo * porcentaje4) / 100;
                        descuento = descuento4;
                        precio_venta = costo - descuento;
                        System.out.printf("El impuesto a pagar es: %.2f y "
                                + "su precio de venta "
                                + "es:%.2f\n", imp_pagar, precio_venta);
                    }
                }

            }

        }

    }
}
