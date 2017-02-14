/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * 0  4  2
 * 1  2  3
 *-1  2  0
 *
 * -12+4+4=-4
 * @author alunoinf
 */
public class Matriz implements Matrizes{
        int mat[][]= new int[3][3];
        int t=0;
        public void alteramatriz(){
            this.mat[1][0]=1;
            this.mat[1][1]=2;
            this.mat[1][2]=3;
            this.mat[2][0]=-1;
            this.mat[2][1]=2;
            this.mat[2][2]=0;
            this.mat[0][0]=0;
            this.mat[0][1]=4;
            this.mat[0][2]=2;
        }

        public int determinante(){
            int det, vai=0, volta=0;
            for(int i=0; i<3; i++){
                vai = vai    +     (mat[i][i]  *  mat[(i+1)%3][(i+1)%3]  *  mat[(i+2)%3][(i+2)%3]);
                volta = volta   +  (mat[i][i]  *  mat[(i-1)%3][(i-1)%3]  *  mat[(i-2)%3][(i-2)%3]);
            }
                det = vai-volta;
            return det;
        }

    @Override
        public String toString(){
            String str="";
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    str = str +" "+ this.mat[i][j];
                }
                str = str + "\n";
            }
            return str;
        }

}
