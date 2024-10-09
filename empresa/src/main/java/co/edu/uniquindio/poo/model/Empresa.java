package co.edu.uniquindio.poo.model;

import java.util.HashMap;

public class Empresa {

    private String nombre;
    private HashMap<String, Empleado> empleados = new HashMap<>();

    public Empresa(String nombre){
        this.nombre = nombre;
    }

    



    //CRUD



    /**
     * Añade empleado
     * @param empleado
     */
    public void añadirEmpleado(Empleado empleado){
        empleados.put(empleado.getId(), empleado);
    }

    /**
     * Elimina empleado
     * @param empleado
     */
    public void eliminarEmpleado(Empleado empleado){
        empleados.remove(empleado.getId()
        );
    }

    /**
     * Busca empleado
     * @param empleado
     * @return empleado encontrado
     */
    public Empleado buscarEmpleado(Empleado empleado){
        return empleados.get(empleado.getId());
    }

    /**
     * Busca empleado por id
     * @param id
     * @return empleado encontrado
     */
    public Empleado buscarId(String id){
        return buscarEmpleado(empleados.get(id));
    }

    /**
     * Edita empleado
     * @param empleadoReemplazar
     * @param empleadoNuevo
     */
    public void editarEmpleado(Empleado empleadoReemplazar, Empleado empleadoNuevo){
        empleados.replace(empleadoReemplazar.getId(), empleadoNuevo);
    }






    //Setters & Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap<String, Empleado> empleados) {
        this.empleados = empleados;
    }

    
}
