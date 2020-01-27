package EncapsulacionReutilizacion;

public class App {
    public static void main(String[] args) throws Exception {
    
        Telefono telefono = new Telefono("Xiomi", 4800);
        System.out.println(telefono.getCapacidad());
    }
}