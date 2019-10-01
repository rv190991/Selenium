package SeleniumPackage;

public class rev 
{
	public static void Stringrev()
	{
		String str = "sees";
		
		StringBuilder str1=new StringBuilder();
		
		str1.append(str);
		
		String str2 = str1.toString();
		
		/*
		
		System.out.println(str);
		
		StringBuilder strrev = new StringBuilder();
		
		StringBuffer strrev1 = new StringBuffer();
		
		strrev.append(str);
		
		System.out.println("strrev = "+strrev);
		
		strrev1.append(str);
		
		System.out.println("strrev1 = "+strrev1);
		
		strrev = strrev.reverse();
		
		System.out.println("strrev = "+strrev);
		
		String rev = strrev.toString();
		
		if(str.equals(rev))
		{
			System.out.println("IN1");
		}
		else */
		
		if(str==str2)
		{
			System.out.println("IN2");
		}
		else
		{
			System.out.println("OUT");
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		
		rev.Stringrev();
	}

}
