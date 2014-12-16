
class Test {
	public static void main(String[] args) {
		ZigZagConversion test = new ZigZagConversion();
		int nRows=3;
		String s="PAYPALISHIRING";
		String dststring = test.convert(s, nRows);
		System.out.println(dststring);
	}
			

}

public class ZigZagConversion {
    public String convert(String s, int nRows) {
    	if(s==null || s.length() == 0 || nRows<=0 )
    		return "";
    	if(nRows == 1) 
    		return s;
    	int i=0;
    	StringBuilder d = new StringBuilder();
    	int length = s.length();
    	int size = 2*nRows-2;
    	for(i=0; i<nRows; i++) {
    		for(int j=i;j<length;j=j+size) {
    			d.append( s.charAt(j) );
    			if(i>0 && i < nRows-1 && (j+2*(nRows-i)-2) < length ) {
    				d.append( s.charAt(j+2*(nRows-i)-2));
    			}
    		}
    		    		   		
    	}
    	
    	return d.toString();        
    }
}

//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
