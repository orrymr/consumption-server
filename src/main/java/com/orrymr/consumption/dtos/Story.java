package com.orrymr.consumption.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Story {
	private Integer id;
	private String story;
	private String addedBy;
	private Integer upVotes;
	private Integer downVotes;
	private LocalDateTime addDate;
}
