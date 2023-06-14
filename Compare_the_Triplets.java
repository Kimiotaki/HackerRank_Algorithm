package mount_blue;
import java.util.*;
public class Compare_the_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {17,28,30};
		int b[] = {99,16,8};
		int alice=0;
		int bob=0;
		List<Integer> ls=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b[i])
			{
				++alice;
			}
			else if(a[i]<b[i])
			{
				++bob;
			}
			else
			{
				continue;
			}
		}
		ls.add(alice);
		ls.add(bob);
		System.out.println(ls);
		
	}

}
