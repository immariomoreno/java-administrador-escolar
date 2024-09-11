/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.EstudianteAlta;

/**
 *
 * @author mariormoreno
 */
public class ControladorEstudianteAlta implements ActionListener { //cuando usamos implements es para interfaces, extends es para clases y métodos abstractos
    
    EstudianteAlta objEstudianteAlta; //variable local para referenciar al objEstudianteAlta
    
    public ControladorEstudianteAlta(EstudianteAlta objEstudianteAlta){
     this.objEstudianteAlta = objEstudianteAlta;  
     objEstudianteAlta.jButton1.addActionListener(this);//agregar manualmente un escuchador; Se hizo publico el boton en la clase EstudianteAlta JButton1
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == objEstudianteAlta.jButton1){
            System.out.println("Escuchador de botón");
        }
        
        /*
         //Ingresabdo un espacio en blanco el resultado es length: 1, isEmpty:false, isBlank: true
        this.validaCampoTexto2();
        System.out.println("Resultado Length:"+this.jTextField1.getText().length()); No es tan conveniente porque estamos manejando objetos
        System.out.println("Resultado Empty:"+this.jTextField1.getText().isEmpty()); IsEmpty toma en cuenta los espacios vacíos
        System.out.println("Resultado Blank:"+this.jTextField1.getText().isBlank()); IsBlank ignora espacios vacíos
        
        objEstudiante = new Estudiante(); //aquí se soluciona el problema de que no se creaba el nuevo objeto 
        System.out.println("Matricula:" + this.jTextField1.getText());
        System.out.println("Nombre:" + this.jTextField2.getText());
        System.out.println("Apellido Paterno:" + this.jTextField3.getText());
        System.out.println("Apellido Materno:" + this.jTextField4.getText());
        System.out.println("Edad:" + this.jTextField5.getText()); 
        objEstudiante.setMatricula(Integer.parseInt(this.jTextField1.getText()));
        objEstudiante.setNombre(this.jTextField2.getText());
        objEstudiante.setApellidoPaterno(this.jTextField3.getText());
        objEstudiante.setApellidoMaterno(this.jTextField4.getText());
        objEstudiante.setEdad(Integer.parseInt(this.jTextField5.getText()));
        listaEstudiante.add(objEstudiante);
        limpiar();
        imprimirLista();
        */
    }
     
}
