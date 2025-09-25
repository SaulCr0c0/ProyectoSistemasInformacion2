package org.gruposi.proyectosistemasinformacion2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoDeExcepciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombrePostulante = "";
        double promedioCalificaciones = 0.0;

        System.out.println("--- Sistema de Postulación por Excelencia Académica UMSS ---");

        try {
            // Paso 1: Obtener el nombre del postulante
            System.out.print("Ingresa tu nombre completo: ");
            nombrePostulante = scanner.nextLine();

            // Paso 2: Obtener el promedio de calificaciones
            System.out.print("Ingresa tu promedio de calificaciones (ej. 95.5): ");
            promedioCalificaciones = scanner.nextDouble();

            // Lógica para verificar el promedio y lanzar una excepción si es necesario
            if (promedioCalificaciones < 90.0) {
                // Se lanza una excepción personalizada si el promedio no cumple con el requisito
                throw new PromedioInsuficienteException("El promedio de calificaciones debe ser 90.0 o superior para postular por excelencia.");
            }

            // Si todo es correcto, se procede con la confirmación
            System.out.println("\n¡Felicidades, " + nombrePostulante + "!");
            System.out.println("Tu promedio de " + promedioCalificaciones + " cumple con los requisitos.");
            System.out.println("Tu postulación ha sido registrada con éxito. Puedes continuar con el proceso de inscripción.");

        } catch (InputMismatchException e) {
            // Maneja la excepción si el usuario ingresa un valor no numérico para el promedio
            System.out.println("\nERROR: Debes ingresar un número válido para el promedio de calificaciones.");
            System.out.println("Por favor, inténtalo de nuevo.");
        } catch (PromedioInsuficienteException e) {
            // Maneja la excepción personalizada si el promedio es demasiado bajo
            System.out.println("\nERROR: " + e.getMessage());
            System.out.println("Tu postulación no califica para la vía de excelencia académica.");
        } finally {
            // Este bloque siempre se ejecuta, asegurando que el scanner se cierre
            scanner.close();
            System.out.println("\nProceso de postulación finalizado.");
        }
    }
}

// Clase de excepción personalizada para manejar promedios insuficientes
class PromedioInsuficienteException extends Exception {
    public PromedioInsuficienteException(String mensaje) {
        super(mensaje);
    }
}