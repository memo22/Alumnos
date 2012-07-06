/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import DAO.CarreraDAO;

/**
 *
 * @author MEMO
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarreraDAO carreraDAO= new CarreraDAO();
        Carrera carrera =new Carrera();
        Carrera carrera= new Carrera ("ISEi","Sistemas");
        carreraDAO.insert(carrera);
    }
}
