/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

/**
 *
 * @author MEMO
 */
public class Alumno extends Persona {
    
    private String matricula;
    
    Carrera carrera= new Carrera();

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }
    
    

}
