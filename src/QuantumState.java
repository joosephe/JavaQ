
public class QuantumState {
	
	
	public Complex[] stateVector;
	
	
	public QuantumState(Qubit a){
		Complex[] v = new Complex[2];
		v[0]= a.noPart;
		v[1]=a.yesPart;
		this.stateVector=v;
	}
	

}
