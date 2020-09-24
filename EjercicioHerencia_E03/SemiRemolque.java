package PracticoHerencia_E03;

public class SemiRemolque extends Vehiculo {
    //Atributo
    private int cantidadEjes;
    //Constructores


    public SemiRemolque() {
        this.cantidadEjes =1 ;
    }

    public SemiRemolque(String color , int rueda, int cantidadEjes) {
        super(color , rueda);
        this.color = color;
        this.rueda = rueda;
        this.cantidadEjes = cantidadEjes;
    }
    //Metodos

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    @Override
    public String toString() {
        return "El Semi Remolque tiene Cantidad de Eje:  " + this.getCantidadEjes()
                + " " + super.toString();
    }
}
