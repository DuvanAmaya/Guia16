package proyectoparking;

import paqueteParking.Parking;

public class ProyectoParking {
    public static void main(String[] args) {
        Parking ventana = new Parking();
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }
    
}
