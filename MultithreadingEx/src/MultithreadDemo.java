
class MyThread extends Thread
{
 @Override
 public void run()
 {
	 for(int i=0;i<5;i++)
	 {
		//System.out.println("Child thread");
		try{
			System.out.println("Child thread");
		   sleep(200); //milliseconds
		   }catch(InterruptedException e)
		 {
		    	e.printStackTrace();
		 }
		 }
	 }
 }
public class MultithreadDemo {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		System.out.println("first line always");
		m.start();
        for(int i=0;i<3;i++)
        {
        	System.out.println("Parent child");
        }
      }
}
