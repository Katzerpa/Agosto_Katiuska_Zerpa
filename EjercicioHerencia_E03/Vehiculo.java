package PracticoHerencia_E03;

public class Vehiculo {
    //Atributo
    protected String color;
    protected int rueda;
    //Contructores

    public Vehiculo() {
        this.color = "Blanco";
        this.rueda = 2;
    }

    public Vehiculo(String unColor , int unaRueda) {
        this.color = unColor;
        this.rueda = unaRueda;
    }
    //Metodos

    public String getColor() {
        return color;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }

    public int getRueda() {
        return rueda;
    }

    public void setRueda(int unaRueda) {
        this.rueda = unaRueda;
    }

    public String toString() {
        return " Color : " + this.getColor() + " Cantidad de Rueda : "  + this.getRueda() ;
    }
}
