package de.ahoehma.mykanban;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import de.ahoehma.mykanban.MykanbanApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MykanbanApplication.class)
@WebAppConfiguration
public class MykanbanApplicationTests {

	@Test
	public void contextLoads() {
	}

}
