package mount_blue;

import java.util.ArrayList;
import java.util.List;

public class Plus_Minus {

	public static void main(String[] args) {
		int []ar = {-4, 3, -9, 0, 4, 1};
		List<Integer> arr =new ArrayList<>();
		int pos=0;
		int neg=0;
		int zero=0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)<0) ++neg;
			else if(arr.get(i)>0) ++pos;
			else
			{
				++zero;
			}
		}
		double p=pos;
		double ne=neg;
		double z=zero;
		double n=arr.size();
		double res_pos=p/n;
		double res_neg=ne/n;
		double res_zero=z/n;
		System.out.format("%.6f",res_pos);
		System.out.println();
		System.out.format("%.6f",res_neg);
		System.out.println();
		System.out.format("%.6f",res_zero);
	}

}
