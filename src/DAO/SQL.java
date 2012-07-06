/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author MEMO
 */
public class SQL {
    public static String insertarAlumno="INSERT INTO alumno(matricula,Nombre,Apaterno,Amaterno,Telefono,Fecha_nac,Idcarrera)VALUES(?,?)";
    
    public static String insertarCarrera= "INSERT INTO carreras(Clave,Carrera)VALUES(?,?)";
    public static String findCarrera= "SELECT * FROM carreras WHERE Idcarrera=?";
    
    
    
}
