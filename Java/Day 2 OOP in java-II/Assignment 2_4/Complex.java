public class Complex{
	
	private int real, imag;
	
	public Complex(){
	
	}

	public Complex(int real,int imag){
		
		this.real = real;
		this.imag = imag;
	
	}
	public Complex(Complex c){
		this.real = c.real;
		this.imag = c.imag;
	
	}
	public void ComplexNo(){
		
		if(imag<0){
			System.out.println(real+""+imag+"i");
		}
		else{
			System.out.println(real+"+"+imag+"i");
		}
	
	}

}