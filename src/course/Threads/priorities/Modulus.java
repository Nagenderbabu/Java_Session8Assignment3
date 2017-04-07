package course.Threads.priorities;

public class Modulus implements Runnable {

	// declaring variable thread name 
    String thread_name;
	
    //  declaring constructor with variable
    Modulus(String thread_name){ 
	
    	this.thread_name=thread_name;	
		}
	
    
   // overriding run method 
			@Override
			public void run() {
				// TODO Auto-generated method stub
		       for(int i=1;i<=10;i++){
		    	 System.out.println(thread_name+":"+"(module)"+i%2);  
		       }
			  
	}

}
