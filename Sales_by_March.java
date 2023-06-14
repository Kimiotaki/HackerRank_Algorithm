package mount_blue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sales_by_March {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*we can implement this using mapping concept  where we will store the sequence of the number 
		 * and in the value we will store the sequence 
		and then we will devide the sequence by 2 we get the pair number */
		int ar[]= {1,2,1,2,1,1,3,2,3};
		List<Integer> al =new ArrayList<>();
		for(int c:ar)
		{
			al.add(c);
		} // this part is only for the elements 
		
		boolean check[] = new boolean[al.size()] ;
		Arrays.fill(check, false);
		int count=0;
		int temp;
		for(int i=0;i<al.size();i++)
		{
			if(check[i]==false) {
			check[i]=true;
			 temp=al.get(i);
			}
			else
			{
				continue;
			}
			for(int j=i+1;j<al.size();j++)
			{
				if(temp==al.get(j) && check[j]==false)
				{
					check[j]=true;
					count++;
					break;
				}
				else
				{
					continue;				}
			}
			
		}
		System.out.println(count);
	}

}
