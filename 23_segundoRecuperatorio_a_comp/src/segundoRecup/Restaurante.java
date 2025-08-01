/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoRecup;

import java.util.ArrayList;


/**
 *
 * @author Lau
 */
public class Restaurante {
    
    private String  nombre;
    private ArrayList<Producto> catalogo;
    private Ticket[] mesas = new Ticket[20];

    public Restaurante(String nombre, ArrayList<Producto> catalogo) {
        this.setNombre(nombre);
        this.setCatalogo(catalogo);
    }
    
    
    public int abrirMesa(AmbienteDeseado ambiente){
        
        if(ambiente == null){
            
            throw new IllegalArgumentException("El ambiente es nulo!!");
        }
        else
        {
            int nroMesa = -1;
            if(ambiente == AmbienteDeseado.EN_EL_SALON){
                
                int i = 0;
                while(i<10 && nroMesa == -1){
                    
                    if(mesas[i] == null){
                        mesas[i] = new Ticket(i+1);
                        nroMesa = i+1;
                    }
                    i++;
                }
            }
            else
            {
                int i = 10;
                while(i<20 && nroMesa == -1){
                    
                    if(mesas[i] == null){
                        mesas[i] = new Ticket(i+1);
                        nroMesa = i+1;
                    }
                    i++;
                }
            }
            
            if(nroMesa == -1){
                throw new IllegalArgumentException("La mesa no tiene lugares libres!!");
            }
            return nroMesa;
        }
        
        
    }
    
    public void registrarComanda(int nroMesa, String descripcion, int cantidadPorciones){
    
        
        Producto producto = this.buscarProducto(descripcion);
        
        if(producto == null){
            
            throw new IllegalArgumentException("El producto no existe o es nulo!!");
        }
        else if(nroMesa != 0){
            int IMesa = nroMesa -1;

            if(mesas[IMesa]!= null && producto !=null){

                mesas[IMesa].agregarItem(new Item(producto,cantidadPorciones));
            }
        }
        else
        {
            throw new IllegalArgumentException("El numero de mesa es 0!!");
        }
    }
    
    private Producto buscarProducto(String descripcion){
    
        Producto productoEncontrado = null;
        int i = 0;
        
        while(i<this.catalogo.size() && productoEncontrado == null){
            if(descripcion.equals(this.catalogo.get(i).getDescripcion())){
                productoEncontrado = this.catalogo.get(i);
            }
            i++;
        }
        
        return productoEncontrado;
    }

    public void cerrarMesa(int nroMesa) {
        
        Ticket ticketActual = mesas[nroMesa-1];
        System.out.println(ticketActual.toString() + "\n");
        mesas[nroMesa-1] = null;
    }

    public void setNombre(String nombre) {
        
        if(!nombre.isEmpty()){
            this.nombre = nombre;
        }
        else
        {
            throw new IllegalArgumentException("El nombre del restaurante esta vacio!!");
        }
    }

    private void setCatalogo(ArrayList<Producto> catalogo) {
        this.catalogo = catalogo;
    }
    
    
}
