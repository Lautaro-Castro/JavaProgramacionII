/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoRecup;

/**
 *
 * @author Lau
 */
public class Bebida extends Producto {
    
    private boolean esVino;

    public Bebida(boolean esVino, String descripcion, double precioBase) {
        super(descripcion, precioBase);
        this.setEsVino(esVino);
    }

    @Override
    public double calcularPrecioFinal() {
        
        if(this.esVino){
            return super.getPrecioBase() + super.getPrecioBase() * 0.05;
        }
        else
        {
            return super.getPrecioBase();
        }
    }

    private void setEsVino(boolean esVino) {
        this.esVino = esVino;
    }
    
    
    
}
