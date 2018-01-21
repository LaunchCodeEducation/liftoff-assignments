# Project Outline
For this assignment, you will submit a high-level outline of your project. This can, and likely will, change over time. In particular, your mentor will provide feedback and direction and feedback to help sharpen your ideas. So don't worry if you feel unsure about some aspects of the outline, or if you have to change some things later.

## Assignment Description
[Project Outline Assignment](https://education.launchcode.org/liftoff/assignments/project-outline/)

## Submission Instructions

### Overview

I'm creating an app to help Airbnb hosts with the process of scheduling cleanings for their properties. Usually, hosts will manually go through checking each property for when guests check out, and schedule a cleaning right after. A lot of hosts keep a simple schedule on a spreadsheet document, and text or email the cleaning company every morning telling them what rooms to clean.

My app will streamline the scheduling process in 3 ways. First, I'll have a simple week view for the cleaning company to plan out thier next few days, and a month view to get a run down of the month so far. Also, I'll implement some simple financial tracking with cleaning prices for each room, added up per day, and a total at the end of the month. I will implement web scraping to search airbnb emails for occupancy details and populate the cleaning schedule for after guests check out.

### Features

* **Week View:** Quick view to see upcoming cleanings at a glance. Great for the cleaning company to plan out the next few days.
* **Month View:** A view of the entire month, similar to a spreadsheet view, good for planning ahead. Also features financial information, showing cost of cleaning per day, and total at the end of the month.
* **Admin Panel:** The host can login to a private version of the web app, allowing him to add, delete, and edit cleanings and rooms. A history of all edits will be saved and publicly available.
* **Email Scraping:** Checks emails from Airbnb as they arrive, pulling out dates and times of checkouts and populating the cleaning schedule automatically.

### Technologies

* Java
* Spring Boot
* Hibernate
* jsoup
* Thymeleaf
* Bootstrap
* Gradle
* JPA
* Gmail API

### What I'll Have to Learn

I'll have to learn more about web scraping with jsoup. I also need to learn the Gmail API and how to integrate scraping. I also would like to learn some simple javascript to improve the user experience.