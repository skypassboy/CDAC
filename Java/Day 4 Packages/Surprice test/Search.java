public class Search{




	public static int searchElement(int key,int [] arr){


		int index=-1;

		for(int i=0;i<arr.length;i++){
			
			if(arr[i] == key){

				return i;
					
			}
			
		}
		return index;




	}



}