package Internals;

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
		//first we must check whether they are 
		boolean isMeas=isMeasurement(mats);
		try {
			throw new Exception("These matrices do not form a measurement..");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<mats.length;i++){
			this.proj[i]=mats[i];
		}
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	public static QuantumState apply(QuantumState qu, Measurement me){
		//TODO: write apply method
		return qu;
	}
	
	public static Qubit apply(Qubit qu, Measurement me){
		//TODO: write apply method
		return qu;
	}

	//public Complex [][] elems;
	
	

}
