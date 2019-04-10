package testapph;
// Generated Apr 10, 2019 1:07:35 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name="CUSTOMER"
    ,schema="APP"
)
public class Customer  implements java.io.Serializable {


     private int customerId;
     private char discountCode;
     private String zip;
     private String name;
     private String addressline1;
     private String addressline2;
     private String city;
     private String state;
     private String phone;
     private String fax;
     private String email;
     private Integer creditLimit;

    public Customer() {
    }

	
    public Customer(int customerId, char discountCode, String zip) {
        this.customerId = customerId;
        this.discountCode = discountCode;
        this.zip = zip;
    }
    public Customer(int customerId, char discountCode, String zip, String name, String addressline1, String addressline2, String city, String state, String phone, String fax, String email, Integer creditLimit) {
       this.customerId = customerId;
       this.discountCode = discountCode;
       this.zip = zip;
       this.name = name;
       this.addressline1 = addressline1;
       this.addressline2 = addressline2;
       this.city = city;
       this.state = state;
       this.phone = phone;
       this.fax = fax;
       this.email = email;
       this.creditLimit = creditLimit;
    }
   
     @Id 

    
    @Column(name="CUSTOMER_ID", unique=true, nullable=false)
    public int getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
    @Column(name="DISCOUNT_CODE", nullable=false, length=1)
    public char getDiscountCode() {
        return this.discountCode;
    }
    
    public void setDiscountCode(char discountCode) {
        this.discountCode = discountCode;
    }

    
    @Column(name="ZIP", nullable=false, length=10)
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }

    
    @Column(name="NAME", length=30)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ADDRESSLINE1", length=30)
    public String getAddressline1() {
        return this.addressline1;
    }
    
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    
    @Column(name="ADDRESSLINE2", length=30)
    public String getAddressline2() {
        return this.addressline2;
    }
    
    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    
    @Column(name="CITY", length=25)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="STATE", length=2)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="PHONE", length=12)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="FAX", length=12)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="EMAIL", length=40)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="CREDIT_LIMIT")
    public Integer getCreditLimit() {
        return this.creditLimit;
    }
    
    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }




}


