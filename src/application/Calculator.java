package application;

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
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
	}
	
	/* Hier die Methoden mit den Formlen hinzufügen
	 */
	public double pAusUundI (double u, double i){
		return u * i;
	}
	
	public double pAusRundI (double r, double i) {
		return r* Math.pow(i, 2);
	}
	
	public double pAusUundR (double u, double r) {
		return Math.pow(u, 2) / r;
		
	public double uAusRundI(double r, double i){
		return r * i;
	}
	
	public double uAusPundI(double p, double i){
		return p / i;
	}
	
	public double uAusPundR(double p, double r){
		return sqrt(p * r);
	}
	
	public double iAusUundR (double u, double r) {
		return u / r;
	}

	public double iAusUundP (double u, double p) {
		return p / u;
	}

	public double iAusRundP (double r, double p) {
		return sqrt(p / r);
	}

	public double rAusUundI (double u, double i) {
		return u / i;
	}

	public double rAusPundI (double p, double i) {
		return p / Math.pow(i, 2);
	}

	public double rAusUundP (double u, double p) {
		return Math.pow(u, 2) / p;
	}
}
