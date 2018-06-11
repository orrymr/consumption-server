package com.orrymr.consumption.repositories;

import com.orrymr.consumption.dtos.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {
}
