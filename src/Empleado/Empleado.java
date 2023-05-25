package Empleado;
public class Empleado extends Persona.Persona {
    
    private int idempleado;

    public Empleado(int idempleado, String nombre, String paterno, String materno, int edad, float estatura, float peso) {
        super(nombre, paterno, materno, edad, estatura, peso);
        this.idempleado = idempleado;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    
    public String imprimirDatos(){
        return "Datos desde la clase empleado: " +idempleado+ " " +nombre+ " " +paterno+ " " +materno+ " " +edad+ " " +estatura+ " " +peso;     
    }
} 