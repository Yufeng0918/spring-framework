package com.spring.test.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4j {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger("a");
		logger.debug("slf4j");
	}
}
