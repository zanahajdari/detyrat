package numerike;
import javax.swing.JOptionPane;

public class ShkronjaNeNumra {
    private static ShkronjaNumer ed = new ShkronjaNumer();
    private static MatricaInverze invers = new MatricaInverze();
    
public static String[][] formoMatricen() {
    String dimensioni = JOptionPane.showInputDialog("Shenoni rendin e matrices:");
    int n = Integer.parseInt(dimensioni);
    String matrica[][] = new String[n][n];
    for (int i = 0; i < n; i++) {
    	for (int j = 0; j < n; j++) {
    		int x = i + 1;
    		int y = j + 1;
    		String elementi = JOptionPane.showInputDialog("Sheno  elementin " + x + ", " + y + " te matries:");
    		boolean isValid = true;
    		while (isValid) {
    			if (elementi == null) {
    				System.exit(0);}
    			if (elementi.length() != 1 || elementi.equals("0") || elementi.equals("1") || elementi.equals("2")|| elementi.equals("3") || elementi.equals("4") || elementi.equals("5") 
    					|| elementi.equals("6")|| elementi.equals("7") || elementi.equals("8") || elementi.equals("9")) {
    				elementi = JOptionPane.showInputDialog("Vlere jo valide per elementin " + x + ", " +y + " te matries, " + "jep vlere tjeter:");}
    			else {
    				isValid = false;
    			}
    		}
    		matrica[i][j] = elementi;
    	}
    }
    return matrica;
 }
public static void main(String arg[]) {
	// Matrica me shkonja
	String matrica[][] = formoMatricen();
	int n = matrica.length;
	System.out.println("Matrica me shkronja:");
	for (int i = 0; i < n; i++) {
		System.out.print("");
		for (int j = 0; j < n; j++) {
			System.out.print(" " + matrica[i][j]);
		}
		System.out.println();
	}
	// Matrica me numra 
	double[][] numeric = ktheMatricenNeNumra(matrica,n);
	System.out.println("Matrica me numra:");
	for (int i = 0; i < n; i++) {
		System.out.print("");
		for (int j = 0; j < n; j++) {
			System.out.print(" " + numeric[i][j]);
		}
		System.out.println();
	}
 

}
public static double[][] ktheMatricenNeNumra(String matrica[][], int n) {
	double[][] numeric = new double[n][n];
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			numeric[i][j] = ed.ShkronjeNeNumer(matrica[i][j]);
		}
	}
	return numeric;
}
}

