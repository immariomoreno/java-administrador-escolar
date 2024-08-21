package java3g;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariormoreno
 */
public class Validador {

    public Validador() {
    }
    
    public boolean validarCajaTextoCadena(JTextField cajaTexto){ //patron de diseño: método descriptivo
        if (cajaTexto.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campo requerido urgente");
            return false;
        }
        return true;
    }
    
    public boolean validarCajaTextoEntero(JTextField cajaTexto){ //patron de diseño: método descriptivo
        if (cajaTexto.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campo requerido urgente");
            return false;
        } else {
            
            try{
                int a = Integer.parseInt(cajaTexto.getText());
                
            }catch(NumberFormatException e){
                System.err.println("Error de conversión");
                JOptionPane.showMessageDialog(null, "Valor no permitido, debe ser un número");
                return false;
                
            }
            return true;
        }
    }
    
     public boolean validarCajaTextoEdad(JTextField cajaTexto){ //patron de diseño: método descriptivo
         int a = 0;
        if (cajaTexto.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campo requerido urgente");
            return false;
        } else {
            
            try{
                a = Integer.parseInt(cajaTexto.getText());
                
            }catch(NumberFormatException e){
                System.err.println("Error de conversión");
                JOptionPane.showMessageDialog(null, "Valor no permitido, debe ser un número");
                return false;
                
            }
            
            if (a < 0 || a > 100){
                
            } else {
                JOptionPane.showMessageDialog(null, "Valor no permitido, debe ser un número");
                return false;
            }
            return true;
        }
    }
    
    public boolean validarCadena(String cadena){ //patron de diseño: método descriptivo
        if (cadena.isBlank()) {
            JOptionPane.showMessageDialog(null, "Campo requerido de la cadena");
            return false;
        }
        return true;
    }
}
