package Ejercicio5_hogarInteligente;

public class Persiana extends DispositivoInteligente {
    public Persiana(String nombre, boolean conectado) {
        super(nombre, conectado);
    }

    @Override
    public void aplicarModoNoche() {
        configurar("cerrada");
    }
}
