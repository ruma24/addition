class th extends Thread

{

	int a=10,b=20,c;

	public void run()

	{

		try

		{

			System.out.println("The Sum Of "+a+"+"+b+"="+(a+b)+"for the "+getName());

			

		}

		catch(Exception e)

		{

			System.out.println(e);

		}

	}

}

public class thread {

public static void main(String h[])

{

	th t=new th();

	t.start();

}

}
