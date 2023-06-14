package mount_blue;
import java.util.*;
public class Reduced_Str {

	public static void main(String[] args) {
		String str="aaabccddd"; //abd
		StringBuffer sb= new StringBuffer(str);
		Stack<Character> st= new Stack<>();
		for(int i=0;i<sb.length();i++)
		{
			if(st.empty())
			{
				st.push(sb.charAt(i));
			}
			else
			{
				if(sb.charAt(i)==st.peek())
				{
					st.pop();
				}
				else
				{
					st.push(sb.charAt(i));
					
				}
			}
		}
		
		if(st.isEmpty())
		{
			System.out.println("Empty String");
		}
		
		else
		{
			String rs="";
		while(!st.empty())
		{
			rs+=st.pop().toString();		
			
		}
		StringBuffer bf=new StringBuffer(rs);
		rs=bf.reverse().toString();
		System.out.println(rs);
		}
	}

}
