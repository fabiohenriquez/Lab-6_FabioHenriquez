/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_fabiohenriquez;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author FABIO
 */
public class factura {
    private ArrayList <producto> productos = new ArrayList();
    private String correo;
    private String nombre_cliente;
    private String rtn;
    private String cai;
    private String fecha;

    public factura() {
    }

    public factura(String correo, String nombre_cliente, String rtn, String cai,String fecha) {
        this.correo = correo;
        this.nombre_cliente = nombre_cliente;
        this.rtn = rtn;
        this.cai = cai;
        this.fecha = fecha;
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<producto> productos) {
        this.productos = productos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getCai() {
        return cai;
    }

    public void setCai(String cai) {
        this.cai = cai;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
   
    @Override
    public String toString() {
        return "factura{" + "productos=" + productos + ", correo=" + correo + ", nombre_cliente=" + nombre_cliente + ", rtn=" + rtn + ", cai=" + cai + '}';
    }
    
    /*public void escribirArchivo(){
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
        
    }*/
    
    
}
