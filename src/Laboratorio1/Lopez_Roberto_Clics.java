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
public class Lopez_Roberto_Clics {

 public static void main(String[] args) {
        int clics1 = 60;
        double costoClics1 = 0.30;
        int clics2 = 100;
        double costoClics2 = 0.25;
        int clics3 = 20;
        double costoClics3 = 0.80;

        double costoTotal = (clics1 * costoClics1) + (clics2 * costoClics2) + (clics3 * costoClics3);

        int totalClics = clics1 + clics2 + clics3;

        double costoPromedio = costoTotal / totalClics;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de clics: ");
        double total = scanner.nextDouble();

        double ISV = total * 0.16;

        double totalConISV = total + ISV;

        System.out.println("El costo promedio por clic es: $" + String.format("%.2f", costoPromedio));
        System.out.println("El total con ISV es: $" + String.format("%.2f", totalConISV));
    }
}

