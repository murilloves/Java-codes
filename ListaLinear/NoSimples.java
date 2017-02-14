/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listalinear;

/**
 *
 * @author murillo
 */
public class NoSimples{
       private Comparable elemento;
       private NoSimples proximo;

       public NoSimples(){
           this.elemento = null;
           this.proximo = null;
       }
     /*Atribui valor ao no*/
       public NoSimples (Comparable element, NoSimples prox){
           alteraElemento(element);
           alteraProximo(prox);
       }
            /*Atribui valor ao elemento do nó*/
           public Comparable pegaElemento(){
               return elemento;
           }
            /*Atribui valor ao apontador para o próximo nó*/
           public NoSimples pegaProximo(){
               return proximo;
           }

            /*Altera valor de elemento?*/
           public void alteraElemento(Comparable elem){
               this.elemento = elem;
           }
            /*Altera valor de proximo?*/
           public void alteraProximo(NoSimples prox){
               this.proximo = prox;
           }
}