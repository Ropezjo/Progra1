/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio2;
import java.util.Scanner;

/**
 *
 * @author rjl01
 */
public class Lopez_Roberto_Control {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int opcion;
        
        do{
        System.out.println(" **** MENU ***** ");
        System.out.println("1. Cadena ");
        System.out.println("2. Notas");
        System.out.println("3. Clases");
        System.out.println("4. Salir");
            System.out.println("Seleccionar una opcion: ");
            opcion=lea.nextInt();
            lea.nextLine();
            
            
   if (opcion == 1) {
                System.out.println("Ingrese una cadena: ");
                String cadena = lea.nextLine();

                // Suponiendo que los caracteres son ASCII
                int[] contadorCaracteres = new int[256];

                int contador = 0;
                while (contador < cadena.length()) {
                    char caracter = cadena.charAt(contador);
                    contadorCaracteres[caracter]++;
                    contador++;
                }

                char caracterMasRepetido = 0;
                int maxRepeticiones = 0;
                contador = 0;
                while (contador < 256) {
                    if (contadorCaracteres[contador] > maxRepeticiones) {
                        maxRepeticiones = contadorCaracteres[contador];
                        caracterMasRepetido = (char) contador;
                    }
                    contador++;
                }

                System.out.println("El caracter que mas se repite es '" + caracterMasRepetido + "' con " + maxRepeticiones + " repeticiones.");
                
                    } else if (opcion == 2) {
                        int cantidadNotas=0;
                        
                    while(true){
                        System.out.println("Ingresar la cantidad de notas: ");
                        cantidadNotas=lea.nextInt();
                        if(cantidadNotas>0){
                            break;
                        }else{
                            System.out.println("Solo se aceptan valores positivos");
                        }
                    }
                    double[]notas=new double[cantidadNotas];
                    double sumaNotas=0;
                    double notaMayor=-1;
                    double notaMenor=101;
                    
                for(int i= 0; i<cantidadNotas; i++){
                    while (true) {
                        System.out.print("Nota #" + (i + 1) + ": ");
                        double nota = lea.nextDouble();
                        if (nota >= 0 && nota <= 100) {
                            notas[i] = nota;
                            sumaNotas += nota;
                            if (nota > notaMayor) {
                                notaMayor = nota;
                            }
                            if (nota < notaMenor) {
                                notaMenor = nota;
                            }
                            break;
                        } else {
                            System.out.println("Solo se aceptan notas dentro del rango de 0 a 100.");
                        }
                    }
                }
                        double promedio= sumaNotas/cantidadNotas;
                        System.out.printf("Promedio: %.2f %%\n", promedio);
                System.out.printf("Nota mayor: %.2f\n", notaMayor);
                System.out.printf("Nota menor: %.2f\n", notaMenor);

            } else if (opcion == 3) {
               
                String fecha = "";
                boolean fechaValida = false;

                // Solicitar la fecha al usuario hasta que sea válida
                while (!fechaValida) {
                    System.out.print("Ingrese la fecha (dia, DD/MM): ");
                    fecha = lea.nextLine().trim();
                    
                    // Validar la fecha dentro del bucle
                    if (fecha.matches("^[a-zA-Z]+, \\d{2}/\\d{2}$")) {
                        String[] partes = fecha.split(", ");
                        String diaDeLaSemana = partes[0].toLowerCase();
                        String[] fechaPartes = partes[1].split("/");
                        int dia = Integer.parseInt(fechaPartes[0]);
                        int mes = Integer.parseInt(fechaPartes[1]);

                        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
                            fechaValida = true;
                            // Determinar el tipo de clase
                            String tipoDeClase = "error";
                            if (diaDeLaSemana.equals("lunes")) tipoDeClase = "nivel inicial";
                            else if (diaDeLaSemana.equals("martes")) tipoDeClase = "nivel intermedio";
                            else if (diaDeLaSemana.equals("miercoles")) tipoDeClase = "nivel avanzado";
                            else if (diaDeLaSemana.equals("jueves")) tipoDeClase = "práctica hablada";
                            else if (diaDeLaSemana.equals("viernes")) tipoDeClase = "inglés para viajeros";

                            // Manejar según el tipo de clase
                            if (tipoDeClase.equals("nivel inicial") || tipoDeClase.equals("nivel intermedio") || tipoDeClase.equals("nivel avanzado")) {
                                System.out.print(" Hubo exámenes? (si/no): ");
                                String respuesta = lea.nextLine().trim().toLowerCase();

                                if (respuesta.equals("si")) {
                                    System.out.print("Numero de alumnos aprobados: ");
                                    int aprobados = lea.nextInt();
                                    System.out.print("Numero de alumnos no aprobados: ");
                                    int noAprobados = lea.nextInt();
                                    lea.nextLine(); // Consumir el salto de línea restante

                                    int totalAlumnos = aprobados + noAprobados;
                                    double porcentajeAprobados = (double) aprobados / totalAlumnos * 100;

                                    System.out.printf("Porcentaje de aprobados: %.2f%%%n", porcentajeAprobados);
                                }
                            } else if (tipoDeClase.equals("practica hablada")) {
                                System.out.print("Ingrese el porcentaje de asistencia a clase: ");
                                double porcentajeAsistencia = lea.nextDouble();
                                lea.nextLine(); // Consumir el salto de línea restante

                                if (porcentajeAsistencia > 50) {
                                    System.out.println("Asistio la mayoria");
                                } else {
                                    System.out.println("No asistio la mayoria");
                                }
                            } else if (tipoDeClase.equals("ingles para viajeros")) {
                                if ((dia == 1 && mes == 1) || (dia == 1 && mes == 7)) {
                                    System.out.println("Comienzo de nuevo ciclo");

                                    System.out.print("Ingrese la cantidad de alumnos del nuevo ciclo: ");
                                    int cantidadAlumnos = lea.nextInt();
                                    System.out.print("Ingrese el precio por alumno en $: ");
                                    double precioPorAlumno = lea.nextDouble();
                                    lea.nextLine(); // Consumir el salto de línea restante

                                    double ingresoTotal = cantidadAlumnos * precioPorAlumno;
                                    System.out.printf("Ingreso total: $%.2f%n", ingresoTotal);
                                }
                            } else {
                                System.out.println("Se produjo un error.");
                            }
                        } else {
                            System.out.println("Fecha invalida. El dia o mes esta fuera de rango.");
                        }
                    } else {
                        System.out.println("Formato invalido. Por favor, ingrese la fecha en el formato correcto.");
                    }
                }

            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion no valida. Por favor, intente nuevamente.");
            }

        } while (opcion != 4);
        
        lea.close();
    }
}