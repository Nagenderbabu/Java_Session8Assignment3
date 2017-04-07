package course.Threads.priorities;



public class Add implements Runnable {

	// declaring thread name variable
	String thread_name;

	// declaring parametered constructor
	Add(String thread_name){
	
		this.thread_name=thread_name;	
	}

	// override run method
	@Override
	public void run() {
		// TODO Auto-generated method stub
       for(int i=1;i<=10;i++){
    	 System.out.println(thread_name+":"+"(add)"+(i+i));  
       }
	}
	
}
