package modelo;

public class FiguraGeometrica {

    private int numLados;
    private String nombre;
    private static final int MIN_NUMBER = 3;

    public void showInfo() {
        System.out.printf("Soy un %s. Tengo %d lados%n", nombre, numLados);
    }


    public FiguraGeometrica(int numLados, String nombre) throws Exception {
        if (numLados < MIN_NUMBER) {
            throw new Exception("El número de lados debe ser mayor que " + MIN_NUMBER);
        }
        this.numLados = numLados;
        this.nombre = nombre;
    }

/*Nombre alumno/a apellidos */

    public int getNumLados() {
        return this.numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public FiguraGeometrica() {
    }
   


}
