import java.util.Scanner;

public class SecondLargestSecondSmallest{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);		
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] ans= SecondLargestSecondSmallest(arr,n);
		System.out.println(ans[0]+" "+ans[1]);
	}

	private static int[] SecondLargestSecondSmallest(int[] arr, int n) {
		int max=arr[0];
		int smax= arr[0];
		 
		
		int min= arr[0];
		int smin= arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			
			//Secondlargest
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
			if(smax<arr[i] && max>arr[i]) {
				smax=arr[i];
			}
			
			
			//SecondSmallest
			if(arr[i]<min)
			{
				smin=min;
				min=arr[i];
			}
			if(smin>arr[i] && min>arr[i]) {
				smin=arr[i];
			}				
		}	
return new int[] {smin,smax};
		
	
	}
}
