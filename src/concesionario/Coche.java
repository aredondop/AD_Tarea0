/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author Ángel Redondo Pliego
 */
public class Coche {
    //Atributos del coche
    private String marca, modelo, matricula;
    private int anyo;
    
    //Variable de clase
    public static int contador_de_coches = 0;
    
    //Constructor por defecto
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.anyo = 0; //Pelao y mondao
        this.matricula = "";

        contador_de_coches++;
    }
    
    //Constructor con parámetros
    public Coche(String marca, String modelo, int anyo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.matricula = matricula;

        contador_de_coches++;
    }
    
    //Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnyo() {
        return this.anyo;
    }

    public String getMatricula() {
        return this.matricula;
    }
    
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
