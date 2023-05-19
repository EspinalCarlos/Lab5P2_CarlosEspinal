
package lab5p2_carlosespinal;

import java.util.ArrayList;



public class Escuadron {
    private String SName;
    private String Localidad;
    private String HV;
    private ArrayList<Persona> Integrantes = new ArrayList();
    private Persona Leader;

    public Escuadron() {
    }
    
    

    public Escuadron(String SName, String Localidad, String HV) {
        this.SName = SName;
        this.Localidad = Localidad;
        this.HV = HV;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getHV() {
        return HV;
    }

    public void setHV(String HV) {
        this.HV = HV;
    }

    public ArrayList<Persona> getIntegrantes() {
        return Integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> Integrantes) {
        this.Integrantes = Integrantes;
    }

    
    public String toString1() {
        return "Squad Name: " + SName + "\nLocalidad: " + Localidad + "\nTipo de Escuadron: " + HV;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "SName=" + SName + ", Localidad=" + Localidad + ", HV=" + HV + ", Integrantes=" + Integrantes + ", Leader=" + Leader + '}';
    }
    
    
    
    
}
