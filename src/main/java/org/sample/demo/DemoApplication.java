package org.sample.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	@Value("${mainDependency}")
	public void setMainDependency(int mainDependency) {
		this.mainDependency = mainDependency;
	}

	private int mainDependency;

	@Value("${testDependency}")
	private int testDependency;

	public int getMainDependency() {
		return mainDependency;
	}

	public int getTestDependency() {
		return testDependency;
	}


}

