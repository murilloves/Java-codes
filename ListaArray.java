/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaed1;

/**
 *
 * @author alunoinf
 */
public class ListaArray implements ListaLinear{
        private int [] elementos;
        private int tamanho;
        public ListaArray(int tamanho){
                elementos = new int [tamanho];
                this.tamanho = 0;
        }

    public boolean seVazia(){
            if(tamanho == 0){
                return true;
            }
            return false;
        }

    public boolean seCheia(){
            if(tamanho == elementos.length){
                return true;
            }
            return false;
        }


    public int pegaTamanho() {
            return this.tamanho;
    }

    public int pegaElemento(int indice) {
            return this.elementos[indice];
    }

    public int pegaIndice(int elemento) {
        for(int i=0; i<this.tamanho; i++){
            if(elementos[i]==elemento)
                return i;
        }
                return -1;
    }

    public int remove(int indice) {
        int i, var= this.elementos[indice];
        for(i=indice; i<this.tamanho; i++){
            elementos[i]=elementos[i++];
        }
        this.tamanho--;
        return var;
    }

    public void insere(int indice, int elemento) {
         int i;
         this.tamanho++;
         for(i=this.tamanho-1; i>indice; i--){
             elementos[i++]= elementos[i];
         }
         elementos[i]=elemento;
    }


}
