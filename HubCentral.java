package Ejercicio5_hogarInteligente;

import java.util.ArrayList;
import java.util.List;

public class HubCentral {
    private List<DispositivoInteligente> dispositivos = new ArrayList<>();

    public void agregarDispositivo(DispositivoInteligente dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void activarModoNoche() {
        System.out.println("Activando modo noche...");
        int alcanzados = 0;
        for (DispositivoInteligente d : dispositivos) {
            if (!d.isConectado()) {
                System.out.println("  " + d.getNombre() + ": DESCONECTADO, no se envía el mensaje.");
                continue;
            }
            d.aplicarModoNoche();
            alcanzados++;
        }
        System.out.println("Reporte: " + alcanzados + " de " + dispositivos.size() + " dispositivos recibieron la orden.");
    }
}
