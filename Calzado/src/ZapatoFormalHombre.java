public class ZapatoFormalHombre implements ZapatoInterfazHombre{

    private String color;
    private int talla;
    private ZapatoInterfazHombre interfazHombre;

    public ZapatoFormalHombre(String color, int talla, ZapatoInterfazHombre interfazHombre) {
        this.color = color;
        this.talla = talla;
        this.interfazHombre = interfazHombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public ZapatoInterfazHombre getInterfazHombre() {
        return interfazHombre;
    }

    public void setInterfazHombre(ZapatoInterfazHombre interfazHombre) {
        this.interfazHombre = interfazHombre;
    }

    @Override
    public void calzadoTerminado() {

    }

    @Override
    public void calzadoDeportivoHombre() {

    }
}
