
package lab.pkg6_fabiohenriquez;


public class comida extends producto{
    private String tipo;

    public comida() {
    }

    public comida(String tipo, double precio_costo, double precio_venta, String nombre) {
        super(precio_costo, precio_venta, nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "comida " + "tipo=" + tipo + '}';
    }
    
    
}
