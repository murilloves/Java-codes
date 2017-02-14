/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaed1;

/**
 *
 * @author alunoinf
 */
public interface ListaLinear {

		public boolean seVazia   	();
		public boolean seCheia   	();
		public int pegaTamanho   	();
		public int pegaElemento  	(int indice);
		public int pegaIndice    	(int elemento);
		public int remove    	  	(int indice);
		public void insere       	(int indice, int elemento);
		public String toString    	();

}
