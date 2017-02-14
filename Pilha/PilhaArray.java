/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilha;

/**
 *
 * @author alunoinf
 */
public class PilhaArray implements Pilha{
       private Comparable[] elementos;
       private int tamanho;

       
    public PilhaArray (int max) {
           this.tamanho = 0;
           this.elementos = new Comparable[max];
    }

    public boolean seVazia ()   { return (tamanho == 0); }

    public boolean seCheia ()   { return (tamanho == elementos.length); }

    public Comparable topo () {
           if(tamanho==0) throw new RuntimeException("Pilha Vazia, saudade suaaa, dia nublado, vento gelado nooooooite sem lua!");
           return elementos [tamanho-1];
    }

    public Comparable desempilha() {
      if(tamanho==0) throw new RuntimeException("Pilha Vazia, saudade suaaa, dia nublado, vento gelado nooooooite sem lua!");
         else{
            elementos[tamanho]=null;
            tamanho--;
            return elementos[tamanho];
         }
    }

    public void empilha(Comparable elemento) {
      if(tamanho==elementos.length) throw new RuntimeException("Pilha Cheia!");
         else{
           this.elementos[tamanho]=elemento;
           tamanho++;
           return;
         }
    }

    public int pegaTamanho() {
      return this.tamanho;
    }

    public String toString(){
        String estringue = "";
        for(int t=0; t<pegaTamanho(); t++){
            estringue = estringue + "elemento["+(t+1)+"]: " + elementos[t] + "\n";
        }
        return estringue;
    }

}
