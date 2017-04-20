package io.github.lordviktor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.lordviktor.order.Events;
import io.github.lordviktor.order.States;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StateMachineDemoApplicationTests {

	@Autowired
	private StateMachine<States, Events> stateMachine;

	@Test
	public void testStateMachineTransitions() {
		stateMachine.sendEvent(Events.assemble);
		stateMachine.sendEvent(Events.deliver);
	}

	@Test
	public void contextLoads() {
		
	}

}
