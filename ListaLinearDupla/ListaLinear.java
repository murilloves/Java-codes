/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listalinearedupla;

/**
 *
 * @author alunoinf
 */
public interface ListaLinear {
    
        public boolean seVazia   ();
        public boolean seCheia   ();
        public int pegaTamanho   ();
        public Comparable pegaElemento  (int indice);
        public int pegaIndice    (Comparable elemento);
        public Comparable remove (int indice);
        public void insere  (int indice, Comparable elemento);
        public String toString   ();

}
