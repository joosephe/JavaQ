package Internals;

public class QuantumState {
	
	
	public Complex[] stateVector;
	
	//Quantumstate from zero qubits. no information.
	public QuantumState(){
		Complex[] v= new Complex[1];
		v[0]=new Complex(1,0);
		this.stateVector=v;
	}
	
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
	private QuantumState(Complex[] stat){
		this.stateVector=stat;
	}
	
	
	public static QuantumState forget(QuantumState st, int i){
		//we forget the ith coordinate of the quantumstate
		//TODO
		return st;
	}
	public static QuantumState forgetAllButFirst(QuantumState st){
		//we forget the ith coordinate of the quantumstate
		//TODO
		Complex zero= new Complex();
		Complex one = new Complex();
		int half= st.stateVector.length/2;
		for(int i=0;i<half;i++){
			zero = Complex.Add(zero,st.stateVector[i]);
			one = Complex.Add(one,st.stateVector[i+half]);

		}
		Complex [] values = {zero,one};
		QuantumState stnew = new QuantumState(values);
		
		return stnew;
	}
	

}
