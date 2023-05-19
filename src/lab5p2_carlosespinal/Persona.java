
package lab5p2_carlosespinal;

public class Persona {
    protected String Name;
    protected String Power;
    protected String Weakness;
    protected Escuadron Tag;
    protected int Fuerza;
    protected int AgilidadFisica;
    protected int AgilidadMental;

    public Persona() {
    }

    
    
    public Persona(String Name, String Power, String Weakness, Escuadron Tag, int Fuerza, int AgilidadFisica, int AgilidadMental) {
        this.Name = Name;
        this.Power = Power;
        this.Weakness = Weakness;
        this.Tag = Tag;
        this.Fuerza = Fuerza;
        this.AgilidadFisica = AgilidadFisica;
        this.AgilidadMental = AgilidadMental;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String Power) {
        this.Power = Power;
    }

    public String getWeakness() {
        return Weakness;
    }

    public void setWeakness(String Weakness) {
        this.Weakness = Weakness;
    }

    public Escuadron getTag() {
        return Tag;
    }

    public void setTag(Escuadron Tag) {
        this.Tag = Tag;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public int getAgilidadFisica() {
        return AgilidadFisica;
    }

    public void setAgilidadFisica(int AgilidadFisica) {
        this.AgilidadFisica = AgilidadFisica;
    }

    public int getAgilidadMental() {
        return AgilidadMental;
    }

    public void setAgilidadMental(int AgilidadMental) {
        this.AgilidadMental = AgilidadMental;
    }

    @Override
    public String toString() {
        return "Nombre: " + Name + ", Poder:" + Power;
    }
    
    
    
    
    
    
}
