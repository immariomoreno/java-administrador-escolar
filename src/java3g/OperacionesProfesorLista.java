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
public class OperacionesProfesorLista extends CRUD{
    
     ArrayList<Profesor> objListaProfesor;
     Profesor objProfesor; // crear un objeto Profesor que se use para aplicar polimorfismo en la clase CRUD ya que cuenta actualmente con dos métodos (Estudiante y Profesor)

    public OperacionesProfesorLista() {
        objListaProfesor = new ArrayList();
    }

    @Override
    public void create() {
        objListaProfesor.add(objProfesor);
    }

    @Override
    public void read() {
    }

    @Override
    public void update() {
    }

    @Override
    public void delete() {
    }
    
    public Profesor getObjProfesor() {
        return objProfesor;
    }

    public void setObjProfesor(Profesor objProfesor) {
        this.objProfesor = objProfesor;
    }

    
}
