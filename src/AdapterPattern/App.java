package AdapterPattern;

public class App {
    public static void main(String[] args) throws Exception {
        Conectable l1 = new Lampara();
        encenderAparato(l1);

        Conectable l2 = new AdaptadorLampara();
        encenderAparato(l2);

        Conectable o1 = new Ordenador();
        encenderAparato(o1);

    }
 
    private static void encenderAparato(Conectable c1) {
        c1.encender();
        System.out.println("Lampara Encendida: " + c1.estaEncendida());
    }

    
}