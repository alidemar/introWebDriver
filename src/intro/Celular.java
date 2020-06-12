package intro;

public class Celular {

    String marcaModelo;
    String nombre;
    double precio;
    int capacidadGigas;

    public Celular(String marcaModelo, String nombre, double precio, int capacidadGigas) {
        this.marcaModelo = marcaModelo;
        this.nombre = nombre;
        this.precio = precio;
        this.capacidadGigas = capacidadGigas;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidadGigas() {
        return capacidadGigas;
    }

    public void setCapacidadGigas(int capacidadGigas) {
        this.capacidadGigas = capacidadGigas;
    }

}
