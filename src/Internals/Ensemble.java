package Internals;

public class Ensemble {
	
	//there will be size possible values where each value has probability probs.
	//maybe this class is not needed.
	
	public  int size;
	public  float[] probs;
	public QuantumState[] states;
	
	
	//initialize from a quantum state. then we are in this state with probability one.
	public Ensemble(QuantumState qu){
		this.size=1;
		this.probs=new float[1];
		this.states=new QuantumState[1];
		this.probs[0]=1;
		this.states[0]=qu;
	}
	
	public Ensemble(int n){
		//the method for creating an empty Ensemble
		this.size=n;
		this.probs=new float[n];
		this.states=new QuantumState[n];
	}
	
	
	
	/*
	public  Ensemble(Qubit qu){
		this.size=2;
		this.probs=new float[size];
		this.probs[0]=Complex.Modulus(qu.noPart);
		this.probs[1]=Complex.Modulus(qu.yesPart);
		
	}
	
	public Ensemble(QuantumState qu){
		this.size=qu.stateVector.length;
		this.probs=new float[size];
		for(int i=0;i<qu.stateVector.length;i++){
			this.probs[i]=Complex.Modulus(qu.stateVector[i]);
		}
	}
	
	public static   void printEnsemble(Ensemble en){
		for(int i=0;i<en.size;i++){
			String by = Integer.toBinaryString(i);
			System.out.println("Probability of " + by+ " is "+en.probs[i]);

		}
	}
	*/
	
	
}
