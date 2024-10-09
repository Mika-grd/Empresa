package co.edu.uniquindio.poo.model;

public abstract class Empleado {

    private String nombre;
    private String id;

    
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Abstract method to calcular el salario de un empleado
     * @return
     */
    abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
