package threadsync;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class DivisorThreadDemo {

	public static void main(String[] args) throws Exception
	{
		//accept number from user
		//create file writer
		//create a thread - start
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		int n = Integer.parseInt(br.readLine());
		
		FileWriter fw = new FileWriter("D:/myfiles/divisors.dat");
		
		//newly created state
		DivisorThread dt1 = new DivisorThread(n, fw);
		dt1.getT().start();
		DivisorThread dt2 = new DivisorThread(690, fw);
		dt2.getT().start();
		DivisorThread dt3 = new DivisorThread(1800, fw);
		dt3.getT().start();
		
		
		//main thread will wait till dt1 finishes
		//main thread will wait for all threads to finish
		try
		{
			dt1.getT().join();
			dt2.getT().join();
			dt3.getT().join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Child thread's task is over");
		fw.close();
		

	}

}
