package numerike;
import java.lang.*;

public class MatricaInverze {
	public double[][] invert(double[][] matrica) {
		int n = matrica.length;
		double x[][] = new double[n][n];
		double b[][] = new double[n][n];
		int index[] = new int[n];
		for (int i = 0; i < n; ++i)
			b[i][i] = 1;
		gaussian(matrica, index);
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
	        	for (int k = 0; k < n; k++)
	        		b[index[j]][k]-= matrica[index[j]][i] * b[index[i]][k];
	       for (int i = 0; i < n; i++) {
	        x[n - 1][i] = b[index[n - 1]][i] / matrica[index[n - 1]][n - 1];
	        for (int j = n - 2; j >= 0; j--) {
	        	x[j][i] = b[index[j]][i];
	               for (int k = j + 1; k < n; k++) {
	                   x[j][i] -= matrica[index[j]][k] * x[k][i];
	               }
	               x[j][i] /= matrica[index[j]][j];
	        	}
	       }
	      return x;
}
public static void gaussian(double numerik[][], int index[]) {
	int n = index.length;
	double c[] = new double[n];
	for (int i = 0; i < n; i++)
		index[i] = i;
    for (int i = 0; i < n; i++) {
    	double c1 = 0;
    	for (int j = 0; j < n; j++) {
    		double c0 = Math.abs(numerik[i][j]);
    		if (c0 > c1) c1 = c0;
    		}
    	c[i] = c1;
   }
   int k = 0;
   for (int j = 0; j < n - 1; j++) {
       double pi1 = 0;
       for (int i = j; i < n; i++) {
           double pi0 = Math.abs(numerik[index[i]][j]);
           pi0 /= c[index[i]];
           if (pi0 > pi1) {
               pi1 = pi0;
               k = i;
           }
       }
       int itmp = index[j];
       index[j] = index[k];
       index[k] = itmp;
       for (int i = j + 1; i < n; i++) {
           double pj = numerik[index[i]][j] / numerik[index[j]][j];
           numerik[index[i]][j] = pj;
           for (int l = j + 1; l < n; l++)
               numerik[index[i]][l] -= pj * numerik[index[j]][l];
       }
   }
}
}


