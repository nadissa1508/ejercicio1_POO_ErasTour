import java.util.Scanner;

public class Principal {
    

    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        ErasTour erasTour = new ErasTour();
        int opcion = 0;
        String opUser = "";

        while (opcion != 6){
            
            System.out.println("\n***************************");
            System.out.println("\nERAS TOUR");
            System.out.println("\n***************************");
            System.out.println("\nParticipa para comprar tus boletos!!");
            System.out.println("\nOpciones: \n1.Nuevo comprador \n2.Nueva solicitud de boletos \n3.Disponibilidad total \n4.Consultar disponibilidad individual \n5.Reporte de caja \n6.Salir");
            System.out.println("\nSeleccione su opción: ");
            opUser = teclado.nextLine();

            try{
                opcion = Integer.parseInt(opUser);      
            }catch(Exception e){
                System.out.println("\nError, ingrese un número");
            }

            if(opcion < 1 || opcion > 6){
                System.out.println("\nError, ingrese una opción del menú");
            }else {
                
                if(opcion == 1){

                    String nombre = "", correo = "", cantBol = "", pres = "";
                    int cantBoletos = 0;
                    float presupuesto = 0.0f;

                    System.out.println("\n\nIngrese su nombre: ");
                    nombre = teclado.nextLine();

                    System.out.println("\nIngrese su correo: ");
                    correo = teclado.nextLine();

                    System.out.println("\nIngrese la cantidad de boletos que desea comprar: ");
                    cantBol = teclado.nextLine();

                    try{
                        cantBoletos = Integer.parseInt(cantBol);
                    }catch(Exception e){
                        System.out.println("\nError, ingrese un número");
                    }

                    if(cantBoletos > 0){
                        System.out.println("\nIngrese su presupuesto máximo: ");
                        pres = teclado.nextLine();

                        try {
                            presupuesto = Float.parseFloat(pres.replace(",", ".").trim());
                        } catch (Exception e) {
                             System.out.println("\nError, cantidad invalida");
                        }
                      
                        erasTour.guardarCliente(nombre, correo, cantBoletos, presupuesto);

                    }else{
                        System.out.println("\nError, número invalido");
                    }


                }else if(opcion == 2){

                    erasTour.comprarTicket();

                }else if(opcion == 3){
                    
                    erasTour.mostrarDispoTotal();

                }else if(opcion == 4){
                    int op = 0;

                    System.out.println("\n*****************");
                    System.out.println("\nLOCALIDADES");
                    System.out.println("\n*****************");
                    System.out.println("\n1) Localidad No.1 2) Localidad No.5 3) Localidad No.10");
                    System.out.println("\nIngrese su opción:");
                    opUser = teclado.nextLine();

                    try {
                        op = Integer.parseInt(opUser);
                    } catch (Exception e) {
                        System.out.println("\nError, ingrese un número");
                    }
                    if(op < 1 && op > 3){
                        System.out.println("\nError, número invalido");
                    }else{
                        erasTour.mostrarDispoLocalidad(op);
                    }

                }else if(opcion == 5){
                    
                    erasTour.reporteCaja();

                }

            }
        }   
    }
    
    public static void main(String[] args){
        //iniciar el menu principal del juego
        menu();
    }
}
