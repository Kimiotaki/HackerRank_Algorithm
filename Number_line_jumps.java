package mount_blue;

public class Number_line_jumps {

	public static void main(String[] args) {
		int x1=0;
		int v1=2;
		int x2=5;
		int v2=2;
		if(v1<=v2) System.out.println("NO");
		else {
		if((x2-x1)%(v1-v2)==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		}
	}

}
