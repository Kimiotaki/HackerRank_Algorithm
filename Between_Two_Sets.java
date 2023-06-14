package mount_blue;
import java.util.*;
import java.math.BigInteger;
public class Between_Two_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* fist array presents the  multiples of this individual number
		 * second  array  present the factors of the number*/
		int ar[]= {2,4}; //2,4,6,8,10,12,14,16,18,20,22,24;
						//6,12,18,24,30,36,42,48
		int br[]= {16,32,96}; //24,12,2,3,4,6,8,
							//6,12
		List<Integer> a=new ArrayList<>();
		for(int c:ar)a.add(c);
		List<Integer> b=new ArrayList<>();
		for(int c:br)b.add(c);
		int lcm=a.get(0);
		int count=0;
		for(int i=1;i<=a.size()-1;i++)
		{
				BigInteger b1=new BigInteger(Integer.toString(lcm));
				BigInteger b2=new BigInteger(Integer.toString(a.get(i)));
				BigInteger gc=b1.gcd(b2);
				int GCD=Integer.parseInt(gc.toString());
				 lcm=(lcm/GCD)*a.get(i);
		}
		int GCD=b.get(0);
		for(int i=1;i<=b.size()-1;i++)
		{
				BigInteger b1=new BigInteger(Integer.toString(GCD));
				BigInteger b2=new BigInteger(Integer.toString(b.get(i)));
				BigInteger gc=b1.gcd(b2);
				GCD=Integer.parseInt(gc.toString());	
		}
		for(int i=lcm;i<=GCD;i+=lcm)
		{
			if(GCD%i==0)
			{
				++count;
			}
		}
		System.out.println(count); // print or return this count
	}

}
