package com.spring.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.ExtendedLogger;

public class TestLog4j2 {

	public static void main(String[] args) {
		ExtendedLogger logger = LogManager.getContext().getLogger("a");
		logger.debug("log4j2 debug");
		logger.error("log4j2");
	}
}
