//https://www.javaguides.net/2018/09/junit-5-asserttrue-example.html
package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class JUnit5AssertTrueExample {
 
 public static boolean isEmpty(final CharSequence cs) {
  return cs == null || cs.length() == 0;
 }

 public static boolean isBlank(final CharSequence cs) {
  int strLen;
  if (cs == null || (strLen = cs.length()) == 0) {
   return true;
  }
  for (int i = 0; i < strLen; i++) {
   if (!Character.isWhitespace(cs.charAt(i))) {
    return false;
   }
  }
  return true;
 }

 @Test
 public void isEmptyTest() {
  assertTrue(isEmpty(null));
  assertTrue(isEmpty(""));
  assertFalse(isEmpty(" "));
  assertFalse(isEmpty("bob"));
  assertFalse(isEmpty("  bob  "));
 }

 @Test
 public void isBlankTest() {
  assertTrue(isBlank(null));
  assertTrue(isBlank(""));
  assertTrue(isBlank(" "));
  assertFalse(isBlank("bob"));
  assertFalse(isBlank("  bob  "));
 }
}