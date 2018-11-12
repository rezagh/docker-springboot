package com.cubic.rdm.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@Autowired
	private static final Logger log = LoggerFactory.getLogger(DockerController.class);
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public void getCustomer()  {

		 log.info("----------sent");
	}

	
}
