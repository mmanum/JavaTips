package AdapterPattern;

public class AdaptadorLampara implements Conectable {

    private LamparaInglesa lampara = new LamparaInglesa();

    public boolean estaEncendida() {
        return lampara.isOn();
    }

    public void encender() {
        lampara.on();
    }

    public void apagar() {
        lampara.off();
    }
    
}