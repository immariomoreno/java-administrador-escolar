/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3g;

import java.util.ArrayList;

/**
 *
 * @author mariormoreno
 */
public class OperacionesEstudianteLista extends CRUD{ 

    ArrayList<Estudiante> objListaEstudiante;
    Estudiante objEstudiante; // crear un objeto Estudiante que se use para aplicar polimorfismo en la clase CRUD ya que cuenta actualmente con dos métodos (Estudiante y Profesor)

    public OperacionesEstudianteLista() {
        objListaEstudiante = new ArrayList();
    }
    
    
    @Override //aquí empezamos a aplicar el MVC con este método que crea un estudiante a partir de la clase CRUD
    public void create() {
        
        objListaEstudiante.add(objEstudiante);
    }
    

    @Override
    public void read() {
        
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public Estudiante getObjEstudiante() {
        return objEstudiante;
    }

    public void setObjEstudiante(Estudiante objEstudiante) {
        this.objEstudiante = objEstudiante;
    }
    
    
}
