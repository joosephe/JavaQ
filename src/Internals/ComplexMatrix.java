package Internals;

public class ComplexMatrix {
	public Complex [][] elems;
	//the size of
	public int rowCount;
	public int colCount;
	
	public ComplexMatrix(){
		Complex[][] mats= new Complex[0][0];
		this.rowCount=0;
		this.colCount=0;
		this.elems=mats;
	}
	
	
	//initializes a zero complex matrix with a given number of rows and columns
	public ComplexMatrix(int rows, int cols){
		this.rowCount=rows;
		this.colCount=cols;
		Complex zero =new Complex();
		Complex[][] mats= new Complex[rows][cols];
		//can I just copy a matrix?
		this.elems=mats;
		
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<colCount;j++){
				this.elems[i][j]=zero;
			}
		}
	}
	
	
	//initializes complex matrix with a bunch of complex numbers.
	//maybe we should just keep these functions in the class Complex?
	//nah.
	public ComplexMatrix(Complex[][] a){
		this.rowCount=a.length;
		this.colCount=a[0].length;
		
		Complex[][] mats= new Complex[rowCount][colCount];
		//can I just copy a matrix?
		this.elems=mats;
		//can I just copy a matrix?
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<colCount;j++){
				this.elems[i][j]=a[i][j];
			}
		}
	}
	
	public static ComplexMatrix transpose(ComplexMatrix input){
		ComplexMatrix result = new ComplexMatrix(input.colCount,input.rowCount);
		for(int i=0;i<input.colCount;i++){
			for(int j=0;j<input.rowCount;j++){
				result.elems[i][j]=Complex.conjugate(input.elems[j][i]);
			}
		}
		return result;
		

	}
	
	public static ComplexMatrix  add(ComplexMatrix first, ComplexMatrix second){
		if(first.rowCount!=second.rowCount||first.colCount!=second.colCount){
			try {
				throw new Exception("The dimensions of the matrices must match to add them.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ComplexMatrix result = new ComplexMatrix(first.rowCount,first.colCount);
		for(int i=0;i<result.rowCount;i++){
			for(int j=0;j<result.colCount;j++){
				result.elems[i][j]=Complex.Add(first.elems[i][j], second.elems[i][j]);
			}
		}
		return result;
		
	}
	
	
	
	//We multiply complex matrices like ordinary matrices. No taking of transposes are needed.
	public static ComplexMatrix  multiply(ComplexMatrix first, ComplexMatrix second){
		
		//if the dimensions don't match, it returns a zero matrix.
		ComplexMatrix result = new ComplexMatrix(first.rowCount,second.colCount);

		if(first.colCount!=second.rowCount){
			try {
				throw new Exception("The number of columns in the first matrix must match the number of rows in the second matrix.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			//Complex[][] mat = new Complex[first.rowCount][second.colCount];
			for(int i=0;i<first.rowCount;i++){
				//Complex[] row = first.elems[i];
				for(int j=0;j<second.colCount;j++){
					//Complex[] col = new Complex[second.rowCount];
					for(int k=0;k<second.rowCount;k++){
						result.elems[i][j]=Complex.Add(result.elems[i][j],Complex.Multiply(first.elems[i][k],second.elems[k][j]));
						//col[k]=second.elems[k][j];
					}
					//nope!
					//mat[i][j]=Complex.scalarProduct(row, col);
				}
			}
		}
		
		return result;
	}
	
	//returns true if two matrices are equal
	public static boolean isEqual(ComplexMatrix a, ComplexMatrix b){
		if(a.rowCount!=b.rowCount||a.colCount!=b.colCount){
			return false;
		}
		else{
			for(int i=0;i<a.rowCount;i++){
				//Complex[] row = first.elems[i];
				for(int j=0;j<a.colCount;j++){
					if(!Complex.isEqual(a.elems[i][j],b.elems[i][j])){
						
						return false;
					}
				}
			}
			return true;
					
			
	//  
			
		}
	}
	
	
	
	//returns true, if matrix is square and identity. returns false else.
		public static boolean isIdentity(ComplexMatrix a){
			Complex one =new Complex(1,0);
			Complex zero =new Complex(0,0);
			if(a.rowCount!=a.colCount){
				//maybe throw exception here?
				return false;
			}
			else{
				for(int i=0;i<a.rowCount;i++){
					for(int j=0;j<a.rowCount;j++){
						if(i==j){
							if(!Complex.isEqual(a.elems[i][j], one)){
								return false;
							}
							//if(a.elems[i][j].isEqual(a, b))
						}
						else{
							if(!Complex.isEqual(a.elems[i][j], zero)){
								return false;
							}
							
						}
						
					}
				}
				
			}
			return true;
		}
	
	//returns true, if matrix is square and unitary. returns false else.
	public static boolean isUnitary(ComplexMatrix a){
		if(a.rowCount!=a.colCount){
			//maybe throw exception here?
			return false;
		}
		else{
			ComplexMatrix aprim=transpose(a);
			ComplexMatrix mult = multiply(a,aprim);
			//Now we need to check whether a*a' ?=I
			return isIdentity(mult);
			//  
			
		}
	}
	
	public static boolean isProjection(ComplexMatrix a){
		if(a.rowCount!=a.colCount){
			//maybe throw exception here?
			return false;
		}
		else{
			ComplexMatrix sq = multiply(a,a);
			//Now we need to check whether a*a ?=a
			return isEqual(a,sq);
			//  
			
		}
	}
	
	public static boolean isZero(ComplexMatrix a){
	Complex zero =new Complex(0,0);	
		for(int i=0;i<a.rowCount;i++){
			for(int j=0;j<a.rowCount;j++){
				if(!Complex.isEqual(a.elems[i][j], zero)){
					return false;
				}
			}
		}		
	return true;
	}
	public static void printComMat(ComplexMatrix a){
		//System.out.println("ee");

		for(int i=0; i< a.rowCount;i++){
			//System.out.println("hurraa");
			Complex.printCom(a.elems[i]);
			System.out.println();

		}
	}
	
	

}
