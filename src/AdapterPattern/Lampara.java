package AdapterPattern;

public class Lampara implements Conectable {

    private boolean encencida;

    @Override
    public boolean estaEncendida() {
        return this.encencida;
    }

    @Override
    public void encender() {
        encencida = true;
    }

    @Override
    public void apagar() {
        encencida = false;
    }
}