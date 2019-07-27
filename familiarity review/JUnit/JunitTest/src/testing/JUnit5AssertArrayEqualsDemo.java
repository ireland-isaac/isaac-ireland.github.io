//this is from: https://www.javaguides.net/2018/09/junit-5-assertarrayequals-example.html

package testing;


import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class JUnit5AssertArrayEqualsDemo {

 public static String[] concatenateStringArrays(final String[] array1, final String[] array2) {
  if (array1 == null || array1.length == 0) {
   return array2;
  }
  if (array2 == null || array2.length == 0) {
   return array1;
  }

  final String[] newArr = new String[array1.length + array2.length];
  System.arraycopy(array1, 0, newArr, 0, array1.length);
  System.arraycopy(array2, 0, newArr, array1.length, array2.length);
  return newArr;
 }

 @Test
 public void testConcatenateStringArrays() {
  final String[] input1 = new String[] { "myString2" };
  final String[] input2 = new String[] { "myString1", "myString2" };

  assertArrayEquals(input1, concatenateStringArrays(input1, null));
  assertArrayEquals(input2, concatenateStringArrays(null, input2));
 }

}
