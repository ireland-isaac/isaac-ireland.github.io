package com.areyes1.junitassertrue.sample;
 
import static org.junit.Assert.*;

import java.beans.Transient;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
 
public class JUnitTestAssertThatAssertions {
     
    int totalNumberOfApplicants = 0;
    int NumberOfApplicants;

    @Before
    public void setData(){
        this.totalNumberOfApplicants = 9;
    }
     
    @Test
    public void testAssertThatEqual() {
        assertThat("123",is("123"));
    }

    // added assert is not null
    @Test 
    public void testnotNull() {
        assertNotNull(totalNumberOfApplicants);

    }


    // added assert is not null
    @Test 
    public void testNull(){
    // I'm testing undefined veriables are null
        assertNull(NumberOfApplicants);

    }
    
    // added assert same
    @Test 
    public void testNull(){
    // I'm testing if I can complare these two
        NumberOfApplicants = totalNumberOfApplicants;
        assertSame(NumberOfApplicants, totalNumberOfApplicants);
    } 

    @Test
    public void testAssertThatNotEqual() {
        assertThat(totalNumberOfApplicants,is(123));
    }
     
    @Test
    public void testAssertThatObject() {
        assertThat("123",isA(String.class));
    }
     
    @Test
    public void testAssertThatWMessage(){
        assertThat("They are not equal!","123",is("1234"));
    }
}
