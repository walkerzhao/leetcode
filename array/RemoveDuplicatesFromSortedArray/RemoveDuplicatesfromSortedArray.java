
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] A) {
		if(A==null) return 0;
		int start =0;
		for(int i=0; i<A.length; i++) {
			if(A[i] == A[start]) {
				A[start] = A[i];
			} else {
				start = start +1;
				A[start] = A[i];
			}
		}		
		return start+1;        
    }
}

class Test {
	public static void main(String [] args) {
		RemoveDuplicatesfromSortedArray test = new RemoveDuplicatesfromSortedArray();
		int[] A = {1,1,2,3};
		int result = test.removeDuplicates(A);
		System.out.println(result);
	}
}
