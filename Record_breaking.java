package mount_blue;

import java.util.ArrayList;
import java.util.List;

public class Record_breaking {

	public static void main(String[] args) {
		int scores_ar[]={10, 5, 20, 20, 4 ,5 ,2, 25, 1};
		List<Integer> scores= new ArrayList<>();
		for(int c:scores_ar)scores.add(c);
		int min=scores.get(0);
		int max=scores.get(0);
		int count_min=0;
		int count_max=0;
		for(int i=1;i<scores.size();i++)
		{
			if(scores.get(i)<min)
			{
				min=scores.get(i);
				++count_min;
			}
			else if(scores.get(i)>max)
			{
				max=scores.get(i);
				++count_max;
			}
			else
			{
				continue;
			}
		}
		List<Integer> fin= new ArrayList<>();
		fin.add(count_max);
		fin.add(count_min);
		System.out.println(count_max+" "+count_min);
	}

}
