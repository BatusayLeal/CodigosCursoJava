package Automotora;

public class Automovil extends Vehiculo {

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, float motorizacion) {
        super(fabricante, modelo);
    }

    @Override
    public int maximaVelocidad() {
        return 150;
    }
}