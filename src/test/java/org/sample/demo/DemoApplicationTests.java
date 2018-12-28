package org.sample.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class DemoApplicationTests {

	@Value("${mainDependency}")
	private int mainDependency;

	@Value("${testDependency}")
	private int testDependency;

	@Autowired
	private DemoApplication demoApplication;


	@Test
	public void mainDependencyFromUnitTest() {
		assertThat(this.mainDependency).isEqualTo(1);
	}

	@Test
	public void testDependencyFromUnitTest() {
		assertThat(this.testDependency).isEqualTo(2);
	}


	@Test
	public void mainDependencyFromMainClass() {
		assertThat(this.demoApplication.getMainDependency()).isEqualTo(1);
	}

	@Test
	public void testDependencyFromMainClass() {
		assertThat(this.demoApplication.getTestDependency()).isEqualTo(2);
	}



}

