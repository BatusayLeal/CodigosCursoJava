package Automotora;
public abstract class Vehiculo {
    String fabricante;
    String modelo;

    public Vehiculo(){
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // public abstract int maximaVelocidad();

}