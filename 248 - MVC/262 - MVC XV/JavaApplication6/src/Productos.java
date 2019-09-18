
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcv
 */
public class Productos 
{
   
    private String cArt;
    
    private String seccion;
    
    private String nArt;
    
    private double precio;
    
    private Date fecha;
    
    private String importado;
    
    private String pOrig;

    public Productos(String cArt, String seccion, String nArt, double precio, Date fecha, String importado, String pOrig) 
    {
        this.cArt = cArt;
        this.seccion = seccion;
        this.nArt = nArt;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.pOrig = pOrig;
    }

    public Productos(String seccion, String nArt, double precio, Date fecha, String importado, String pOrig) 
    {
        this.seccion = seccion;
        this.nArt = nArt;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.pOrig = pOrig;
    }

    public String getcArt() {
        return cArt;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getnArt() {
        return nArt;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getImportado() {
        return importado;
    }

    public String getpOrig() {
        return pOrig;
    }

    public void setcArt(String cArt) {
        this.cArt = cArt;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setnArt(String nArt) {
        this.nArt = nArt;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public void setpOrig(String pOrig) {
        this.pOrig = pOrig;
    }

    @Override
    public String toString() {
        return "Productos{" + "cArt=" + cArt + ", seccion=" + seccion + ", nArt=" + nArt + ", precio=" + precio + ", fecha=" + fecha + ", importado=" + importado + ", pOrig=" + pOrig + '}';
    }
    
    
    
    
}
