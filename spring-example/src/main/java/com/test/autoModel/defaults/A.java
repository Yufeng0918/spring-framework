package com.test.autoModel.defaults;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
//public class A implements ExampleAware {
public class A  {

//	ExampleBean exampleBean;
//
//	private B b;

//	public A(C c,B b,ExampleBean exampleBean){
//		log.debug("Constructor from c b,exampleBean");
//	}

	public A() {
		log.debug("A default Constructor");

	}

	public A(B b) {
		log.debug("A Constructor for b");
//		this.b = b;
	}

//	@Override
//	public void setExampleBean(ExampleBean exampleBean) {
//		//this.exampleBean=exampleBean;
//	}
//
//	public ExampleBean getExampleBean() {
////		return exampleBean;
//		return null;
//	}
}
