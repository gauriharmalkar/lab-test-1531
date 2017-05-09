package labtest1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		Car c=new Car(400);
		assertEquals(900,c.getEngineCapacity());
	}

}
