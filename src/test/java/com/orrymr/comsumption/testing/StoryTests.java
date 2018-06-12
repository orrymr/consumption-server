package com.orrymr.comsumption.testing;

import com.orrymr.consumption.Main;
import com.orrymr.consumption.dtos.Story;
import com.orrymr.consumption.repositories.StoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:test.properties"})
@ContextConfiguration(classes = Main.class)
@Transactional
public class StoryTests {

	@Autowired
	private StoryRepository storyRepository;

	@Test
	public void testSave() {
		Story firstStory = new Story("Orry", "I this and that", 2, 4, LocalDateTime.now());
		storyRepository.save(firstStory);

		List<Story> stories = (List<Story>) storyRepository.findAll();

		assertThat(stories.size()).isEqualTo(1);
	}

	@Test
	public void testPage() {
		for (int i = 0; i < 10; i++) {
			Story story = new Story("Orry " + i, "I this and that", 2, 4, LocalDateTime.now());
			storyRepository.save(story);
		}

		List<Story> stories = (List<Story>) storyRepository.findAll();
		assertThat(stories.size()).isEqualTo(10);

		Page<Story> page = storyRepository.findAll(PageRequest.of(1, 5));

		System.out.println(page);
	}

}
