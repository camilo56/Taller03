public class VentanaConsola {


    private void Menu() {

        System.out.println("Bienvenido al menú");
        System.out.println("Elija una opción" + "\n");
        System.out.println("[1]  mostrar los datos del computador");
        System.out.println("[2]  editar los datos del computador");
        System.out.println("[3] Salir" + "\n");
        while(true){
        switch (opcion) {
            case "1":

                break;
            case "2":
                cambiarRam();

                break;
            case "3":


                break;
            case "0":
                break Outer1;
            default:
                System.out.println("Ingresaste mal la opcion intentalo dce nuevo");
                break;
        }
            }





    public static void cambiarRam(int capacidad,int frecuencia, String marca){
            CambiarCapacidadRam(capacidad);
            CambiarMarcaRam(marca);
            CambiarFrecuenciaRam(frecuencia);

        }
    }


}