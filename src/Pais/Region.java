package Pais;
import java.util.ArrayList;
import java.util.List;

public class Region {
    private int id;
    private String nombre;
    private String numeroRegion;     // Ej: "RM", "V", "XIII"
    private String capital;
    private List<Comuna> comunas;    // Relación: Una región tiene muchas comunas

    // Constructor
    public Region(int id, String nombre, String numeroRegion, String capital) {
        this.id = id;
        this.nombre = nombre;
        this.numeroRegion = numeroRegion;
        this.capital = capital;
        this.comunas = new ArrayList<>();
    }

    // Método para agregar una comuna a la región
    public void agregarComuna(Comuna comuna) {
        this.comunas.add(comuna);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroRegion() {
        return numeroRegion;
    }

    public String getCapital() {
        return capital;
    }

    public List<Comuna> getComunas() {
        return comunas;
    }

    // Método para mostrar todas las comunas de la región
    public void mostrarComunas() {
        System.out.println("Comunas de la región " + this.nombre + ":");
        for (Comuna comuna : comunas) {
            System.out.println("- " + comuna.getNombre());
        }
    }

    @Override
    public String toString() {
        return "Región " + numeroRegion + " - " + nombre + " (Capital: " + capital + ")";
    }
}