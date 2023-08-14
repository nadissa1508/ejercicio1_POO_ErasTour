public class Cliente {

    private String nombre;
    private String correo;
    private int cantBoletos;
    private float presupuesto;

    public Cliente(){
        nombre = "";
        correo = "";
        cantBoletos = 0;
        presupuesto = 0.0f;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre2){
        this.nombre = nombre2;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void setCorreo(String correo2){
        this.correo = correo2;
    }

    public int getCantBoletos(){
        return this.cantBoletos;
    }

    public void setCantBoletos(int cantBoletos2){
        this.cantBoletos = cantBoletos2;
    }

    public float getPresupuesto(){
        return this.presupuesto;
    }

    public void setPresupuesto(float presupuesto2){
        this.presupuesto = presupuesto2;
    }

    public String toString(){
        return "\nCliente: " + this.nombre 
        + "\nCorreo: " + this.correo 
        + "\nCantidad deseada de boletos: " + this.cantBoletos 
        + "\nPresupuesto: " + this.presupuesto;
    }
    
}
