public class ZapatoDeportivoMujer implements ZapatoInterfazMujer{

    public String color;
    private int talla;
    private ZapatoInterfazMujer interfazMujer;

    public ZapatoDeportivoMujer(String color, int talla, ZapatoInterfazMujer interfazMujer) {
        this.color = color;
        this.talla = talla;
        this.interfazMujer = interfazMujer;
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

    public ZapatoInterfazMujer getInterfazMujer() {
        return interfazMujer;
    }

    public void setInterfazMujer(ZapatoInterfazMujer interfazMujer) {
        this.interfazMujer = interfazMujer;
    }

    @Override
    public void calzadoTerminadoMujer() {

    }
}
