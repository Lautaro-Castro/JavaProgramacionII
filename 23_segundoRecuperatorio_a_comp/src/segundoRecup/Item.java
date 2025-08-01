/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoRecup;

/**
 *
 * @author Lau
 */
public class Item {
    
    private Producto producto;
    private int cantidad;

    public Item(Producto producto, int cantidad) {
        this.setProducto(producto);
        this.setCantidad(cantidad);
    }

    public double getImporte(){
    
        return this.producto.calcularPrecioFinal() * this.cantidad;
    }
   
    public String getDescripcionProducto(){
    
        return this.producto.getDescripcion();
    }

    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad) {
        if(cantidad>0){
            this.cantidad = cantidad;
        }
        else
        {
            throw new IllegalArgumentException("La cantidad no puede ser 0 o negativa");
        }
        
    }

    private void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
