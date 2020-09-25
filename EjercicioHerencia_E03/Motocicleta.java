package PracticoHerencia_E03;

public class Motocicleta extends Vehiculo{
    //Atributos
    private  int velocidad;
    private  String cilindrada;
    //Contructor

    public Motocicleta(int unaVelocidad , String unaCilindrada) {
        this.velocidad = unaVelocidad;
        this.cilindrada = unaCilindrada;
    }

    public Motocicleta(String unColor , int unaRueda , int unaVelocidad , String unaCilindrada) {
        super(unColor , unaRueda);
        this.velocidad = unaVelocidad;
        this.cilindrada = unaCilindrada;
    }
    //Metodo

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int cantVelocidad) {
        this.velocidad = cantVelocidad;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cantCilindrada) {
        this.cilindrada = cantCilindrada;
    }

    public String toString() {
        return " La motocicleta  tiene  una Velocidad Maxima de: " + this.getVelocidad() +
                " Cilindrada  " + this.getCilindrada() + " " + super.toString() ;
    }
}
