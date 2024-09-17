
package com.mycompany.parcial1;

import java.util.ArrayList;


public class Cliente {
    
    String nombre;
    String direccion;
    ArrayList<Pedidos> pedidos;

    public Cliente(String nombre, String direccion, ArrayList<Pedidos> pedidos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = pedidos;
    }
    
    
}
