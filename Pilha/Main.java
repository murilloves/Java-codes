/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilha;

/**
 *
 * @author alunoinf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pilha obj = new PilhaArray (50);
        obj.empilha ("pedro");
        obj.empilha ("ana");
        obj.empilha ("maria");
        obj.empilha ("luis");

        System.out.println(obj);
        System.out.println(obj.desempilha());
        System.out.println("\n\n"+obj);
    }

}
