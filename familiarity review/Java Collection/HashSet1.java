// from javatpoint.com 

import java.util.*;  

class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");
           // example of how set works with duplicates
           set.add("Five");
           // example of adding and removing
           set.add("onne");
           set.remove("onne");
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  