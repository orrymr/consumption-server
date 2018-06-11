package com.orrymr.consumption;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.orrymr.consumption.Constants.APP_VERSION;

@RestController
public class Controller {

	@RequestMapping(value = "/system/health-check", method = RequestMethod.GET)
	public String healthCheck(){
		return String.format("Version %s up and running!", APP_VERSION);
	}
}
