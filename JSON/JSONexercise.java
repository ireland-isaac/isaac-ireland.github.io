chpackage jsonexercise;

import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONExercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student name please: ");

        String name = input.nextLine();

        System.out.print("Enter Course name please: ");

        String course1 = input.nextLine();

        System.out.print("Enter Grade please: ");

        int grade1 = input.nextInt();

        
         // creating the JSON object
        JSONObject root = new JSONObject();
        
        //put the name and name-value pair
        root.put("name", name);
        
        // create a JSON array/objet/etc and store a class object in it
        JSONObject courseObject1 = new JSONObject();
        courseObject1.put("grade", grade1);
        courseObject1.put("course", course1);
           
        JSONArray courses = new JSONArray();
        courses.add(courseObject1);
        
        // add the array to the root object
        root.put("courses", courses);
        
        System.out.println(root.toJSONString());
    }

}