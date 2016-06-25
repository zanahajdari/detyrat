package numerike;
public class MetodaENewton {

    // Metoda e  Jakobianin
    public static double[][] Jacob(double[] x) {
        double[][] J = {{3, x[2] * Math.sin(x[1] * x[2]), x[1] * Math.sin(x[1] * x[2])},
                {8 * x[0], -1052 * x[1] + 2, 0},
                {-x[1] * Math.pow(Math.E, (-x[0] * x[1])), -x[0] * Math.pow(Math.E, (-x[0] * x[1])), 20}};
        return J;
    }

    // Metoda e Funksionit
    public static double[] funksioni(double[] x) {
        double[] F = {(3 * x[0] - Math.cos(x[1] * x[2]) - (1 / 2)),
                (4 * Math.pow(x[0], 2) - 526 * Math.pow(x[1], 2) + 2 * x[1] - 1),
                (Math.pow(Math.E, -x[0] * x[1]) + 20 * x[2] + ((10 * Math.PI - 3) / 3))};
        return F;
    }

    public static double[] ktheY(double[] x) {
        MatricaInverze in = new MatricaInverze();
        double[][] Jacobi = Jacobi(x);
        double[][] JacobiInverz = in.invert(J);  // Gjejme inverzin e Jakobianit
        double[] Funksioni = funksioni(x);
        double[] Y = new double[F.length]; // Prodhimi i Jakobit dhe funksionit 
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F.length; j++) {
                Y[i] = JInverz[i][j] * F[j];
            }
        }
        return Y;
    }

    public static String ktheNewton(int n, double[] x0, double TOL, int NO) {
        NormaInfinit norma = new NormaInfinit();
        int k = 1;
        double[] x = new double[n];

        while (k <= NO) {
            double[] y = ktheY(x0);
            for (int i = 0; i < n; i++) {
                x[i] = x0[i] - y[i];

                // System.out.print(" " + x[i]);
            }

            double NormaInfinit = norma.ktheNorme(n, y);
            if (NormaInfinit < TOL) {

                System.out.println(" Iteracioni i " + k + ":");
                for (int j = 0; j < n; j++) {

                    System.out.println(x[j] + "  ");

                }
                System.out.println();
            }

            k = k + 1;

            for (int p = 0; p < n; p++) {
                x0[p] = x[p];

            }
        }
        return "Metoda deshtoi pas " + k + " iteracionesh";
    }

    public static void main(String[] args) {

        double x[] = {0.1, 0.1, -0.1};

        int n = x.length;
        double TOL = 0.001;
        int NO = 4;
        System.out.println(ktheNewton(n, x, TOL, NO));
    }

}
