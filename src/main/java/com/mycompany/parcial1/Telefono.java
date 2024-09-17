package com.mycompany.parcial1;

public class Telefono extends Producto {

    private int memoria;
    private int duracionBateria;

    public Telefono(int memoria, int duracionBateria, int id, String nombre, String descrpcion, double precio, int stock) {
        super(id, nombre, descrpcion, precio, stock);
        this.memoria = memoria;
        this.duracionBateria = duracionBateria;
    }



    @Override
    public String toString() {
        return "Telefono{" + "memoria=" + memoria + ", duracionBateria=" + duracionBateria + super.toString();
    }


}
