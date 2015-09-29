package ejercicios1;

import javax.swing.JOptionPane;
public class suma {
    
     public static void main(String[] args) {
        // TODO code application logic here
 
String strNumero1;
      String strNumero2;
      int intNumero1;   
      int intNumero2;   
      int suma;
      strNumero1 = JOptionPane.showInputDialog( "Ingrese el entero 1" );
      strNumero2 = JOptionPane.showInputDialog( "Ingrese el entero 2" );
      intNumero1 = Integer.parseInt( strNumero1 );
      intNumero2 = Integer.parseInt( strNumero2 );

      suma = intNumero1 + intNumero2;

      JOptionPane.showMessageDialog(
         null, "La suma es " + suma, "Resultado,",
         JOptionPane.PLAIN_MESSAGE );
     System.exit( 0 );  
         
 
}
}
