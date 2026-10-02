/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Ángel Redondo Pliego
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Coche> coches = new ArrayList<>();
        
        System.out.println("Introduce el numero de coches");
        int numeroCoches = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < numeroCoches; i++) {
            System.out.println("\nCoche " + (i + 1));
            
            System.out.println("Introduce la marca");
            String marca = input.nextLine();

            System.out.println("Introduce el modelo");
            String modelo = input.nextLine();

            System.out.println("Introduce el a\u00F1o");
            int anyo = input.nextInt();
            input.nextLine();

            System.out.println("Introduce la matricula");
            String matricula = input.nextLine();
            
            Coche nuevoCoche = new Coche(marca, modelo, anyo, matricula);
            coches.add(nuevoCoche);
            
        }
        
        System.out.println("\nNumero de coches creados: " + Coche.contador_de_coches);
        
        System.out.println("\nCoches del concesionario:");
        for(int i = 0; i < coches.size(); i++) {

            Coche coche = coches.get(i);
            
            System.out.println(
                "Marca: " + coche.getMarca()
                + " | Modelo: " + coche.getModelo()
                + " | A\u00F1o: " + coche.getAnyo()
                + " | Matricula: " + coche.getMatricula()
            );

        }
        
        input.close(); //Apaño para cerrar el scanner
        
    }
    
}
