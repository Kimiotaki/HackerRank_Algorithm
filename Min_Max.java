package mount_blue;

import java.util.ArrayList;
import java.util.Arrays;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};


Arrays.sort(a);
long max=0;
long min=0;
for(int i=1;i<a.length;i++)
{
/*for max sum*/
	max+=a[i];
}
for(int i=0;i<a.length-1;i++)
{
/*for max sum*/
	min+=a[i];
}
System.out.println(max+" "+min);
}

}
