package com.personal.info.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private String name;
    private int level; // 0 - 100
    private String icon; // Font Awesome class e.g. "fab fa-java"
    private String category; // "backend", "frontend", "devops", etc.
}

