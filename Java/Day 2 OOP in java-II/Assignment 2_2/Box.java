public class Box{
	
	private int h,w,d;
	
	public Box(){
	
	}

	public Box(int h,int w, int d){
		
		this.h = h;
		this.w = w;
		this.d = d;
	}
	public Box(Box b){
		this.h = b.h;
		this.w = b.w;
		this.d = b.d;
	}
	public void boxVolume(){
		int volume = h*w*d;
		System.out.println("Volume of Box is : "+volume);
	}

}