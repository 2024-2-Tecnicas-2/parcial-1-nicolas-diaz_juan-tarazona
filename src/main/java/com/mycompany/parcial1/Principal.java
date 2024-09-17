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

    public static boolean agregarProducto(Producto p) {
        return inventario.add(p);

    }

    public static boolean EliminarProducto(int id) {
        return inventario.removeIf(n -> n.getId() == id);

    }

    public static void mostraInventario() {
        for (Producto producto : inventario) {
            System.out.println(producto);
        }

    }

    public static boolean venderProducto(int id, int cantidad) {
        boolean vendido=false;
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getStock() >= cantidad && inventario.get(i).getId() == id) {
                inventario.get(i).setStock(inventario.get(i).getStock() - cantidad);
                vendido=true;
            } else {
                vendido = false;
            }
        }
        return vendido;
    }

    public static void ProcesarPedido(int num,String nombre) {
        ArrayList<Producto> me=new ArrayList<>();
        for (int i = 0; i <=num; i++) {
            System.out.print("digite el id del producto: ");
            int id=entrada.nextInt();
            System.out.print("digite el numero de productos: ");
            int cantidad=entrada.nextInt();
            venderProducto(id,cantidad);
           
            
        }
        
        Pedidos p = new Pedidos(nombre,me);
        
    }

}
