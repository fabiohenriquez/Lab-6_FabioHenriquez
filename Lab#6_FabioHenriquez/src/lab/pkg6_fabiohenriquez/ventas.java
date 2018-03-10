
package lab.pkg6_fabiohenriquez;


public class ventas {
    private double total_venta;
    private String fecha_venta;

    public ventas() {
    }

    public ventas(double total_venta, String fecha_venta) {
        this.total_venta = total_venta;
        this.fecha_venta = fecha_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    @Override
    public String toString() {
        return "ventas{" + "total_venta=" + total_venta + ", fecha_venta=" + fecha_venta + '}';
    }
    
    
}
