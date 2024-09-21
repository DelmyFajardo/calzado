public class ZapatoDeportivoNino implements ZapatoInterfazNino{

    private String color;
    private int talla;
    private ZapatoInterfazNino zapatoInterfazNino;

    public ZapatoDeportivoNino(String color, int talla, ZapatoInterfazNino zapatoInterfazNino) {
        this.color = color;
        this.talla = talla;
        this.zapatoInterfazNino = zapatoInterfazNino;
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

    public ZapatoInterfazNino getZapatoInterfazNino() {
        return zapatoInterfazNino;
    }

    public void setZapatoInterfazNino(ZapatoInterfazNino zapatoInterfazNino) {
        this.zapatoInterfazNino = zapatoInterfazNino;
    }

    @Override
    public void calzadotermiandoNino() {

    }
}
