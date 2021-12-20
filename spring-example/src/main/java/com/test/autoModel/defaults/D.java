package com.test.autoModel.defaults;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class D {

	public D () {
		log.info("D default constructor");
	}

	public D(B b) {
		log.info("D constructor for B");
	}
}
