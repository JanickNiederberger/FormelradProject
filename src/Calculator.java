import static java.lang.Math.sqrt;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}	
	
	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {

		if(leistung!=0.0 && spannung!=0.0){
			strom = iAusUundP(spannung,leistung);
			widerstand = rAusUundP(spannung,leistung);
		}
		if(leistung!=0.0 && strom!=0.0){
			spannung = uAusPundI(leistung,strom);
			widerstand = rAusPundI(leistung,strom);
		}
		if(leistung!=0.0 && widerstand!=0.0){
			spannung = uAusPundR(leistung,widerstand);
			strom = iAusRundP(widerstand,leistung);
		}
		if(strom!=0.0 && spannung!=0.0){
			leistung = pAusUundI(spannung,strom);
			widerstand = rAusUundI(spannung,strom);
		}
		if(widerstand!=0.0 && spannung!=0.0){
			strom = iAusUundR(spannung,widerstand);	
			leistung = pAusUundR(spannung,widerstand);
			
		}
		if(widerstand!=0.0 && strom!=0.0){
			spannung = uAusRundI(widerstand,strom);
			leistung = pAusRundI(widerstand,strom);
		}
	}
	
	/* Hier die Methoden mit den Formlen hinzufügen
	 */
	public double pAusUundI (double u, double i){
		double p = u * i;
		System.out.println("P aus U und I (U * I): " + p);
		return p;
	}
	
	public double pAusRundI (double r, double i) {
		double p = r* Math.pow(i, 2);
		System.out.println("P aus R und I (R * I**2): " + p);
		return p;
	}
	
	public double pAusUundR (double u, double r) {
		double p = Math.pow(u, 2) / r;
		System.out.println("P aus U und R (U**2 / R): " + p);
		return p;
	}	
	public double uAusRundI(double r, double i){
		double u = r * i;
		System.out.println("U aus R und I (R * I): " + u);
		return u;
	}
	
	public double uAusPundI(double p, double i){
		double u = p / i;
		System.out.println("U aus P und I (P / I): " + u);
		return u;
	}
	
	public double uAusPundR(double p, double r){
		double u = sqrt(p * r);
		System.out.println("U aus P und R (Wurzel aus (P * R)): " + u);
		return u;
	}
	
	public double iAusUundR (double u, double r) {
		double i = u / r;
		System.out.println("I aus U und R (U / R): " + i);
		return i;
	}

	public double iAusUundP (double u, double p) {
		double i = p / u;
		System.out.println("I aus U und P (P / U): " + i);
		return i;
	}

	public double iAusRundP (double r, double p) {
		double i = sqrt(p / r);
		System.out.println("I aus R und P (Wurzel aus (P / R)): " + i);
		return i;
	}

	public double rAusUundI (double u, double i) {
		double r = u / i;
		System.out.println("R aus U und I (U / I): " + r);
		return r;
	}

	public double rAusPundI (double p, double i) {
		double r = p / Math.pow(i, 2);
		System.out.println("R aus P und I (P / I**2): " + r);
		return r;
	}

	public double rAusUundP (double u, double p) {
		double r = Math.pow(u, 2) / p;
		System.out.println("R aus U und P (U**2 / P): " + r);
		return r;
	}
}
