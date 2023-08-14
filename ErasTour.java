import java.util.Random;

public class ErasTour {
    private Localidad localidad1;
    private Localidad localidad5;
    private Localidad localidad10;
    private Cliente cliente;
    private Random generador;
    private int numeroTicket;
    private int numA;
    private int numB;

    public ErasTour() {
        localidad1 = new Localidad(1, 100.0f, 20);
        localidad5 = new Localidad(5, 500.0f, 20);
        localidad10 = new Localidad(10, 1000.0f, 20);
        cliente = new Cliente();
        generador = new Random();
        numeroTicket = 0;
        numA = 0;
        numB = 0;
    }

    public void guardarCliente(String nombre, String correo, int cantBoletos, float presupuesto) {
        cliente.setNombre(nombre);
        cliente.setCorreo(correo);
        cliente.setCantBoletos(cantBoletos);
        cliente.setPresupuesto(presupuesto);
        System.out.println("Se ha guardado el cliente correctamente!");
    }

    public int generarNumAleatorio(int desde, int hasta) {
        return generador.nextInt(hasta - desde + 1) + desde;
    }

    // tipoLocalidad 1 -> localidad1 , si es 2 -> localidad5 , si es 3 ->localidad10
    public boolean verificarEspacio(int tipoLocalidad) {
        int bolVender = 0;
        boolean flag = false;

        if (tipoLocalidad == 1) {// usar localidad1
            if (localidad1.getEspacio() > 0) {

                if (localidad1.getPrecioTicket() <= cliente.getPresupuesto()) {

                    int resta = 0;
                    resta = localidad1.getEspacio() - cliente.getCantBoletos();
                    System.out.println("resta es " + resta );

                    if (resta < 0) {
                        /*
                         * calcula la cantidad de boletos que se le pueden vender al cliente realmente
                         * Si tengo 15 boletos y quiere 17 -> 15-17 = -2
                         * entonces 17 + (-2) = 15
                         * eso es lo que hace la línea 5
                         */
                        bolVender = cliente.getCantBoletos() + resta;
                        System.out.println("calculo de bolVender " + bolVender);
                    } else if ((resta > 0) || (resta == 0)) {
                        // se pueden vender los boletos
                        bolVender = cliente.getCantBoletos();
                    }
                    flag = true;

                } else {
                    flag = false;
                    
                }

            } else {
                flag = false;
            }

        } else if (tipoLocalidad == 2) {// usar localidad5
            if (localidad5.getEspacio() > 0) {

                if (localidad5.getPrecioTicket() <= cliente.getPresupuesto()) {

                    int resta = 0;
                    resta = localidad5.getEspacio() - cliente.getCantBoletos();
                    System.out.println("resta es " + resta );

                    if (resta < 0) {
                        /*
                         * calcula la cantidad de boletos que se le pueden vender al cliente realmente
                         * Si tengo 15 boletos y quiere 17 -> 15-17 = -2
                         * entonces 17 + (-2) = 15
                         * eso es lo que hace la línea 5
                         */
                        bolVender = cliente.getCantBoletos() + resta;
                        System.out.println("calculo de bolVender " + bolVender);
                    } else if ((resta > 0) || (resta == 0)) {
                        // se pueden vender los boletos
                        bolVender = cliente.getCantBoletos();
                    }
                    flag = true;

                } else {
                    flag = false;
                    
                }

            } else {
                flag = false;
                
            }

        } else if (tipoLocalidad == 3) {// usar localidad10
            if (localidad10.getEspacio() > 0) {

                if (localidad10.getPrecioTicket() <= cliente.getPresupuesto()) {

                    int resta = 0;
                    resta = localidad10.getEspacio() - cliente.getCantBoletos();
                    System.out.println("resta es " + resta );
                    if (resta < 0) {
                        /*
                         * calcula la cantidad de boletos que se le pueden vender al cliente realmente
                         * Si tengo 15 boletos y quiere 17 -> 15-17 = -2
                         * entonces 17 + (-2) = 15
                         * eso es lo que hace la línea 5
                         */
                        bolVender = cliente.getCantBoletos() + resta;
                        System.out.println("calculo de bolVender " + bolVender);
                    } else if ((resta > 0) || (resta == 0)) {
                        // se pueden vender los boletos
                        bolVender = cliente.getCantBoletos();
                    }
                    flag = true;

                } else {
                    flag = false;
                    
                }

            } else {
                flag = false;
                
            }
        }
        return flag;
    }

    // tipoLocalidad 1 -> localidad1 , si es 2 -> localidad5 , si es 3 ->localidad10
    public boolean venderTicket(int tipoLocalidad, int boletosVendidos) {
        boolean flag = false;
        int espacioLocalidad = 0, dispoReal = 0;

        if (tipoLocalidad == 1) {
            System.out.println("q viene en boletosVendidos" + boletosVendidos);
            espacioLocalidad = localidad1.getEspacio();
            dispoReal = espacioLocalidad - boletosVendidos;
            System.out.println("ver que viene a dispoReal " + dispoReal);
            localidad1.setEspacio(dispoReal);
            if (localidad1.getEspacio() == dispoReal) {
                flag = true;
            }
        } else if (tipoLocalidad == 2) {
            System.out.println("q viene en boletosVendidos" + boletosVendidos);
            espacioLocalidad = localidad5.getEspacio();

            dispoReal = espacioLocalidad - boletosVendidos;
            System.out.println("ver que viene a dispoReal " + dispoReal);
            localidad5.setEspacio(dispoReal);

            if (localidad5.getEspacio() == dispoReal) {
                flag = true;
            }
        } else if (tipoLocalidad == 3) {
            System.out.println("q viene en boletosVendidos" + boletosVendidos);
            espacioLocalidad = localidad10.getEspacio();
            dispoReal = espacioLocalidad - boletosVendidos;
            System.out.println("ver que viene a dispoReal " + dispoReal);
            localidad10.setEspacio(dispoReal);
            if (localidad10.getEspacio() == dispoReal) {
                flag = true;
            }
        }
        return flag;
    }

    public int validarNumAB(int nA, int nB) {
        int flag = 0;

        if (nA > nB) {
            flag = 1;
        } else if (nA < nB) {
            flag = 2;
        } else if (nA == nB) {
            flag = 3;
        }
        return flag;
    }

    int calcBoletosVendidos(int tipoLocalidad) {
        int resta = 0, boletos = 0;

        if(tipoLocalidad == 1){
            resta = localidad1.getEspacio() - cliente.getCantBoletos();
            if (resta < 0) {
                boletos = cliente.getCantBoletos() + resta;
            } else if ((resta > 0) || (resta == 0)) {
                boletos = cliente.getCantBoletos();
            }
        }else if(tipoLocalidad == 2){
            resta = localidad5.getEspacio() - cliente.getCantBoletos();
            if (resta < 0) {
                boletos = cliente.getCantBoletos() + resta;
            } else if ((resta > 0) || (resta == 0)) {
                boletos = cliente.getCantBoletos();
            }
        }else if(tipoLocalidad == 3){
            resta = localidad10.getEspacio() - cliente.getCantBoletos();
            if (resta < 0) {
                boletos = cliente.getCantBoletos() + resta;
            } else if ((resta > 0) || (resta == 0)) {
                boletos = cliente.getCantBoletos();
            }
        }
        return boletos;
    }

    public void comprarTicket() {
        numeroTicket = generarNumAleatorio(1, 15000);
        numA = generarNumAleatorio(1, 15000);
        numB = generarNumAleatorio(1, 15000);

        if (validarNumAB(numA, numB) == 1) {// A es mayor que B

            if ((numeroTicket > numB) && (numeroTicket < numA)) {
                int numLocRandom = generarNumAleatorio(1, 3);
                if (verificarEspacio(numLocRandom)) {

                    if(venderTicket(numLocRandom, calcBoletosVendidos(numLocRandom))){
                        System.out.println("Felicidades! Ha adquirido sus boletos");
                    }else{
                        System.out.println("Error, no se han podido comprar los boletos, intente más tarde");
                    }
            
                } else {
                    System.out.println("Lo sentimos! No se pueden adquirir boletos para la localidad asignada");
                }
            } else {
                
                System.out.println("Lo sentimos! Tu número de ticket no puede participar, vuelve a intentarlo!");
            }

        } else if (validarNumAB(numA, numB) == 2) {// B es mayor que A

            if ((numeroTicket > numA) && (numeroTicket < numB)) {
                int numLocRandom = generarNumAleatorio(1, 3);
                if (verificarEspacio(numLocRandom)) {

                    if(venderTicket(numLocRandom, calcBoletosVendidos(numLocRandom))){
                        System.out.println("Felicidades! Ha adquirido sus boletos");
                    }else{
                        System.out.println("Error, no se han podido comprar los boletos, intente más tarde");
                    }

                } else {
                    System.out.println("Lo sentimos! No se pueden adquirir boletos para la localidad asignada");
                }
            } else {
                
                System.out.println("Lo sentimos! Tu número de ticket no puede participar, vuelve a intentarlo!");
            }

        } else if (validarNumAB(numA, numB) == 3) {// Son iguales
            // como numA y numB son iguales no se puede ver si el numeroTicket está dentro
            // de un rango
            System.out.println("Lo sentimos! Tu número de ticket no puede participar, vuelve a intentarlo!");
        }

    }

    public void mostrarDispoTotal() {
        System.out.println("\nDisponibilidad total de boletos:");
        System.out.println(localidad1.toString());
        System.out.println(localidad5.toString());
        System.out.println(localidad10.toString());
    }

    public void mostrarDispoLocalidad(int tipoLocalidad) {
        if (tipoLocalidad == 1) {
            System.out.println(localidad1.toString());
        } else if (tipoLocalidad == 2) {
            System.out.println(localidad5.toString());
        } else if (tipoLocalidad == 3) {
            System.out.println(localidad10.toString());
        }
    }

    public void reporteCaja() {
        float total1 = 0.0f, total2 = 0.0f, total3 = 0.0f;
        total1 = localidad1.getPrecioTicket() * (20 - localidad1.getEspacio());
        total2 = localidad5.getPrecioTicket() * (20 - localidad5.getEspacio());
        total3 = localidad10.getPrecioTicket() * (20 - localidad10.getEspacio());

        System.out.println("\n*****************");
        System.out.println("\nREPORTE DE CAJA");
        System.out.println("\n*****************");
        System.out.println("\nVentas Localidad No.1:" + total1);
        System.out.println("\nVentas Localidad No.5:" + total2);
        System.out.println("\nVentas Localidad No.10:" + total3);
        System.out.println("\n--------------------------------");
        System.out.println("\nVentas totales:" + (total1 + total2 + total3));
    }
}
