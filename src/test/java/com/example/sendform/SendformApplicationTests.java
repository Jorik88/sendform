package com.example.sendform;

import com.example.sendform.service.SendRequestMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendformApplicationTests {

	@Autowired
	private SendRequestMessage sendRequestMessage;

	@Test
	public void contextLoads() {
		sendRequestMessage.send1();
	}

}
