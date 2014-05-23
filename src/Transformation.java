
public class Transformation extends ComplexMatrix {

	public Transformation(Complex[][] a) {
		
		super(a);
		if (!isUnitary(this)){
			try {
				throw new Exception("Transformation matrix must be unitary");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO but now Transformation is still initialized. is this bad?
	}
	
	//yes, we access the private values of the Qubit qb, but that qubit can not be used afterwards anyway.
	public static Qubit apply(Qubit qb, Transformation tr){
		//we transform them both into matrices.
		ComplexMatrix vec = new ComplexMatrix(2,1);
		vec.elems[0][0]=qb.noPart;
		vec.elems[1][0]=qb.yesPart;
		//we multiply the transformation with the qubit
		ComplexMatrix result = multiply(tr, vec);
		qb.noPart=result.elems[0][0];
		qb.yesPart=result.elems[1][0];
		
		return qb;
	}

	
	
	public static QuantumState apply(QuantumState st, Transformation tr){
		//we transform them both into matrices.
		//ComplexMatrix mat= tr;
		ComplexMatrix vec = new ComplexMatrix(st.stateVector.length,1);
		for(int i = 0;i<st.stateVector.length;i++){
			vec.elems[i][0]=st.stateVector[i];
		}
		ComplexMatrix result = multiply(tr, vec);
		//ComplexMatrix resVec = new ComplexMatrix(st.stateVector.length,1);

		for(int i = 0;i<st.stateVector.length;i++){
			//resVec.stateVector[i]=result.elems[i][0];
			st.stateVector[i]=result.elems[i][0];
		}
		
		return st;
	}
	

	//public Complex [][] elems;
	//the size of
	//public int size;
	
	
	
	
	
	
}
