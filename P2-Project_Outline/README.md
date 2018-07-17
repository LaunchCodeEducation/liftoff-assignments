# Project Outline
For this assignment, you will submit a high-level outline of your project. This can, and likely will, change over time. In particular, your mentor will provide feedback and direction and feedback to help sharpen your ideas. So don't worry if you feel unsure about some aspects of the outline, or if you have to change some things later.

## Assignment Description
[Project Outline Assignment](https://education.launchcode.org/liftoff/assignments/project-outline/)

## Submission Instructions

### Overview
Include overview here

My web app will be an air quality checker. It will track two main environmental factors: radiation and pollutants. Readings on each will be updated on a daily basis, or maybe an hourly basis depending on how flexible the public API is, to provide real-time readings. Locations can be saved all over the world, but I mostly expect users to save local data. The app will give users the tools they need to judge the safety of exposing themselves to the elements.
My idea for this app is based on the documentary Atomic Homefront. The people of Bridgeton, MO had no idea of the danger living next to the West Lake Landfill posed to themselves and their families. If they have something like this app, they can be informed if it's safe to spend significant time outdoors on any given day.

### Features
Include Features here

Radiation Level Check: returns a report of the ionizing background radiation within a given area, possibly by zip code or latitude/longitude. Measured in Gy units (1 Gy = 100 radiation absorbed doses, or "rad") and rem units (rem = rad * Q where Q is Quality Factor). Alternatively, measurements may be listed in Sv (sievert) units and CPM (counts per minute) units.
Pollutant Level Check: returns an air quality report in conjunction with the previous report. These two reports along with UV levels and wind direction will provide the complete report.
Location search: users can get an instant report on a location of their choosing. Readings on background radiation, air quality and wind direction serve as an accurate report on how safe or dangerous it is to be outside within a given area.
User login: with a valid email, users can save up to 12 separate locations to return reports. My idea is to lay out these locations in either a 1, 2x2, 3x3 or 4x4 grid format with detailed readings on each in whichever order the user chooses. The Bootstrap framework will provide the visual layout of these reports.

### Technologies
Include Technologies here

Java
Spring Boot
Thymeleaf
Java Persistence Annotation
Hibernate
MySQL
Bootstrap (HTML, CSS & Javascript)
Safecast API to pull background radiation readings
To-be-decided weather API to pull air quality, UV levels and wind direction readings
Google Maps API to display locations
Heroku to deploy the app on the Internet

### What I'll Have to Learn
Include what you will need to learn here

I will need to learn the basics of background radiation and how to convey what the readings mean to the average user.
I will need to learn how to integrate API searches within a program.
I will need to know how to convert an HTTP response with a JSON object into data that my program can interpret and display.
I will have to learn how to deploy an app with Heroku.
I will possibly learn some Javascript to render basic graphics if HTML/CSS does not suffice.