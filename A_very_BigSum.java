package mount_blue;

import java.util.ArrayList;
import java.util.List;

public class A_very_BigSum {
	 public static long aVeryBigSum(List<Long> ar) {
	        long su=0;
	    for(long c:ar)
	    {
	        su+=c;
	    }
	    return su;
	    }
	public static void main(String[] args) {
		List<Long> ar=new ArrayList<>();
		long result = A_very_BigSum.aVeryBigSum(ar);
		System.out.println(result);
	}

}
