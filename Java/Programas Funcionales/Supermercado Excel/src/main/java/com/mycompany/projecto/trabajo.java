package com.mycompany.projecto;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class trabajo {

    public static void main(String[] args) throws InvalidFormatException, IOException {

        File archivo = new File("Productos.xlsx");

        Scanner scanner = new Scanner(System.in);
        boolean terminar = false;

        while (!terminar) {
            System.out.println("");
            System.out.println("¿Qué deseas hacer?\n1. Mostrar\n2. Registrar Compras\n3. Terminar");
            System.out.print("Elige la opcion: ");
            System.out.print("");
            int elegir = scanner.nextInt();
            System.out.println("");    
            if (elegir == 1) {
                mostrarExcel(archivo);
            } else if (elegir == 2) {

                System.out.print("Cual es tu nombre: ");
                String nombre = scanner.next();
                
                System.out.print("Cual es tu DNI: ");
                String dni = scanner.next();
                
                persona persona = new persona(nombre,dni);
                
                System.out.print(persona.getName() + ", con DNI " + persona.getDNI());
                System.out.println("");

            } else if (elegir == 3) {
                System.out.println("Has salido del programa.");
                terminar = true;
            } else {
                System.out.println(
                        "Opción no válida. Por favor, elige 1 para mostrar, 2 para registrar compras o 3 para terminar.");
            }

        }

    }

    public static void mostrarExcel(File archivo) {
        try (FileInputStream fileInputStream = new FileInputStream(archivo);
                Workbook workBook = new XSSFWorkbook(fileInputStream)) {
            Sheet hoja = workBook.getSheetAt(0);

            for (Row fila : hoja) {

                for (Cell cell : fila) {
                    Cell valor = cell;
                    System.out.print(valor + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Ha fallado algo");
        }
    }
    
}
