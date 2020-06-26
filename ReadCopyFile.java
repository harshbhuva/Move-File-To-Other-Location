import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class ReadCopyFile 
{
	public static void main(String[] args) 
	{
		String loc2,loc,fna,f2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter file location: ");
		loc=sc.next();
		System.out.println("Enter file name");
		fna=sc.next();
		System.out.println("Enter location to store new file: ");
		loc2=sc.next();
		System.out.println("Enter new file name");
		f2=sc.next();
		
		File ff1=new File(loc+fna);
		File ff2=new File(loc2+f2);
		
		if(!ff1.exists())
		{
			System.out.println(" "+fna+" doesn't exists");
		}
		else
		{
			try
			{
				FileInputStream fis=new FileInputStream(ff1);
				FileOutputStream fos=new FileOutputStream(loc2+f2);
				int n=0;
				char ch=' ';
				
				while(n!=-1)
				{
					n=fis.read();
					fos.write(n);
					ch=(char)n;
					System.out.println(ch);
				}
				fis.close();
				fos.close();
			}
			catch(Exception e)
			{
				System.out.println("Read error: "+e.getMessage());
			}
			
		}

	}

}
