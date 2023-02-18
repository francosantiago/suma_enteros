package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {   
        /*declaración
        de
        variables
        */

        int x;
        int y;
        int z;

        //input
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de y: "));

        //processing

        z = x +y;

        // output

        JOptionPane.showMessageDialog(null, "La suma de " + x  +" y " + y  + " es = " + z);
    }
}