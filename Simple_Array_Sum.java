package mount_blue;

import java.util.ArrayList;
import java.util.List;

public class Simple_Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,10,11};
		List<Integer> al= new ArrayList<>();
		for(int c:ar)
		{
			al.add(c);
		} // this part only for input
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum+=al.get(i);
		}
		System.out.println(sum); // print or return the sum
		
	}

}
