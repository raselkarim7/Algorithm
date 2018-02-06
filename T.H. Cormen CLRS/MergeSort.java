package coremen;
public class MergeSort {	
	
	static int Aone[] = { 2,7,3,1,6,4,8,5};
	
	/*static int Aone[] = { 933, 109, 879, 943,2, 899, 601, 1000, 596, 862, 628, 200, 
		548, 459, 960, 145, 434, 430,1003, 1,788, 576, 73, 129, 594, 885 }; */
	
	//static int Aone[] = { 1,25,7,9,1, 6,5,3,22};
	
	public static void MERGE(int p,int q, int r){
		
		//System.out.println("p= "+p+" q= "+q+" r= "+r);
		
		int n1 = q-p+1;
		int n2 = r-q;
		//System.out.println("-----------------n1= "+n1+"; n2= "+n2);
		
		int leftArr[] = new int[n1+1];
		int rightArr[] = new int[n2+1];
		
		for(int i=0; i<n1; i++){
			leftArr[i] = Aone[p+i];
		}
		
		for(int j=0; j<n2; j++){
			rightArr[j] = Aone[q+1+j];
		}
		
		leftArr[n1] = Integer.MAX_VALUE;
		rightArr[n2] = Integer.MAX_VALUE;
		
		int i=0, j=0;
		//System.out.println("p="+p);
		//System.out.println(rightArr[j]);
		for(int k=p; k<=r; k++)
		{
			if(leftArr[i] <= rightArr[j]){
				 Aone[k] = leftArr[i];
				 i++;
			}
			else {
				 Aone[k] = rightArr[j];
				 //System.out.println(k+" "+Aone[k]);
				 j++;
			}
		}
		
	}
	
	public static void MergeSort(int p,   int r){
		if(p<r){
			int q = (int) Math.floor((p+r)/2);
			MergeSort(p, q);
			MergeSort(q+1, r);
			MERGE(p, q, r);
		}
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Before Sorting : ");
		for(int  i=0; i<Aone.length; i++){  System.out.print(Aone[i]+" "); }
		
		System.out.println("\nAfter Sorting : ");
		MergeSort(0, Aone.length-1); // As array index starts from 1
	
		for(int  i=0; i<Aone.length; i++){	System.out.print(Aone[i]+" "); }
	}

}
