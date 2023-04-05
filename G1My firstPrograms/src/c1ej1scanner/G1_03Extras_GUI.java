/*
 * GUI PROGRAM
La interfaz gráfica de usuario,
conocida también como GUI (del inglés graphical user interface)

 */
package c1ej1scanner;
import javax.swing.JOptionPane;

public class G1_03Extras_GUI {
    public static void main(String[] args) {
        String name =JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null,"Hola " +name);
        
        int edad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        JOptionPane.showMessageDialog(null, "Tienes " +edad + " años.");
        
        double altura =Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));
        JOptionPane.showMessageDialog(null, "Mides " + altura + " metros");
    }
    
}
