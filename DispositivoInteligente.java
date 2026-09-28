package Ejercicio5_hogarInteligente;

public class DispositivoInteligente {
    protected String nombre;
    protected boolean conectado;
    protected boolean encendido;

    public DispositivoInteligente(String nombre, boolean conectado) {
        this.nombre = nombre;
        this.conectado = conectado;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println("  " + nombre + ": encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("  " + nombre + ": apagado.");
    }

    public void configurar(String parametro) {
        System.out.println("  " + nombre + ": configurado en " + parametro + ".");
    }

    public void aplicarModoNoche() {
        apagar();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isConectado() {
        return conectado;
    }
}
