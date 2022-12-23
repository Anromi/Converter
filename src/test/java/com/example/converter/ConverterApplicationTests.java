package com.example.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.converter.controller.ConverterController;

import java.io.IOException;

@SpringBootTest
class ConverterApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void correctInputTest() throws IOException {
		ConverterController cc = new ConverterController();

		String errorMessage = cc.convertCtoF("number");
		Assertions.assertEquals("пожалуйста, напишите число правильно", errorMessage);
	}

	@Test
	public void TestConvertCtoF() throws IOException {
		ConverterController cc = new ConverterController();
		Assertions.assertEquals("122.0", cc.convertCtoF("50"));
		Assertions.assertEquals("313.15", cc.convertCtoK("40"));
		Assertions.assertEquals("15.0", cc.convertFtoC("59"));
		Assertions.assertEquals("283.15", cc.convertFtoK("50"));
		Assertions.assertEquals("-261.15", cc.convertKtoC("12"));
		Assertions.assertEquals("-438.07", cc.convertKtoF("12"));
	}
}
