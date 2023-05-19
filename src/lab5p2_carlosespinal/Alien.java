
package lab5p2_carlosespinal;


public class Alien extends Extraterrestre{
    private String Planeta;

    public Alien() {
        super();
    }

    public Alien(String Planeta, String Name, String Power, String Weakness, Escuadron Tag, int Fuerza, int AgilidadFisica, int AgilidadMental) {
        super(Name, Power, Weakness, Tag, Fuerza, AgilidadFisica, AgilidadMental);
        this.Planeta = Planeta;
    }

    public String getPlaneta() {
        return Planeta;
    }

    public void setPlaneta(String Planeta) {
        this.Planeta = Planeta;
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
        return super.toString()+ " Planeta: " + Planeta;
    }
    
    
    
    
    
}
