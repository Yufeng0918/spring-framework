package com.spring.test.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j2 {

	public static void main(String[] args) {
		ExtendedLogger logger = LogManager.getContext().getLogger("a");
		logger.debug("log4j2 debug");
		logger.error("log4j2");

		Logger logger1 = LoggerFactory.getLogger("a");
		logger1.debug("slf4j");
	}
}
