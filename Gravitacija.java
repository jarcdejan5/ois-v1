

import java.util.*;


public class Gravitacija{


	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	double visina = sc.nextDouble();
	
	izpis(visina, izracun(visina));
	
	System.out.println("OIS je zakon!");
	}
	
	public static double izracun(double visina){
		/*BigDecimal C = new BigDecimal(6.674 * Math.pow(10,-11));
		BigDecimal M = new BigDecimal(5.972 * Math.pow(10,24));
		BigDecimal r = new BigDecimal(6.371 * Math.pow(10,6));
		
		return new BigDecimal(C.multiply(M).divide((r.add(visina)).pow(2)));*/
		
		double C = 6.674 * Math.pow(10,-11);
		double M = 5.972 * Math.pow(10,24);
		double r = 6.371 * Math.pow(10,6);
		return (C*M)/Math.pow(r+visina,2);
	}
	
	public static void izpis(double visina, double gravPosp) {
		System.out.println("Pri visini " + visina + " je gravitacijski pospesek " + gravPosp);
	}
}