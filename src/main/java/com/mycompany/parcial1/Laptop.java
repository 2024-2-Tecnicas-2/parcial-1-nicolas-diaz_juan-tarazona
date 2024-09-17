/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

public class Laptop extends Producto {

    private String procesador;
    private double pulgadas;

    public Laptop(String procesador, double pulgadas, int id, String nombre, String descrpcion, double precio, int stock) {
        super(id, nombre, descrpcion, precio, stock);
        this.procesador = procesador;
        this.pulgadas = pulgadas;
    }

    

    @Override
    public String toString() {
        return "Laptop{" + "procesador=" + procesador + ", pulgadas=" + pulgadas + super.toString();
    }

    
}
