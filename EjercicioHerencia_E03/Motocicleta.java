package PracticoHerencia_E03;

public class Motocicleta extends Vehiculo{
    //Atributos
    private  int velocidad;
    private  String cilindrada;
    //Contructor

    public Motocicleta(int velocidad , String cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String color , int rueda , int velocidad , String cilindrada) {
        super(color , rueda);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
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
