package refferanceCommon;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

class isEmptyTest {

	@Test
	void test() {
		 assertTrue(isEmpty(null));
		 assertTrue(isEmpty(""));
		 assertFalse(isEmpty(" "));
		 assertFalse(isEmpty("bob"));
		 assertFalse(isEmpty("  bob  "));
		}


}
