import javax.swing.JOptionPane;
public class CalculaSeno {
  public static void main(String[] args) {
    double anguloRad = pedeDouble("Insira o ângulo, em radianos");
    long qtdParcelas = pedeLong("Insira a quantidade de parcelas usadas no cálculo do seno." +
                               "\nQuanto maior a quantidade de parcelas, mais preciso o resultado será," +
                               "mas exigirá mais recursos da máquina,");
    imprime("O seno de " + anguloRad + " radianos é, aproximadamente, " + taylor(anguloRad, qtdParcelas));
  }
  static double pedeDouble(String msg) {
    double retorno = Double.parseDouble(JOptionPane.showInputDialog(msg));
    return retorno;
  }
  static long pedeLong(String msg) {
    long retorno = Long.parseLong(JOptionPane.showInputDialog(msg));
    return retorno;
  }
  static void imprime(String msg) {
    JOptionPane.showMessageDialog(null, msg);
  } 
  static long fatorial(long n) {
    if (n == 0) return (long) 1;
    else return (long) (n * fatorial(n - 1));
  }
  static double taylor(double angulo, long qtdParcelas) {
    if (qtdParcelas == 1) {
      return angulo; 
    } else {
      return ((eleva(angulo, (2 * qtdParcelas) - 1) / fatorial((2 * qtdParcelas) - 1)) * decideSinal(qtdParcelas)) + taylor(angulo, (qtdParcelas - 1));
    }
  }
  static double decideSinal(long num) {
    if ((num % 2) == 0) return -1.0;
    else return 1.0;
  }
  static double eleva(double base, long expoente) {
   if (expoente == 1) return base;
   else return base * eleva(base, expoente - 1);
  }
  
}
