package PracticoHerencia_E03;

public class Auto extends Vehiculo{
    //Atributos
    private int velocidadMaxima;
    private  String cilindrada;
    //Contructores

    public Auto(int unaVelocidadMaxima , String unaCilindrada) {
        this.velocidadMaxima = unaVelocidadMaxima;
        this.cilindrada = unaCilindrada;
    }

    public Auto(String unColor , int unaRueda , int unaVelocidadMaxima , String unaCilindrada) {
        super(unColor , unaRueda);
        this.velocidadMaxima = unaVelocidadMaxima;
        this.cilindrada = unaCilindrada;
    }

    //Metodos

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int cantVelocidadMaxima) {
        this.velocidadMaxima = cantVelocidadMaxima;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cantCilindrada) {
        this.cilindrada = cantCilindrada;
    }


    public String toString() {
        return  "El Auto tiene una Velocidad Maxima de " + this.getVelocidadMaxima() + " una cilindarda de  "
                + this.getCilindrada() + "  " + super.toString();
    }
}
