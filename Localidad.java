public class Localidad {

    private int numLocalidad;
    private float precioTicket;
    private int espacio;

    public Localidad(int numLocalidad2, float precioTicket2, int espacio2){
        this.numLocalidad = numLocalidad2;
        this.precioTicket = precioTicket2;
        this.espacio = espacio2;
    }

    public int getNumLocalidad(){
        return this.numLocalidad;
    }

    public void setNumLocalidad(int numLocalidad2){
        this.numLocalidad = numLocalidad2;
    }

    public float getPrecioTicket(){
        return this.precioTicket;
    }

    public void setPrecioTicket(float precioTicket2){
        this.precioTicket = precioTicket2;
    }

    public int getEspacio(){
        return this.espacio;
    }

    public void setEspacio(int espacio2){
        this.espacio = espacio2;
    }

    public String toString(){
       
        int resta = 0;
        resta = 20 - espacio;

        String cadena = "\nLocalidad No. " + this.numLocalidad
            + "\nPrecio Ticket: " + this.precioTicket
            + "\nBoletos vendidos: " + resta
            + "\nBoletos disponibles: " + this.espacio;

        return cadena;

    }

}
