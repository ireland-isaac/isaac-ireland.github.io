// based off of https://www.javaguides.net/2018/09/junit-5-asserttrue-example.html
package refferanceCommon;

public class isEmpty(final CharSequence cs) {
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