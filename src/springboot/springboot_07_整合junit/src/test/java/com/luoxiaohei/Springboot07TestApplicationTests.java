package com.luoxiaohei;

import com.luoxiaohei.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot07TestApplication.class) //这里面内置了运行器
class Springboot07TestApplicationTests {

	@Autowired
	private BookService bookService;

	@Test
	public void save() {
		bookService.save();
	}

}
