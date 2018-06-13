package com.orrymr.consumption;

import com.orrymr.consumption.dtos.Story;
import com.orrymr.consumption.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.orrymr.consumption.Constants.APP_VERSION;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

	@Autowired
	private MainService mainService;

	@RequestMapping(value = "/system/health-check", method = RequestMethod.GET)
	public String healthCheck() {
		return String.format("Version %s up and running!", APP_VERSION);
	}

	@RequestMapping(value = "/story", method = RequestMethod.POST)
	public Long postStory(@RequestBody Story story) {
		return mainService.saveStory(story).getId();
	}

	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public List<Story> getStoryByPage(@RequestParam("page") Integer page){
		return mainService.getStoryByPage(page);
	}
}
