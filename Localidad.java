/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @description Clase para identificar las localidades de los boletos
 * @date creación 14/08/2023 última modificación 14/08/23
 */

public class Localidad {

    private int numLocalidad;
    private float precioTicket;
    private int espacio;

    /*
     * constructor para llenar las instancias
     * de Localidad en ErasTour
     */
    public Localidad(int numLocalidad2, float precioTicket2, int espacio2){
        this.numLocalidad = numLocalidad2;
        this.precioTicket = precioTicket2;
        this.espacio = espacio2;
    }

    
    /** 
     * @return int
     */
    public int getNumLocalidad(){
        return this.numLocalidad;
    }

    
    /** 
     * @param numLocalidad2
     */
    public void setNumLocalidad(int numLocalidad2){
        this.numLocalidad = numLocalidad2;
    }

    
    /** 
     * @return float
     */
    public float getPrecioTicket(){
        return this.precioTicket;
    }

    
    /** 
     * @param precioTicket2
     */
    public void setPrecioTicket(float precioTicket2){
        this.precioTicket = precioTicket2;
    }

    
    /** 
     * @return int
     */
    public int getEspacio(){
        return this.espacio;
    }

    
    /** 
     * @param espacio2
     */
    public void setEspacio(int espacio2){
        this.espacio = espacio2;
    }

    
    /** 
     * @return String
     * Este método se utiliza para brindar la información
     * general de un objeto de esta clase
     */
    public String toString(){
       
        int resta = 0;
        resta = 20 - espacio;

        String cadena = "\nLocalidad No. " + this.numLocalidad
            + "\nPrecio Ticket: $" + this.precioTicket
            + "\nBoletos vendidos: " + resta
            + "\nBoletos disponibles: " + this.espacio;

        return cadena;

    }

}
