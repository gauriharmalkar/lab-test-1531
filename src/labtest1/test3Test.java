package labtest1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test3Test {

	@Test
	public void test() {
		Car c=new Car(400);
		assertFalse(c.getEngineCapacity()>400);
	}

}
