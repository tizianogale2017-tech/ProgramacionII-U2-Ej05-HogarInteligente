package Ejercicio5_hogarInteligente;

public class FocoInteligente extends DispositivoInteligente {
    public FocoInteligente(String nombre, boolean conectado) {
        super(nombre, conectado);
    }

    @Override
    public void aplicarModoNoche() {
        apagar();
    }
}
