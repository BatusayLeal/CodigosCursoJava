package Automotora;

public class Automovil extends Vehiculo {
    float motorizacion;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, float motorizacion) {
        super(fabricante, modelo);
        this.motorizacion = motorizacion;
    }

    public int maximaVelocidad(){
        return 150;
    }
   
    
}