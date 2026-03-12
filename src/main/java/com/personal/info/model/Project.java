package com.personal.info.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private String title;
    private String description;
    private String techStack;
    private String githubUrl;
    private String liveUrl;
    private String icon; // Font Awesome class
    private String gradient; // CSS gradient class
}

