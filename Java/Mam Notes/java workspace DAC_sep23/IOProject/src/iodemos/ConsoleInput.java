package iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

	public static void main(String[] args) 
	{
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to quit");
			int n;
			while( (n = br.read()) != 'q' )
			{
				System.out.println((char)n);
				
			}
			
			//br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
