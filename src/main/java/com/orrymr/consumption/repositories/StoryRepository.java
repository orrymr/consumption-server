package com.orrymr.consumption.repositories;

import com.orrymr.consumption.dtos.Story;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StoryRepository extends PagingAndSortingRepository<Story, Long> {
}
