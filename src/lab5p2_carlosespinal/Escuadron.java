
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

    public Persona getLeader() {
        return Leader;
    }

    public void setLeader(Persona Leader) {
        this.Leader = Leader;
    }
    

    
    @Override
    public String toString() {
        return "Squad Name: " + SName + "\nLocalidad: " + Localidad + "\nTipo de Escuadron: " + HV + "\nLider: "+Leader+ "\n------------\n";
    }

    
    
    
    
    
}
