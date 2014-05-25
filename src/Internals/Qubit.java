package Internals;

public class Qubit {
	
	//the names here do not necessarily mean that these things signify "yes" and "no".
	public Complex noPart;
	public Complex yesPart;
	
	
	//We initialize qubit with a vector of two complex numbers.
	//blahh
		public Qubit(Complex[] a){
			if(a.length!=2){
				
				try {
					throw new Exception("To initialize qubit, we need exactly two complex numbers.");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.noPart =a[0];
			this.yesPart=a[1];
			float n = Complex.norm(a);
			double epsilon = 0.00001;
			
			double diff;
			if(n>=1.0){
				diff=n-1.0;
			}
			else{
				diff=1.0-n;
			}
			//this was bad since  
			//if(n!=1.0){
			//if((n-1.0)*(n-1.0)>epsilon){
			if(diff>epsilon){
				
				try {
					throw new Exception("To initialize qubit, the norm of the vector must be 1.") ;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
		
	
	
	

}
