/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listalinearedupla;

/**
 *
 * @author alunoinf
 */
public class ListaLinearEDupla implements ListaLinear{

    private int tamanho;
    private NoDuplo inicio;

        public ListaLinearEDupla(){
            this.tamanho = 0;
            this.inicio = null;
        }

    
        public boolean seVazia(){
            if (this.tamanho == 0)
                return true;
            else
                return false;
        }

        public boolean seCheia(){
                return false; //Exite Lista encadeada cheia?
        }

        public int pegaTamanho(){
            return this.tamanho;
        }

        public Comparable pegaElemento (int indice){
            return null;
        }

        public int pegaIndice(Comparable elemento){
            
            return 1;
        }

    public Comparable remove(int indice) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insere(int indice, Comparable elemento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
