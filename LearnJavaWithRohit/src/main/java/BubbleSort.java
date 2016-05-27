
public class BubbleSort {
	
	public void bubbleSort(Integer[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[]={9,8,7,6,5,4,3,2,1};
		BubbleSort bbsort = new BubbleSort();
		bbsort.bubbleSort(arr);
	}

}
