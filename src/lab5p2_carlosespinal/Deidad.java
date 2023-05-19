
package lab5p2_carlosespinal;


public class Deidad extends Extraterrestre{
    private boolean Creyente;
    private String Religion;

    public Deidad() {
        super();
    }

    public Deidad(boolean Creyente, String Religion, String Name, String Power, String Weakness, Escuadron Tag, int Fuerza, int AgilidadFisica, int AgilidadMental) {
        super(Name, Power, Weakness, Tag, Fuerza, AgilidadFisica, AgilidadMental);
        this.Creyente = Creyente;
        this.Religion = Religion;
    }

    public boolean isCreyente() {
        return Creyente;
    }

    public void setCreyente(boolean Creyente) {
        this.Creyente = Creyente;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String Religion) {
        this.Religion = Religion;
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
        return super.toString()+" Creyentes? :" + Creyente + ", Religion: " + Religion;
    }
    
    
    
    
}
