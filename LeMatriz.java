import javax.swing.JOptionPane;
public class LeMatriz {
  public static void main(String[] args) {
    int tamMatriz = pedeInt("Insira o tamanho da matriz a ser verificada");
    int[][] matriz = new int[tamMatriz][tamMatriz];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = pedeInt("Insira o elemento inteiro da linha " + (i + 1) + 
                               ", coluna " + (j + 1) + 
                               ",  da matriz " + tamMatriz + 
                               " por "+ tamMatriz);
      }
    }
    if (verificaSeSimetrica(matriz)) imprime("A matriz é simétrica");
    else imprime("A matriz não é simétrica");
  }
  static int pedeInt(String msg) {
    int retorno = Integer.parseInt(JOptionPane.showInputDialog(msg));
    return retorno;
  }
  static void imprime(String msg) {
    JOptionPane.showMessageDialog(null, msg);
  } 
  static boolean verificaSeSimetrica(int[][] matriz) {
    boolean retorno = true;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if(matriz[i][j] != matriz[j][i]) {
          retorno = false;
          break;
        }
      }
    }
    return retorno;
  }
}
