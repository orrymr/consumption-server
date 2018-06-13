package com.orrymr.consumption.services;

import com.orrymr.consumption.dtos.Story;
import com.orrymr.consumption.repositories.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

	@Autowired
	private StoryRepository storyRepository;

	public Story saveStory(Story story) {
		return storyRepository.save(story);
	}

	public List<Story> getStoryByPage(Integer page) {
		return storyRepository.findAll(PageRequest.of(page, 5)).getContent();
	}
}
