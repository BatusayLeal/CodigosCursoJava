package Pais;
public class Pais {
    public static void main(String[] args) {

        // Crear una región
        Region regionMetropolitana = new Region(13, "Metropolitana de Santiago", "RM", "Santiago");

        // Crear comunas y asignarlas a la región
        Comuna santiago = new Comuna(1, "Santiago", 400000, regionMetropolitana);
        Comuna providencia = new Comuna(2, "Providencia", 157000, regionMetropolitana);
        Comuna lasCondes = new Comuna(3, "Las Condes", 330000, regionMetropolitana);

        // Agregar comunas a la región
        regionMetropolitana.agregarComuna(santiago);
        regionMetropolitana.agregarComuna(providencia);
        regionMetropolitana.agregarComuna(lasCondes);

        // Mostrar información
        System.out.println(regionMetropolitana);
        regionMetropolitana.mostrarComunas();

        System.out.println("\n--- Detalle de una comuna ---");
        System.out.println(santiago);
        System.out.println(providencia);
        System.out.println(lasCondes);
    }
}