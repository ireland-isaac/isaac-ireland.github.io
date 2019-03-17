

// Java code for thread creation by implementing 
// the Runnable Interface 

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                                Thread.currentThread().getId() + 
                                " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  

class SimpleThreadPool {

    public static void main(String[] args) {
            Executor anExecutor = Executors.newCachedThreadPool();
                for(int threadCnt = 0; threadCnt < 7; threadCnt++){
                    MultithreadingDemo aSillyRunnable =
                               new MultithreadingDemo();
                                anExecutor.execute(aSillyRunnable);
                                    }
                try {
                        Thread.sleep(5000);
                        System.out.println("Done Sleeping");
                    for(int threadCnt = 0; threadCnt < 3; threadCnt++){
                        MultithreadingDemo aSimpleRunnable =
                        new MultithreadingDemo();
                        anExecutor.execute(aSimpleRunnable);
                         }
           } catch (InterruptedException e) {
                    e.printStackTrace();
                    
        }
        }
     }

// Main Class 
