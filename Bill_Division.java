package mount_blue;

import java.util.ArrayList;
import java.util.List;

public class Bill_Division {

	public static void main(String[] args) {
		int bill_ar[]={3,10,2,9};
		List<Integer> bill=new ArrayList<>();
		for(int c:bill_ar)bill.add(c);		
		int k=1;
		int ch=12;
		int sum=0;
		int fin=0;
		for(int i=0;i<bill.size();i++)
		{
			if(i==k)continue;
			
			sum+=bill.get(i);
		}
		sum=sum/2;
		fin=ch-sum;
		if(fin<=0)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(fin);
		}
	}

}
