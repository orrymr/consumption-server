package com.orrymr.consumption;

import com.orrymr.consumption.dtos.Story;
import com.orrymr.consumption.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.orrymr.consumption.Constants.APP_VERSION;

@RestController
public class Controller {

	@Autowired
	private MainService mainService;

	@RequestMapping(value = "/system/health-check", method = RequestMethod.GET)
	public String healthCheck() {
		return String.format("Version %s up and running!", APP_VERSION);
	}

	@RequestMapping(value = "/story", method = RequestMethod.POST)
	public int postStory(@RequestBody Story story) {
		mainService.saveStory(story);
		return 0;
	}
}
