package mount_blue;

import java.util.ArrayList;
import java.util.List;

public class Subarray_division {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1,1};
		List<Integer> ar= new ArrayList<Integer>();
		int m=1;
		int d=4;
		int count=0;
		for(int i=0;i<=ar.size()-m;i++)
		{
			int temp=0;
			for(int j=i;j<i+m;j++)
			{
				temp+=ar.get(j);
			}
			if(temp==d) {
				++count;
			}	
		}
		System.out.println(count);
	}

}
