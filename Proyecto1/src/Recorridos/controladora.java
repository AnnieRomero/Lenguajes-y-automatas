package Recorridos;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class controladora {
	 public static void main(String args [])
	    {
	        Arbol arbol = new Arbol();
	        Scanner teclado = new Scanner(System.in);
	        char valor;
	        int Dato;
	         
	       // System.out.println("Insertando los siguientes valores: ");
	         
	        System.out.println("Inserta el numero de nodos que desea ingresar");
	        int n = teclado.nextInt();
	         
	        for(int i = 1; i <= n; i++ )
	        {
	        	System.out.println("Dame el " + i + " valor para colocar en el Arbol");
	            valor = teclado.next().charAt(0);
	            arbol.insertarNodo(valor);
	        }
	         
	        System.out.println("\n\nRecorrido Inorden");
	        arbol.recorridoPreorden();
	         
	        System.out.println("\n\nRecorrido Preorden");
	        arbol.recorridoInorden();
	         
	        System.out.println("\n\nRecorrido Postorden");
	        arbol.recorridoPosorden();
	    }
}
