package labtest1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCar {

	@Test
	public void test() {
		Car c=new Car(400);
		assertEquals(400,c.getEngineCapacity());
	}

}
