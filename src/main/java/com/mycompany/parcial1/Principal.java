package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Producto> inventario;
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        inventario = new ArrayList<>();
       
        Laptop l =new Laptop("intel i5", 20, 1, "dell", "portatil gamer", 1000, 5);
        Telefono t =new Telefono(32, 8, 2, "samsung", "celular", 700, 10);
    
        

    }
}
