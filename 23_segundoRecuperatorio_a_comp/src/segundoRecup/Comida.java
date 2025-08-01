/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoRecup;

/**
 *
 * @author Lau
 */
public class Comida extends Producto{
    
    private double peso;

    public Comida(double peso, String descripcion, double precioBase) {
        
        super(descripcion, precioBase);
        this.peso = peso;
    }

    @Override
    public double calcularPrecioFinal() {
        
        return super.getPrecioBase() * this.peso;
    }

    private void setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
        }
        else
        {
            throw new IllegalArgumentException("El peso no puede ser 0 o negativo");
        }
    }
    
    
}
