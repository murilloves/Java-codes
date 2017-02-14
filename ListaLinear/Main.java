/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listalinear;

/**
 *
 * @author alunoinf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XListaLinear lista = new XListaLinear();
        lista.insere(1, 8);
        lista.insere(1, 7);
        lista.insere(1, 33);
        lista.insere(1, 44);
        lista.insere(1, 12);
        lista.insere(1, 13);

      lista.paresNoInicio(lista);
//      lista.remove(6);

      for(int i=0; i<lista.pegaTamanho(); i++)
        System.out.println(lista.pegaElemento(i));

        // TODO code application logic here
    }

}
