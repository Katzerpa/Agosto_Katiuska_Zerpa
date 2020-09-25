package PracticoHerencia_E03;

public class SemiRemolque extends Vehiculo {
    //Atributo
    private int cantidadEjes;
    //Constructores


    public SemiRemolque() {
        this.cantidadEjes =1 ;
    }

    public SemiRemolque(String unColor , int unaRueda, int esCantidadEjes) {
        super(unColor , unaRueda);
        this.color = unColor;
        this.rueda = unaRueda;
        this.cantidadEjes = esCantidadEjes;
    }
    //Metodos

    public int getCantidadEjes() {

        return cantidadEjes;
    }

    public void setCantidadEjes(int esCantidadEjes) {

        this.cantidadEjes = esCantidadEjes;
    }

    @Override
    public String toString() {
        return "El Semi Remolque tiene Cantidad de Eje:  " + this.getCantidadEjes()
                + " " + super.toString();
    }
}
