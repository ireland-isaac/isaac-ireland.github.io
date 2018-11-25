package jsonexercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONExercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student name please: ");
        String name = input.nextLine();
        
        // creating the JSON object
        JSONObject root = new JSONObject();
        
        //put the name and name-value pair
        root.put("name", name);
        
        JSONArray courses = new JSONArray();
        
        while (true) {
            
            System.out.print("Enter Course name please: ");
            String course = input.nextLine();

            // exit method
            if (course.length() == 0) {
                break;
            }
            
            System.out.print("Enter Grade please: ");
            int grade = input.nextInt();
        
            if(input.hasNextLine()) {
                input.nextLine();
            }
            
            // create a JSON array/objet/etc and store a class object in it
            JSONObject courseObject = new JSONObject();
            courseObject.put("grade", grade);
            courseObject.put("course", course);
            
            // add the course to the array
            courses.add(courseObject);

        }

         
        // add the array to the root object
        root.put("courses", courses);
        
        System.out.println(root.toJSONString());
        
        // creating file
        File file = new File("studintgrades.txt");
        
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(root.toJSONString());
        } catch (FileNotFoundException ex){
            System.out.println(ex.toString());
        }
        
        }
    }

