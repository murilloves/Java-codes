/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listalinear;

/**
 *
 * @author alunoinf
 */
public class XListaLinear implements ListaLinear{

        private int tamanho;
        private NoSimples inicio;

        public XListaLinear(){
            this.tamanho=0;
            this.inicio=null;
        }

        public int pegaTamanho(){
                return this.tamanho;
        }

        public Comparable pegaElemento(int indice){
            NoSimples node = this.inicio;
            for(int b=1; b<= indice; b++)
                node = node.pegaProximo();
            return node.pegaElemento();
        }

        public NoSimples pegaNo(int indice){
            NoSimples node = this.inicio;
            for(int b=1; b< indice; b++)
                node = node.pegaProximo();
            return node;
        }

        public void insere(int indice, Comparable elemento){
            NoSimples p= new NoSimples (elemento,null);
            if (indice==1){
                p.alteraProximo(inicio);
                inicio = p;
            }
            else{
                NoSimples aux = pegaNo(indice-1);
                aux.alteraProximo(p);
                //NOT FINISHED YET
            }
            this.tamanho++;
        }

        public Comparable remove(int indice){
            NoSimples aux = inicio;
            if(indice==1){
                inicio = aux.pegaProximo();
            }
            else
            {
                NoSimples ant = pegaNo(indice-1);
                aux = ant.pegaProximo();
                ant.alteraProximo(aux.pegaProximo());
            }
            this.tamanho--;
            return aux.pegaElemento();
        }

        public void paresNoInicio(XListaLinear lista){
                int pos = 1;
                for(int i=2; i<=this.pegaTamanho(); i++)
                        if((Integer)pegaElemento(i)%2==0){
                            insere(pos, remove(i));
                            pos++;
                        }
/*
                    //Ordenando os pares
                    for(int i=1; i<=pos; i++)
                        for(int j=i+1; i<=pos; j++)
                            if(pegaElemento(i).compareTo(pegaElemento(j))>0){
                                insere(i, remove(j));
                            }

                    //POGdernando os impares
                    for(int i=pos+1; i<=pegaTamanho(); i++)
                        for(int j=i+1; i<=pegaTamanho(); j++)
                            if(pegaElemento(i).compareTo(pegaElemento(j))>0){
                                insere(i, remove(j));
                            }
 */           }

        public void ordenaPares(){

        }
            public boolean seOrdenada(){
                return false;
            }

    public boolean seVazia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean seCheia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int pegaIndice(Comparable elemento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
