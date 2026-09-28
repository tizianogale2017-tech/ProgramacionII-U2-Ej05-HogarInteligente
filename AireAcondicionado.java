package Ejercicio5_hogarInteligente;

public class AireAcondicionado extends DispositivoInteligente {
    public AireAcondicionado(String nombre, boolean conectado) {
        super(nombre, conectado);
    }

    @Override
    public void aplicarModoNoche() {
        configurar("24 °C (modo silencioso)");
    }
}
