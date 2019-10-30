
// From my team member and his work, not Isaac's -corrected typo

import java.util.ArrayList;


public interface Collection {
      public static void main(String args[]){  
     ArrayList<String> groupList=new ArrayList<String>();  
     groupList.add("Daryl Payne");  
     groupList.add("Buck McGettigan");  
     groupList.add("Isaac Ireland");  
     groupList.add("Hansen NoShow Muhile"); 
         //iterating ArrayList
     System.out.println(" This is a list of Group Members. \n");
     for(String str:groupList)  
        System.out.println(str); 
     System.out.println();
     
 // An example of adding to list including where they will be in list
 groupList.add(4,"Brother Brad Lawrence");
     
 System.out.println(" We added another to the group. \n");
 for(String str:groupList)
     System.out.println(str);
 System.out.println();
 
 // An example of removing
 
  groupList.remove("Brother Brad Lawrence");
  
  System.out.println(" Removing a group memeber. \n");
  for(String str:groupList)
     System.out.println(str);
  
  } 

}
