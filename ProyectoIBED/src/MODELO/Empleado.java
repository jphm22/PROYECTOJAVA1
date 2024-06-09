
package MODELO;


public class Empleado {
    
    String codigo;
    String nombre;
    String apellido;
    String cargo;
    String turno;
    String dni_husped ;

    public Empleado() {
    }
    
    

    public Empleado(String codigo, String nombre, String apellido, String cargo, String turno, String dni_husped) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.turno = turno;
        this.dni_husped = dni_husped;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDni_husped() {
        return dni_husped;
    }

    public void setDni_husped(String dni_husped) {
        this.dni_husped = dni_husped;
    }

    
    
}
