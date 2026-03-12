package com.personal.info.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    private String role;
    private String company;
    private String period;
    private String description;
    private String logoIcon; // Font Awesome class
}

