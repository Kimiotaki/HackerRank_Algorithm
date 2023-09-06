package mount_blue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quick1 {
	private static void swap(List<Integer> ls,int a, int b)
	{
		Collections.swap(ls, a, b);
	}
	private static int partition(List<Integer> ls,int str,int end)
	{
		int i=str;
		int j=end;
		int pivot=str;
		while(i<j) {
		while(i<ls.size()&& ls.get(i)<=ls.get(pivot))i++;
		
		while(j>=0 && ls.get(j)>ls.get(pivot))j--;
		if(i<j)swap(ls,i,j);
		}
		swap(ls,j,pivot);
		return j;
	}
	//3 2 4 5 7
	//4, 5, 3, 7, 2
	//4, 2, 3, 7, 5
	//3, 2, 4, 7, 5
	//2, 3, 4, 7, 5
	public static void quick(List<Integer> ls,int st,int en)
	{
		if(st<en)
		{
			int mid=partition(ls,st,en);
//			quick(ls,st,mid-1);
			quick(ls,mid+1,en); // this two lines are commented as per the question 
		}
	}
	public static void main(String[] args) {
	List<Integer> al= new ArrayList<>();
	al.add(4);
	al.add(5);
	al.add(3);
	al.add(7);
	al.add(2);
	quick(al,0,al.size()-1);
	for(int c:al)
	{
		System.out.print(c);
	}
	
//	 List<Integer> al =new ArrayList<>();
//     Scanner sc =new Scanner(System.in);
//     int n=sc.nextInt();
//     for(int i=0; i<n;i++)
//     {
//         al.add(sc.nextInt());
//     }
//     Result.quickSort(al,0,al.size()-1);
//     for(int c:al)System.out.print(c+" "); /*use this commented code  for user input*/
	}

}
