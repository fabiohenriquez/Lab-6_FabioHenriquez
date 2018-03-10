
package lab.pkg6_fabiohenriquez;

import java.io.File;
import java.util.ArrayList;



public class ingresos {
   private ArrayList <ventas> venta = new ArrayList();
   private File direecion;

    public ingresos() {
    }

    public ingresos(File direecion) {
        this.direecion = direecion;
    }

    public ArrayList<ventas> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<ventas> venta) {
        this.venta = venta;
    }

    public File getDireecion() {
        return direecion;
    }

    public void setDireecion(File direecion) {
        this.direecion = direecion;
    }

    @Override
    public String toString() {
        return "ingresos{" + "venta=" + venta + ", direecion=" + direecion + '}';
    }
   
   
}
