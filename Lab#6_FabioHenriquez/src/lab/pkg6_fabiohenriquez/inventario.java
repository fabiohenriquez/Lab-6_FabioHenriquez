
package lab.pkg6_fabiohenriquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class inventario {
    private ArrayList <producto> productos = new ArrayList(); 
    private File direccion;

    public inventario() {
    }

    public inventario(String path) {
       this.direccion = new File(path);
        
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<producto> productos) {
        this.productos = productos;
    }

    public File getDireccion() {
        return direccion;
    }

    public void setDireccion(File direccion) {
        this.direccion = direccion;
    }
    

    @Override
    public String toString() {
        return "inventario{" + "productos=" + productos + ", direccion=" + direccion + '}';
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(direccion,false);
            bw = new BufferedWriter(fw);
            for (producto t : productos) {
                bw.write(t.getPrecio_costo()+",");
                bw.write(t.getPrecio_venta()+",");
                bw.write(t.getNombre()+",");
                if (t instanceof bebida) {
                bw.write(((bebida)t).getEstado()+",");
                bw.write(((bebida)t).getTamaño()+",");
                bw.write(((bebida)t).getTipo()+",");
                }else{
                   bw.write(((comida)t).getTipo()+",");  
                }
            }
            bw.flush();
        } catch (Exception e) {
        }
          try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    //cargar archivo
    public void cargarArchivo(){
        Scanner sc = null;
        productos = new ArrayList();
        if (direccion.exists()) {
            try {
            sc = new Scanner(direccion);
            sc.useDelimiter(",");
            while (sc.hasNext()) {                
                if (sc.next().equals("comida")) {
                    String n = sc.next();
                    String tp = sc.next();
                    double pv = sc.nextDouble();
                    double pc = sc.nextDouble();
                    productos.add(new comida(tp, pc, pv, n));
                    }else if (sc.next().equals("bebida")) {
                        String n = sc.next();
                        double pv = sc.nextDouble();
                        double pc = sc.nextDouble();
                        String estado = sc.next();
                        String tam = sc.next();
                        String tipo = sc.next();
                        productos.add(new bebida(estado, tam, tipo, pc, pv, n));
                    }
                } 
        } catch (Exception e) {
        }
        sc.close();
        
        }
        
        
    }
    
  
    
}
