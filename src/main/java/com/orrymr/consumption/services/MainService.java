package com.orrymr.consumption.services;

import com.orrymr.consumption.dtos.Story;
import org.springframework.stereotype.Service;

@Service
public class MainService {
	public void saveStory(Story story){
		System.out.println(story.getId());
	}
}
