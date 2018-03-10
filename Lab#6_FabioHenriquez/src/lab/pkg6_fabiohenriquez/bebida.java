
package lab.pkg6_fabiohenriquez;


public class bebida extends producto{
    private String estado;
    private String tamaño;
    private String tipo;

    public bebida() {
    }

    public bebida(String estado, String tamaño, String tipo, double precio_costo, double precio_venta, String nombre) {
        super(precio_costo, precio_venta, nombre);
        this.estado = estado;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
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
        return "bebida{" + "estado=" + estado + ", tamaño=" + tamaño + ", tipo=" + tipo + '}';
    }
    
    
}
