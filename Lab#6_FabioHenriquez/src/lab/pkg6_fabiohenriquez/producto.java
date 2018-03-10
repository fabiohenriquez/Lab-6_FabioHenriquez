
package lab.pkg6_fabiohenriquez;

public class producto {
    double precio_costo;
    double precio_venta;
    String nombre;

    public producto() {
    }

    public producto(double precio_costo, double precio_venta, String nombre) {
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.nombre = nombre;
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
        return "precio_costo: " + precio_costo + ", precio_venta: " + precio_venta + ", nombre: " + nombre ;
    }
    
    public double IVS(double precio_venta){
         double impuesto=0, subtotal=0;
         subtotal=precio_venta*1.15;
         
         
        return subtotal;
    }
    
    public double impuesto(double subtotal){
        double imp=subtotal*0.15;
        return imp;
    }
    
}
