/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio1;
import java.util.Scanner;

/**
 *
 * @author rjl01
 */
public class Lopez_Roberto_Cuotas {
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in).useDelimiter("\n");  
    
        System.out.println("ingresar su nombre ");
        String Nombre=lea.next();
        System.out.println("ingresar el monto del prestamo: ");
        double Prestamo=lea.nextDouble();
        System.out.println("ingresar plazos a pagar: ");
        int Plazos=lea.nextInt();
        System.out.println("ingresar el interes establecido: ");
        double Interes=lea.nextDouble();
        System.out.println("ingresar la comision por cuota: ");
        double Comision=lea.nextDouble();
        System.out.println("ingrsar el porcentaje de seguro mensual aplicado a la cuota: ");
        double Seguro=lea.nextDouble();
        
        double InteresMensual=Prestamo*Interes;
        double SeguroMensual=Seguro*Prestamo;
        double CuotaMensual=(Prestamo/Plazos)+Interes+Comision+Seguro;
        double TotalPagar=CuotaMensual*Plazos;
        
        
       
        System.out.println("***** Cuotas Mensuales *****");
        System.out.println("Cuota de Pago Mensual: "+CuotaMensual+
                           "\nTotal a pagar: "+TotalPagar+"Lps.");
        System.out.println("***** ***** ***** ***** *****");
        
    }
    
}
