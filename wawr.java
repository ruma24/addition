import java.util.Scanner;





public class wawr {

	int a,b,c;

	Scanner s=new Scanner(System.in);

	public int add1(int a,int b)

	{

		this.a=a;

		this.b=b;

		c=this.a+this.b;

	    return c;

	}

	public static void main(String ar[])

	{

		wawr ob=new wawr();

		int c=ob.add1(5,6);

		System.out.println("The Sum of "+ob.a+"+"+ob.b+"="+c);

	}

}
