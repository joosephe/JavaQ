package Internals;

public class Complex {
	
	//Complex number z has a real an imaginary part
	//We write z=a+bi, where i is a special number that satisfies i*i=-1;
	float re;
	float im;
	//blah
	//Default initialization sets the number to (0,0)=0+0i=0
	public Complex(){
		this.re=0;
		this.im=0;
	}
	
	//Generally we initialize as z=a+bi
	public Complex(float a, float b){
		this.re =a;
		this.im=b;
	}
	
	
	public Complex(double d, double e) {
		this.re =(float)d;
		this.im=(float)e;
		// TODO Auto-generated constructor stub
	}

	public Complex(String value) {
		// TODO Auto-generated constructor stub
	}

	//(a+bi)+(c+di)=(a+c)+ (b+d)i
	public static Complex Add(Complex a, Complex b){
		Complex c= new Complex();
		c.re=a.re+b.re;
		c.im=a.im+b.im;
		return c;
	}
	
	//(a+bi)-(c+di)=(a-c)+ (b-d)i
	public static Complex Subtract(Complex a, Complex b){
		Complex c= new Complex();
		c.re=a.re-b.re;
		c.im=a.im-b.im;
		return c;
	}
	
	//(a+bi)*(c+di)=(ac-bd)+ (bc+ad)i

	public static Complex Multiply(Complex a, Complex b){
		Complex c= new Complex();
		c.re=(a.re*b.re)-(a.im*b.im);
		c.im=(a.re*b.im)+(a.im*b.re);
		return c;
	}
	
	
	//Modulus of a complex number is defined as|a+bi|= \sqrt{a*a+b*b}
	//note that modulus is always a non-negative real number.
	public static float Modulus(Complex a){
		float mod = (float) Math.sqrt((a.re*a.re)+(a.im*a.im));
		return mod;
	}
	
	
	//conjugate of a+bi is a-bi
	public static Complex conjugate(Complex a){
		Complex b= new Complex();
		b.re=a.re;
		b.im=-a.im;
		return b;
	}
	
	
	
	
	//scalar product of two complex vectors (a_1,..,a_n) and (b_1,..,b_n) is
	//a_1*b_1'+a_2*b_2'+..+a_n*b_n'
	//where b_i' is the conjugate of b_i
	//The lengths of the vectors must match.
	public static Complex scalarProduct(Complex[] a, Complex[] b){
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
	//Returns the norm of a vector
	//norm is defined as the square root of the scalar product of a vector with itself
	
	//note that a_i*a_i' is equal to the modulus of a_i and is thus a real number
	//thus the scalar product of a vector with itself is a non-negative real number
	//thus we can take only the real part of the scalar product, as the complex part is zero.
	public static float norm(Complex[] a){
		Complex c= new Complex();
		c= scalarProduct(a,a);
		float answer =(float)Math.sqrt(c.re);
		return answer;
	}
	
	public static boolean isEqual(Complex a, Complex b){
		if((a.re==b.re)&&(a.im==b.im)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void printCom(Complex a){
		 System.out.print(a.re+ " + "+ a.im+"i ");
	}
	
	public static void printCom(Complex[] a){
		for(int i=0;i<a.length;i++){
			printCom(a[i]);
		}
	}
	
	
//not necessary
	/*
	public static boolean isZero(Complex a){
		if((a.re==0)&&(a.im==0)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isOne(Complex a){
		if((a.re==1)&&(a.im==0)){
			return true;
		}
		else{
			return false;
		}
	}
	*/
	
	
	
	
	

}
