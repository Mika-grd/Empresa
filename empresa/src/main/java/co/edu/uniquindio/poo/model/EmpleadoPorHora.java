package co.edu.uniquindio.poo.model;

public class EmpleadoPorHora extends Empleado {

    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHora(String nombre, String id, int horasTrabajadas, double salarioPorHora){
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }


    @Override
    public double calcularSalario(){
        double salario = horasTrabajadas * salarioPorHora;
        return salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    
}
