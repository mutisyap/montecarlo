import java.text.DecimalFormat;

import javax.swing.text.DateFormatter;

public class MonteCarlo {
	double[] storageArray;

	public static void main(String[] args) {
		double[] resultArray = null;
		MonteCarlo mc = new MonteCarlo();
		// TODO Auto-generated method stub
		/*for (int i = 10; i <= 160; i *= 2)
			for (int j = 0; j < 5; j++) {
				DecimalFormat dc=new DecimalFormat("#.###");
				System.out.println(dc.format(mc.MonteCarloFunction(0.0, 3.142, i)));
			}*/
		Display d=new Display();
	}

	public double MonteCarloFunction(double a, double b, int n) {
		double sumF = 0.0;
		for (int i = 0; i < n; i++) {
			double randomNumber = a + (b - a) * Math.random();
			double f = Math.sin(randomNumber);
			sumF += f;
		}
		double result = ((b - a) * sumF) / n;
		return result;
	}

}