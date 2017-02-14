/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilha;

/**
 *
 * @author alunoinf
 */
public interface Pilha {

        public int pegaTamanho ();
        public boolean seVazia ();
        public boolean seCheia ();
        public Comparable topo ();                  // top
        public void empilha (Comparable elemento);  // push
        public Comparable desempilha ();            // pop
        public String toString();

}
