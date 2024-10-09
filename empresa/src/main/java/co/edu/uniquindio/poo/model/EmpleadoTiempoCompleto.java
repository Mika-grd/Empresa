package co.edu.uniquindio.poo.model;

public class EmpleadoTiempoCompleto extends Empleado{

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioMensual){
        super(nombre, id);
        this.salarioMensual = salarioMensual;    
    }


    @Override
    public double calcularSalario(){
        double salario = salarioMensual;
        return salario;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
}
