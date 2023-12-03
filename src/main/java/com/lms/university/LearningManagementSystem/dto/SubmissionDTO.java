package com.lms.university.LearningManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class SubmissionDTO {
    private int submissionId;
    private String title;
    private String description;
    private String submissionLink;
}
