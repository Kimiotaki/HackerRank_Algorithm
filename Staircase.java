package mount_blue;

public class Staircase {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(' ');
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
