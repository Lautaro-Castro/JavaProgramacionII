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
class Ticket {
    
    private static int contadorTicket = 1;
    private int nroTicket;
    private int nroMesa;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    public Ticket(int nroMesa){
        this.setNroTicket(Ticket.contadorTicket++);
        this.setNroMesa(nroMesa);
    }
    
    public void agregarItem(Item item){
        
        this.items.add(item);
    }

    public int getNroTicket() {
        return nroTicket;
    }
    
    
    @Override
    public String toString() {
        return  "Nro. Ticket: " + nroTicket + "\n Nro. Mesa:" + nroMesa + "\nItems:" + this.getItemsString() + 
                "\nPrecio final: " + this.getImporteTotal();
    }

    private double getImporteTotal() {
        
        double importeTotal = 0;
        for(int i=0; i<this.items.size();i++){
            importeTotal += items.get(i).getImporte();
        }
        
        return importeTotal;
    }
    
    private String getItemsString(){
    
        String cadenaItems = "";
        
        for(int i=0;i<this.items.size();i++){
             Item item = this.items.get(i);
            cadenaItems += item.getDescripcionProducto() + " x" + item.getCantidad() + 
                    "  $" + item.getImporte() + "\n";
        }
        
        return cadenaItems;
    }

    private void setNroTicket(int nroTicket) {
        this.nroTicket = nroTicket;
    }

    private void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }
    
    
}
