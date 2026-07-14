package Automotora;
public class Motocicleta extends Vehiculo {
    float cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(String fabricante, String modelo, float cilindrada) {
        super(fabricante, modelo);
        this.cilindrada = cilindrada;
    }

    public int maximaVelocidad(){
        return 200;
    }
}