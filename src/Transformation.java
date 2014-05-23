
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
		
		// TODO 
	}
	

	//public Complex [][] elems;
	//the size of
	//public int size;
	
	
	
	
	
	
}
