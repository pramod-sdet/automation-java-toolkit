package arrays;

public class maxAndMin {

	public static void main(String[] args) {

		int[] ar= {2,4,6,1,9};
		
		int max= ar[0];
		int min= ar[0];
		
		for(int i=1;i<ar.length; i++) {
			
			if (ar[i]> max) {
				
				max= ar[i];
			}
			if(ar[i]<min) {
				
				min= ar[i];
			}
		}
		
		System.out.println("Maximum Element : " + max);
		System.out.println("Minimum Element : " + min);
		
	}

}
