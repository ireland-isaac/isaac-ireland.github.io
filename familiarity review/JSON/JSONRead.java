package jsonread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONRead {

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
        
        System.out.println("File created, yay\n\n\n Hit Return to display");
        input.nextLine();
        
        try {
            input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while ( input.hasNextLine()) {
                jsonIn.append(input.nextLine());
            }
            System.out.println(jsonIn.toString());
            JSONParser parser = new JSONParser();
            
            JSONObject objRoot = (JSONObject) parser.parse(jsonIn.toString());
            
            System.out.printf("stidnet name is %s", objRoot.get("name").toString());
            
            JSONArray courses coursesIn = objRoot.get("courses");
            
            for (int i = 0; i < coursesIn.size(); i++) {
                JSONObject courseIn = (JSONObject) courseIn.get(i);
                long gradeIn = (long) courseIn.get("grade");
                Stirng nameIn = (String) courseIn.get("name")
                
                System.out.printf("Course %s; grade %d\n", nameIn, gradeIn);
                
            }
            
        } catch (FileNotFoundException ex) {
                System.out.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());
        }
    }
}