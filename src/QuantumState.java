
public class QuantumState {
	
	
	public Complex[] stateVector;
	
	//Quantumstate from a qubit
	public QuantumState(Qubit a){
		Complex[] v = new Complex[2];
		v[0]= a.noPart;
		v[1]=a.yesPart;
		this.stateVector=v;
	}
	
	//This is sort of like the tensor product part.
	//We add a new qubit to the Quantum State.
	//Maybe this should be some other type of a method? 
	 
	public  QuantumState (QuantumState qs, Qubit qb){
		int len = qs.stateVector.length;
		Complex[] v = new Complex[2*len];
		for(int i=0;i<len;i++){
			v[i]=Complex.Multiply(qs.stateVector[i],qb.noPart);
			v[i+len]=Complex.Multiply(qs.stateVector[i], qb.yesPart);		
		}
		
		this. stateVector =v;
	}
	

}
