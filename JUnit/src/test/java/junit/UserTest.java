package junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

	private User user;

	@BeforeEach
	public void setUp() {
		user = new User();
		user.setName("Jane");
		user.setAge(24);
	}

	@Test
	public void getNameAndAge() {
//		assertEquals("Jane", user.getName());
//		assertEquals(24, user.getAge());
		// OR can be grouped ->

		assertAll("User validation", () -> assertEquals("Jane", user.getName()), () -> assertEquals(24, user.getAge()));
	}

}
