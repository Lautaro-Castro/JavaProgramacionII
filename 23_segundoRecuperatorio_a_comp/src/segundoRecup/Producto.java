/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoRecup;

/**
 *
 * @author Lau
 */
public abstract class Producto {
    
    private double precioBase;
    private String descripcion;

    public Producto(String descripcion, double precioBase) {
        this.setPrecioBase(precioBase);
        this.setDescripcion(descripcion);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private void setPrecioBase(double precioBase) {
        
        if(precioBase > 0){
            this.precioBase = precioBase;
        }
        else
        {
            throw new IllegalArgumentException("El precio base no puede ser 0 o negativo");
        }
    }
    
    
    
    public abstract double calcularPrecioFinal();
}
