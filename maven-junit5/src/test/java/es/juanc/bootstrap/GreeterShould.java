package es.juanc.bootstrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterShould {

	@Test
	void greet_with_a_hello_message_to_the_name_it_receives() {
		Greeter greeter = new Greeter();
		assertEquals("Hello Jhon!!", greeter.greet("Jhon"));
	}
}
