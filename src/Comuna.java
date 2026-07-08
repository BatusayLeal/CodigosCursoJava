public class Comuna {
    private int id;
    private String nombre;
    private int poblacion;
    private Region region;           // Relación: Cada comuna pertenece a una región

    // Constructor
    public Comuna(int id, String nombre, int poblacion, Region region) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.region = region;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public Region getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Comuna: " + nombre + " | Población: " + poblacion + 
               " | Región: " + region.getNombre();
    }
}