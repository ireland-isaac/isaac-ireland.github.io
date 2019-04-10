/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapph;

import java.util.List;


/**
 *
 * @author isaac
 */
public class TestAppH {
    public static void main(String[] args){
//       int customerId = 7000;
//       String zip = "84405";
//       String name = "Rogder";
//       String addressline1 = "365 Days Drive";
//       String addressline2 = "";
//       String city = "Roy";
//       String state = "Utah";
//       String phone = "885-865-8894";
//       String fax = "";
//       String email = "Rodger-Rodger@mil.gov";
//       int creditLimit = 3500;
//       if(DatabaseAccessObject.addCustomer(customerId, 'Y', zip, name, addressline1, addressline2, city, state, phone, fax, email, creditLimit)){
//            System.out.print("Customer added Successfully");
//        }else{
//            System.out.println("Fatal Error");
//        }

    int Customerid = 1;
    List<Customer> emps = DatabaseAccessObject.getDetails(Customerid);        
    for(Customer emp: emps){
        System.out.println(emp.getAddressline1());
    }
    }
    
}
