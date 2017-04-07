package course.Threads.priorities;

public class Subtract implements Runnable {

	
	// Declaring thread name variable
	String thread_name;

	// Declaring constructor with parameter
	Subtract(String thread_name){ 
	
		this.thread_name=thread_name;	
	}

	
// overriding run method
	@Override
	public void run() {
		// TODO Auto-generated method stub
       for(int i=1;i<=10;i++){
    	 System.out.println(thread_name+":"+"(Subtract)"+i*i);  
       }
	  
        
	}
}
