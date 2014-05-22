
public class Complex {
	
	float re;
	float im;
	
	public Complex(){
		this.re=0;
		this.im=0;
	}
	
	public Complex(float r, float i){
		this.re =r;
		this.im=i;
	}
	
	public static Complex Add(Complex a, Complex b){
		Complex c= new Complex();
		c.re=a.re+b.re;
		c.im=a.im+b.im;
		return c;
	}
	
	public static Complex Subtract(Complex a, Complex b){
		Complex c= new Complex();
		c.re=a.re-b.re;
		c.im=a.im-b.im;
		return c;
	}
	
	public static Complex Multiply(Complex a, Complex b){
		Complex c= new Complex();
		c.re=(a.re*b.re)-(a.im*b.im);
		c.im=(a.re*b.im)+(a.im*b.re);
		return c;
	}
	
	
	
	public float Modulus(Complex a){
		float mod = (float) Math.sqrt((a.re*a.re)+(a.im+a.im));
		return mod;
	}
	
	public Complex conjugate(Complex a){
		Complex b= new Complex();
		b.re=a.re;
		b.im=-a.im;
		return b;
	}
	
	
	
	public Complex scalarProduct(Complex[] a, Complex[] b){
		Complex c= new Complex();
		if(a.length!=b.length){
			try {
				throw new Exception("Lengths of vectors must match for scalar product.") ;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			for(int i=0;i<a.length;i++){
				c=Add(c, Multiply(a[i], conjugate(b[i])));
			}			
		}
		

		return c;
		
	}
	
	
	

}
