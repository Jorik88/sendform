package com.example.sendform;

import com.example.sendform.configuration.BepaidConfiguration;
import com.example.sendform.entity.User;
import com.example.sendform.model.LiqPayPaymentResponse;
import com.example.sendform.service.SendRequestMessage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendformApplicationTests {

	@Autowired
	private SendRequestMessage sendRequestMessage;

	@Autowired
	private BepaidConfiguration bepaidConfiguration;

	private ObjectMapper objectMapper = new ObjectMapper();

	private RestTemplate restTemplate = new RestTemplate();

	@Test
	public void contextLoads() {
		List<String> cookies = sendRequestMessage.send1();
		String resp = sendRequestMessage.sendAndRedirect(cookies);
		System.out.println(resp);
	}

	@Test
	public void testResponse() throws IOException {
		String data = "eyJhY3Rpb24iOiJwYXkiLCJwYXltZW50X2lkIjo4NTY0MzY5MzUsInN0YXR1cyI6ImZhaWx1cmUiLCJlcnJfY29kZSI6ImVycl9wYXltZW50IiwiZXJyX2Rlc2NyaXB0aW9uIjoiRmFpbGVkIHRvIG1ha2UgcGF5bWVudC4gUGxlYXNlIG1ha2Ugc3VyZSB0aGUgcGFyYW1ldGVycyBhcmUgZW50ZXJlZCBjb3JyZWN0bHkgYW5kIHRyeSBhZ2FpbiIsInZlcnNpb24iOjMsInR5cGUiOiJidXkiLCJwYXl0eXBlIjoiY2FyZCIsInB1YmxpY19rZXkiOiJpNzc0MDM1NDc2NjUiLCJhY3FfaWQiOjQxNDk2Mywib3JkZXJfaWQiOiJvcmRlcl9pZF83IiwibGlxcGF5X29yZGVyX2lkIjoiUEE5TUw5MlExNTQwOTEyMDY1MzM1NDgxIiwiZGVzY3JpcHRpb24iOiJkZXNjcmlwdGlvbiB0ZXh0Iiwic2VuZGVyX2ZpcnN0X25hbWUiOiJEZXh0ZXIiLCJzZW5kZXJfbGFzdF9uYW1lIjoiQW5kZXJzb24iLCJzZW5kZXJfY2FyZF9tYXNrMiI6IjQ3NjMyNSo1MCIsInNlbmRlcl9jYXJkX2JhbmsiOiJJQ0JBIEJhbmNhcmQiLCJzZW5kZXJfY2FyZF90eXBlIjoidmlzYSIsInNlbmRlcl9jYXJkX2NvdW50cnkiOjg0MCwiaXAiOiI4NS4yMzguMTAyLjE4MSIsImFtb3VudCI6MS4wLCJjdXJyZW5jeSI6IlVTRCIsInNlbmRlcl9jb21taXNzaW9uIjowLjAsInJlY2VpdmVyX2NvbW1pc3Npb24iOjAuMDMsImFnZW50X2NvbW1pc3Npb24iOjAuMCwiYW1vdW50X2RlYml0IjoyOC4yNSwiYW1vdW50X2NyZWRpdCI6MjguMjUsImNvbW1pc3Npb25fZGViaXQiOjAuMCwiY29tbWlzc2lvbl9jcmVkaXQiOjAuNzgsImN1cnJlbmN5X2RlYml0IjoiVUFIIiwiY3VycmVuY3lfY3JlZGl0IjoiVUFIIiwic2VuZGVyX2JvbnVzIjowLjAsImFtb3VudF9ib251cyI6MC4wLCJtcGlfZWNpIjoiNiIsImlzXzNkcyI6ZmFsc2UsImNyZWF0ZV9kYXRlIjoxNTQwOTExNzEyNDMzLCJlbmRfZGF0ZSI6MTU0MDkxMjA3MTQzMywidHJhbnNhY3Rpb25faWQiOjg1NjQzNjkzNSwiY29kZSI6ImVycl9wYXltZW50In0=";
		String encodedData = new String(Base64.getDecoder().decode(data));
		LiqPayPaymentResponse response = objectMapper.readValue(encodedData, new TypeReference<LiqPayPaymentResponse>() {});
		System.out.println(response);
	}


	@Test
	public void testExchange() {
		sendRequestMessage.stackExchange();
	}

	@Test
	public void replaceElements() {
		String forReplace = "JSESSIONID=205C2AF6657387F8565E724A0BFCD1DF; Path=/api/; HttpOnly";
		String result = StringUtils.substringBefore(forReplace, ";");
		System.out.println(result);
	}

	@Test
	public void test() {
		String url = "http://localhost:8080/user";
		ResponseEntity<User> forEntity = restTemplate.getForEntity(url, User.class);
		System.out.println(forEntity.getBody());
		System.out.println(forEntity.getBody().getSureName());
	}


}
