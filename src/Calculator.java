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
		return u * i;
	}
	
	public double pAusRundI (double r, double i) {
		return r* Math.pow(i, 2);
	}
	
	public double pAusUundR (double u, double r) {
		return Math.pow(u, 2) / r;
	}	
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
