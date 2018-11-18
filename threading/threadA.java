// Java code for thread creation by implementing 
// the Runnable Interface 
class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
            // I had larger prime numbers but work prime turned negative due to overflow issues
            int primea = 179424691;
            int primeb = 217645199;
            float workprime = primea * primeb;
            // if workprime is negative than workprimeb will be the NaN (root of a negative number and all)
            double workprimeb = Math.sqrt(workprime);
            // Displaying the thread that is running and giveing it some work to do
            System.out.println("multiplied " + 
                                workprime + " rooted: " + workprimeb);
            System.out.println ("Thread " + 
                                Thread.currentThread().getId() + 
                                " is running");
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds. 
            System.out.println("time right now is " + duration + " milliseconds");
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception! let slip the dogs of war!"); 
        } 
    } 
} 
  
// Main Class 
class threadA
{ 
    public static void main(String[] args) 
    { 
        long startTime = System.nanoTime();
        int n = 80; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            Thread object = new Thread(new MultithreadingDemo()); 
            object.start(); 
        } 

    } 
} 