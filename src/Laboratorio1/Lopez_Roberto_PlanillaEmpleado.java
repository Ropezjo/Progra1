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
public class Lopez_Roberto_PlanillaEmpleado {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre completo: ");
        String nombre=lea.next();
        
        System.out.println("Ingrese las horas laboradas en el mes: ");
        double Horas=lea.nextDouble();
        System.out.println("Ingrese la tarifa por hora: ");
        double Tarifa=lea.nextDouble();

        double SalarioMensual= Horas*Tarifa;
        int SemanasEnMes=4;
        double SalarioSemanal= SalarioMensual/ SemanasEnMes;
        
        System.out.println("Su salario semanal es de: "+SalarioSemanal+"$");
        
        System.out.println("***** Boleta Empleado *****");
        System.out.println("Nombre: "+nombre+
                           "\nHoras Trabajadas: "+Horas+"h"+
                           "\nTarifa por Hora: "+Tarifa+"$"+
                           "\nSalario Semanal: "+SalarioSemanal+"$");
        System.out.println("***** ***** ***** ***** *****");
        
        
   
        
        
        
        
        
        
    }
    
}
