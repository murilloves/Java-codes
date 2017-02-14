/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listalinear;

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
    @Override
        public String toString   ();
}