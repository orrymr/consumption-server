package com.orrymr.consumption.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "C_Story")
public class Story {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "added_by")
	private String addedBy;
	private String story;
	@Column(name = "up_votes")
	private Integer upVotes;
	@Column(name = "down_votes")
	private Integer downVotes;
	@Column(name = "add_date")
	private LocalDateTime addDate;

	public Story(String addedBy, String story, Integer upVotes, Integer downVotes, LocalDateTime addDate) {
		this.addedBy = addedBy;
		this.story = story;
		this.upVotes = upVotes;
		this.downVotes = downVotes;
		this.addDate = addDate;
	}

	public Story() {

	}

}
