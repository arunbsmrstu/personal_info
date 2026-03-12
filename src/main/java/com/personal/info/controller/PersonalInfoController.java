package com.personal.info.controller;

import com.personal.info.model.Experience;
import com.personal.info.model.Project;
import com.personal.info.model.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonalInfoController {

    @GetMapping("/")
    public String index(Model model) {

        // ── Personal Details ──────────────────────────────────────────────
        model.addAttribute("name", "Arun Kumar");
        model.addAttribute("title", "Full Stack Developer");
        model.addAttribute("tagline", "I craft elegant, high-performance web applications.");
        model.addAttribute("email", "arun@example.com");
        model.addAttribute("phone", "+91 98765 43210");
        model.addAttribute("location", "Chennai, India");
        model.addAttribute("github", "https://github.com/arun");
        model.addAttribute("linkedin", "https://linkedin.com/in/arun");
        model.addAttribute("twitter", "https://twitter.com/arun");
        model.addAttribute("bio",
                "Passionate Full Stack Developer with 5+ years of experience building "
                + "scalable web applications. I love turning complex problems into simple, "
                + "beautiful, and intuitive solutions. Expertise in Java, Spring Boot, "
                + "React, and cloud-native technologies.");
        model.addAttribute("yearsOfExperience", 5);
        model.addAttribute("projectsCompleted", 30);
        model.addAttribute("happyClients", 20);

        // ── Skills ────────────────────────────────────────────────────────
        List<Skill> skills = List.of(
                new Skill("Java",         90, "fab fa-java",        "backend"),
                new Skill("Spring Boot",  88, "fas fa-leaf",        "backend"),
                new Skill("HTML / CSS",   92, "fab fa-html5",       "frontend"),
                new Skill("JavaScript",   80, "fab fa-js",          "frontend"),
                new Skill("React",        75, "fab fa-react",       "frontend"),
                new Skill("Thymeleaf",    85, "fas fa-file-code",   "frontend"),
                new Skill("MySQL",        82, "fas fa-database",    "database"),
                new Skill("PostgreSQL",   78, "fas fa-database",    "database"),
                new Skill("Docker",       70, "fab fa-docker",      "devops"),
                new Skill("Git",          88, "fab fa-git-alt",     "devops"),
                new Skill("AWS",          65, "fab fa-aws",         "devops"),
                new Skill("Linux",        75, "fab fa-linux",       "devops")
        );
        model.addAttribute("skills", skills);

        // ── Experience ────────────────────────────────────────────────────
        List<Experience> experiences = List.of(
                new Experience(
                        "Senior Full Stack Developer",
                        "Tech Innovations Pvt Ltd",
                        "Jan 2022 – Present",
                        "Led development of microservices architecture for a fintech platform. "
                        + "Built REST APIs with Spring Boot, designed React-based dashboards, "
                        + "and reduced page load time by 40%.",
                        "fas fa-building"
                ),
                new Experience(
                        "Java Backend Developer",
                        "Infosys Limited",
                        "Jun 2020 – Dec 2021",
                        "Developed enterprise-grade applications for banking clients. "
                        + "Implemented OAuth 2.0 security, optimised SQL queries, and "
                        + "maintained CI/CD pipelines using Jenkins.",
                        "fas fa-laptop-code"
                ),
                new Experience(
                        "Software Engineer Intern",
                        "StartupHub",
                        "Jan 2020 – May 2020",
                        "Built RESTful services and contributed to front-end features using "
                        + "Thymeleaf and Bootstrap. Gained hands-on experience with Agile/Scrum.",
                        "fas fa-code"
                )
        );
        model.addAttribute("experiences", experiences);

        // ── Projects ──────────────────────────────────────────────────────
        List<Project> projects = List.of(
                new Project(
                        "E-Commerce Platform",
                        "A full-featured online store with product management, cart, payments, "
                        + "and admin dashboard built with Spring Boot & Thymeleaf.",
                        "Spring Boot · Thymeleaf · MySQL · Bootstrap 5",
                        "https://github.com/arun/ecommerce",
                        "#",
                        "fas fa-shopping-cart",
                        "gradient-blue"
                ),
                new Project(
                        "Task Manager App",
                        "A Kanban-style task management application with real-time updates, "
                        + "drag-and-drop support, and team collaboration features.",
                        "React · Spring Boot · WebSocket · PostgreSQL",
                        "https://github.com/arun/taskmanager",
                        "#",
                        "fas fa-tasks",
                        "gradient-purple"
                ),
                new Project(
                        "Personal Finance Tracker",
                        "Smart personal finance tracker with expense categorisation, "
                        + "budget alerts, and insightful charts to monitor spending habits.",
                        "Spring Boot · Chart.js · MySQL · Docker",
                        "https://github.com/arun/financetracker",
                        "#",
                        "fas fa-chart-line",
                        "gradient-green"
                ),
                new Project(
                        "API Gateway Service",
                        "Lightweight API gateway built for microservices with rate limiting, "
                        + "JWT authentication, and request routing capabilities.",
                        "Spring Cloud · JWT · Redis · Docker",
                        "https://github.com/arun/apigateway",
                        "#",
                        "fas fa-network-wired",
                        "gradient-orange"
                )
        );
        model.addAttribute("projects", projects);

        return "index";
    }
}

