package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona{

    //Atributos
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    //Constructor
    public Familiar(){

    }

    //Getter & Setters
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    //Calculadora para saber la edad de una persona
    public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int Actual = hoy.get(Calendar.YEAR);
        int anioNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
        return (Actual - anioNacimiento);
    }
    @Override
    public String toString() {
        return "Familiar " +
                super.toString() +
                "Cedula: " + getCedula() +
                ",\n\t Nombre: " + getNombre() +
                ",\n\t Apellido: " + getApellido() +
                ",\n\t Direccion: " + getDireccion() +
                ",\n\t Parentesco: " + parentesco +
                ",\n\t Tipo de Sangre : " + tipoDeSangre +
                ",\n\t Edad: " + calcularEdad();
    }
}