package Automotora;

public class Motocicleta extends Vehiculo {


    public Motocicleta() {
    }

    public Motocicleta(String fabricante, String modelo, float cilindrada) {
        super(fabricante, modelo);
    }

    @Override
    public int maximaVelocidad() {
        return 200;
    }
}