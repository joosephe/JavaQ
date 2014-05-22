
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
	
	
	
	
	
	
	

}
