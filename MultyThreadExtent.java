class MultyThreadExtent {
    public static void main(String[] args) {
        
         public class TestThread { public static void main(String[] args){ 
             Thread t1 = new ExtendThread("t1",1000); //Create threads using the up-link object, andconstruct thread names and thread sleep times 
             Thread t2 = new ExtendThread("t2",2000); Thread t3 = new ExtendThread("t3",3000); t1.start();
         //Start the thread and call the run method 
         t2.start(); t3.start(); } } 
         class ExtendThread extends Thread{ //Classes that inherit Thread String name; int
         time; 
         public ExtendThread(String name, int time)
          { //Construct thread nameand sleeping time 
            this.name=name; this.time=time; } 
        public void run(){ //run
         Method for Rewriting Thread Classes 
         try{ sleep(time); //All threads join dormancy 
        } 
         catch(InterruptedExceptione){ e.printStackTrace();
         System.out.println("Thread interrupt exception"); }
         System.out.println("The name is:"+name+",Thread dormancy:"+time+"Millisecond"
         ); } }


         

    }

}
