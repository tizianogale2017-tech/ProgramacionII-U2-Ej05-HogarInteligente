package Ejercicio5_hogarInteligente;

public class Main {
    public static void main(String[] args) {
        HubCentral hub = new HubCentral();
        hub.agregarDispositivo(new FocoInteligente("Foco del living", true));
        hub.agregarDispositivo(new AireAcondicionado("Aire del dormitorio", true));
        hub.agregarDispositivo(new Persiana("Persiana de la cocina", true));
        hub.agregarDispositivo(new FocoInteligente("Foco del garage", false));

        hub.activarModoNoche();
    }
}
