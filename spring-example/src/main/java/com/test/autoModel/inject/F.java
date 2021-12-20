package com.test.autoModel.inject;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component
@Slf4j
public class F {

	//	@Autowired
	@Resource
	I i;

	@Resource(name = "cc")
	G g;

//	@Autowired
//	L l;
//
//	K k;
//
//	public K getK() {
//		return k;
//	}
}