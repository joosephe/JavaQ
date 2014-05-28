package Internals;

import java.util.Random;

public class Measurement{
	//measurement can be defined as a set of projections.
	public ComplexMatrix[] proj;
	
	
	public boolean isMeasurement(ComplexMatrix[] mats){
		int n = mats.length;
		
		
		
		//we first check that the dimensions of the matrices match
		int rows= mats[0].rowCount;
		int cols = mats[0].colCount;
		//We first check that it is a square matrix.
		if(rows!=cols){
			return false;
		}
		for(int i=0;i<n;i++){
			if(mats[i].rowCount!=rows||mats[i].colCount!=cols){
				return false;
			}
		}
		//should be that rows==cols. check that too.
		
		
		
		//we then compare every two matrices to be certain that they are orthogonal
		
		
		
		for(int i =0;i<n-1; i++){
			for(int j=i+1;j<n;j++){
				ComplexMatrix mult = ComplexMatrix.multiply(mats[i], mats[j]);
				boolean isZero = ComplexMatrix.isZero(mult);
				if(!isZero){
					return false;
				}
			}
		}
		
		//now we must check whether the sum of the matrices is one.
		
		ComplexMatrix sum= new ComplexMatrix(rows, cols);
		for(int i=0;i<n;i++){
			sum = ComplexMatrix.add(sum, mats[i]);
		}
		boolean isSumOne= ComplexMatrix.isIdentity(sum);
		if(!isSumOne){
			return false;
		}
		
		
		return true;
	}
	
	
	public Measurement(ComplexMatrix[] mats) {
		
		
		//the row vectors are the different projections. 
		//first we must check whether they are a measurement
		boolean isMeas=isMeasurement(mats);
		if(!isMeas){
			try {
				throw new Exception("These matrices do not form a measurement..");
			} catch (Exception e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			this.proj=mats;

		}
		
		// TODO Auto-generated constructor stub
	}
	
	//I think this one is not used.
	public static Ensemble apply(Ensemble en, Measurement me){
		Ensemble en2= new Ensemble(me.proj.length);
		//TODO: get randomness
		Random rand = new Random();
		float random=rand.nextFloat();
		for(int j=0;j<me.proj.length;j++){
			//
			en2.probs[j]=0;

			for(int i=0;i<en.size;i++){
				en2.probs[j]+=en.probs[j]*measureProb(me.proj[j],en.states[i]);
			}	
		}
		return en2;
	}
	
	//a helper function. doesn't really signify anything.
	//computes the square of the norm of a matrix*vector
	public static float measureProb(ComplexMatrix me, QuantumState st){
		
		ComplexMatrix vec = new ComplexMatrix(st.stateVector.length,1);
		for(int i = 0;i<st.stateVector.length;i++){
			vec.elems[i][0]=st.stateVector[i];
		}
		ComplexMatrix result = ComplexMatrix.multiply(me, vec);
		//we must now make a column vector out of this.
		
		Complex [] col= new Complex[st.stateVector.length];
		for(int i=0;i<st.stateVector.length;i++){
			col[i]=result.elems[i][0];
		}
		
		return Complex.norm(col)*Complex.norm(col);
		
	}
	//TODO: test this
	public static QuantumState stateAfterMeasurement(QuantumState st, ComplexMatrix me){
		//measures state. doesn't tell us much about what we measured. but the state is changed .
		//to something of a smaller dimension.
		ComplexMatrix vec = new ComplexMatrix(st.stateVector.length,1);
		//QuantumState resQu = new QuantumState(st.stateVector.length,1);

		for(int i = 0;i<st.stateVector.length;i++){
			vec.elems[i][0]=st.stateVector[i];
		}
		//compute the product
		ComplexMatrix result = ComplexMatrix.multiply(me, vec);
		
		//but now we must normalize this and cast it back to a QuantumState.
		Complex [] col= new Complex[st.stateVector.length];
		for(int i=0;i<st.stateVector.length;i++){
			col[i]=result.elems[i][0];
		}
		//Normalize the product
		float factor = Complex.norm(col);
		for(int i = 0;i<st.stateVector.length;i++){
			result.elems[i][0]=Complex.Divide(result.elems[i][0], factor);
		}
		
		for(int i=0;i<st.stateVector.length;i++){
			st.stateVector[i]=result.elems[i][0];
		}

		return st;
		
	}
	
	
	//TODO: test this.
	public static int apply(QuantumState qu, Measurement me){
		//first cast quantumstate into a  matrix
		Random rand = new Random();
		float random=rand.nextFloat();
		int cases = me.proj.length;
		float[] measProbs= new float[cases];
		//float[] measProbsSum= new float[cases];
		
		for(int i=0;i<cases;i++){
			measProbs[i]=measureProb(me.proj[i],qu);
		}
		float growerSum=0;
		int i=0;
		//Now compute
		while(growerSum<random){
			growerSum+=measProbs[i];
			i++;
		}

		
		
		
		
		//returns the index of the element that got randomly chosen.
		
		return i-1;
	}
	
	
	//TODO: test this
	public static QuantumState measure(QuantumState qu, Measurement me){
		//we measure a matrix.
		int meas = apply(qu,me);
		//but the matrix now changes. based on what we measured.
		//it would be great if both the matrix could change and that 
		qu= stateAfterMeasurement( qu,  me.proj[meas]);
		
		//problem: logically, the state vector should be smaller after measurement. I suspect it is not.
		//since we only did matrix multiplications and so on.
		//what is going on?
		return qu;
	}
	
	public static boolean apply(Qubit qb, Measurement me){
		//aaa! fuck! fuck! 
		//how the fuck should we make this?
		Random rand = new Random();
		float random=rand.nextFloat();
		
		float zeroSize=Complex.ModulusSquare(qb.noPart);
		
		if(random<zeroSize){
			return false;
		}
		else{
			return true;
		}
		//ComplexMatrix vec = new ComplexMatrix(2,1);
		//vec.elems[0][0]=qb.noPart;
		//vec.elems[1][0]=qb.yesPart;
		
		
		//the number of elements should match the number of measurements
		//for()
		
		
		//TODO: write apply method
		//return qb;
	}

	//public Complex [][] elems;
	
	

}
