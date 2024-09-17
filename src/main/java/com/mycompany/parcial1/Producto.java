package com.mycompany.parcial1;

public abstract class Producto {
    private int id;
    private String nombre;
    private String descrpcion;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, String descrpcion, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descrpcion = descrpcion;
        this.precio = precio;
        this.stock = stock;
    }

  
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
