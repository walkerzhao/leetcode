
public class RemoveElement {
	public int removeElement(int[] A, int elem) {        
        int length = A.length;
		int count = 0;
		for(int i=0; i<length; i++) {
			if(A[i] != elem) {				
				A[count] = A[i];
				count = count+1; 
			}
		}
		return count;   
        
    }

}

class Test {
	public static void main(String [] args) {
		RemoveElement test = new RemoveElement();
		int[] A= {4,5}; int elem = 4;
		int result = test.removeElement(A, elem);
		System.out.println(result);
	}
}
