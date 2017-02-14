/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listalinearedupla;

/**
 *
 * @author alunoinf
 */
public class NoDuplo {
        private NoDuplo anterior;
        private Comparable elemento;
        private NoDuplo proximo;

        public NoDuplo(){
            this(null, null, null);
        }

        public NoDuplo pegaAnterior() { return this.anterior; }
        public Comparable pegaElemento() { return this.elemento; }
        public NoDuplo pegaProximo() { return this.proximo; }

        public void alteraAnterior() {
            this.anterior = anterior;
        }
        public void alteraElemento() {
            this.elemento = elemento;
        }
        public void alteraProximo() {
            this.proximo = proximo;
        }

        public NoDuplo(NoDuplo anterior, Comparable elemento, NoDuplo proximo){
            alteraAnterior (anterior);
            alteraElemento (elemento);
            alteraProximo  (proximo);
        }

}
