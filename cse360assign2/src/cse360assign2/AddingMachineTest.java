package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void test() {
		
		AddingMachine myCalc = new AddingMachine();
		myCalc.add(1);
		myCalc.add(2);
		myCalc.subtract(2);
		System.out.println(myCalc.toString());
		myCalc.clear();
		assertEquals(0, myCalc.getTotal());
	}

}
