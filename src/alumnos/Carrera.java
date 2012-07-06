/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

/**
 *
 * @author MEMO
 */
public class Carrera implements Bean {
   private String clave;
   private String carrera;

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave.toUpperCase();
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
