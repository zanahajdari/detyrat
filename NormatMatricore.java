package numerike;
import javax.swing.JOptionPane;

public class NormatMatricore {
    
public static double L2Norma(double[] b) {
       double shuma = 0;
       for (int i = 0; i < b.length; i++) {
           shuma += Math.pow(Math.abs(b[i]), 2);
       }
       return shuma = Math.sqrt(shuma);
   }
public static int LInfinitNorma(double[] b) {
      int max = 0;
      for (int i = 0; i < b.length; i++) {
          if (Math.abs(b[i]) >= Math.abs(max)) {
              max = (int) b[i];
           }
       }
      return Math.abs(max);
}
public static double distancaEuklidiane(double[] x, double[] x0) {
      double shuma = 0;
      for (int i = 0; i < x.length; i++) {
          shuma += Math.pow(Math.abs(x[i] - x0[i]), 2);
       }
      return shuma = Math.sqrt(shuma);}

public static double distancaMaksimale(double[] x, double[] x0) {
	double max = 0;
    for (int i = 0; i < x.length; i++) {
    	if (Math.abs(x[i] - x0[i]) >= max) {
    		max = Math.abs(x[i] - x0[i]);
    		}
       }
      return max;
} 
public static int[] ktheShume(double[][] a) {
	int[] shuma = new int[a.length];
    for (int i = 0; i < a.length; i++) {
    	for (int j = 0; j < a.length; j++) {
    		shuma[i] += Math.abs(a[i][j]);
    		}
    	}
    return shuma;
}
public static int vleraInfinit(double[][] a) {
	int[] shuma = ktheShume(a);
    int max = 0;
    for (int i = 0; i < shuma.length; i++) {
    	if (shuma[i] >= max) {
    		max = shuma[i];
    		}
    	}
    return max;
    }
public static double normaFrobenius(double[][] A){
		double shuma = 0;
        for (int i = 0; i < A.length; i++) {
           for (int j = 0; j < A.length; j++) {
               shuma += Math.pow(Math.abs(A[i][j]), 2);
           }
       }
       shuma = Math.sqrt(shuma);
       return shuma;
   }
   
public static double[] vektori(double[] vektori) {
       int n = new Double(JOptionPane.showInputDialog("Sheno gjatesine e vargut :")).intValue();
       double[] B = new double[n];
       for (int i = 1; i < n; i++)
       {

          B[i] = new Double(JOptionPane.showInputDialog("Sheno elementin  a[" + i + "]:")).doubleValue();

       }
       return B;
   }

public static double[][] matrica(double[][] matrica) {
      int n = new Double(JOptionPane.showInputDialog("Sheno rendin e matrices :")).intValue();
      double[][] A = new double[n][n];
      for (int i = 1; i < n; i++)
       {
           for (int j = 1; j < n; j++) {
               A[i][j] = new Double(JOptionPane.showInputDialog("Sheno elementin a[" + i + ", " + j + "]:")).doubleValue();
           }
       }
       return A;
   }
public static void main(String[] args) {
       double[][] A = matrica(null);
       double[] B = vektori(null);
       double[] x = vektori(null);
       double[] x0 = vektori(null);
       double shuma = L2Norma(B);
       System.out.println("L2 Norma e vektorit B eshte : " + shuma);
       double max1 = LInfinitNorma(B);
       System.out.println("LInfinit Norma e vektorit B eshte :" + max1);

       double shuma1 = normaFrobenius(A);
       System.out.println("Norma Frobenius e matrices A eshte: " + shuma1);

       double max2 = vleraInfinit(A);
       System.out.println("Norma infinit e matrices A eshte: " + max2);

       double shuma3 = distancaEuklidiane(x, x0);
       System.out.println("Distanca Euklidiane eshte : " + shuma3);

       double max3 = distancaMaksimale(x, x0);
       System.out.println("Distanca Maksimale eshte : " + max3);
   }
}

