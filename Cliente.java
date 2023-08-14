/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @description Clase para modelar un cliente que desea 
 * comprar boletos para el concierto de Taylor Swift
 * @date creación 14/08/2023 última modificación 14/08/23
 */

public class Cliente {

    private String nombre;
    private String correo;
    private int cantBoletos;
    private float presupuesto;

    /**
     * constructor
     */
    public Cliente(){
        nombre = "";
        correo = "";
        cantBoletos = 0;
        presupuesto = 0.0f;
    }

    
    /** 
     * @return String
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /** 
     * @param nombre2
     */
    public void setNombre(String nombre2){
        this.nombre = nombre2;
    }

    
    /** 
     * @return String
     */
    public String getCorreo(){
        return this.correo;
    }

    
    /** 
     * @param correo2
     */
    public void setCorreo(String correo2){
        this.correo = correo2;
    }

    
    /** 
     * @return int
     */
    public int getCantBoletos(){
        return this.cantBoletos;
    }

    
    /** 
     * @param cantBoletos2
     */
    public void setCantBoletos(int cantBoletos2){
        this.cantBoletos = cantBoletos2;
    }

    
    /** 
     * @return float
     */
    public float getPresupuesto(){
        return this.presupuesto;
    }

    
    /** 
     * @param presupuesto2
     */
    public void setPresupuesto(float presupuesto2){
        this.presupuesto = presupuesto2;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "\nCliente: " + this.nombre 
        + "\nCorreo: " + this.correo 
        + "\nCantidad deseada de boletos: " + this.cantBoletos 
        + "\nPresupuesto: " + this.presupuesto;
    }
    
}
