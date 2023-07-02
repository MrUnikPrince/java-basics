import java.io.*;

public class inputout {
    public static void main(String x[])throws IOExceptio
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]=new Integer.parseInt(br.readLine());
		int b[][]=new Integer.parseInt(br.readLine());
		int c[][]=new Integer.parseInt(br.readLine());
		System.out.print("Enter 9 value in first array\n");
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; i++)
			{
				int a[i][j]=Integer.parseInt(br.readLine());
			}		
		}
		System.out.print("Enter 9 value in second array\n");
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				int b[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.print("Enter multification of array\n");
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				c[i][j]=a[i][j]*b[0][j]+a[i][i]*b[1][j]+a[i][2]+b[2][j];
			}
			System.out.print("\n");
		}
	}
}