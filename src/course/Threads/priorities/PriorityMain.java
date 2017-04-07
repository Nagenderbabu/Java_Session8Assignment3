package course.Threads.priorities;

public class PriorityMain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		// creating objects
	
		       // initializing add class variable 
            	Add ad=new Add("thread_one");
            	// initializing subtract class variable
				Subtract st=new Subtract("thread two");
				// initializing Modulus class variable
				Modulus md=new Modulus("thread three");
				
				// creating thread and passing add class object to it
				Thread td1=new Thread(ad);
				//creating thread and passing subtract class object to it
				Thread td2=new Thread(st);
				//creating thread and passing modulus class object to it
				Thread td3=new Thread(md);
				
				// starting thread 1
				td1.start();
				// prioritizing thread 1
				td1.setPriority(10);
				//starting thread 2
				td2.start();
				// prioritizing thread 2
				td2.setPriority(1);
				// starting thread 3
				td3.start();
				// prioritizing thread 3
				td2.setPriority(5);
				
	}

}
