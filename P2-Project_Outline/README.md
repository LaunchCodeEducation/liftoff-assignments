# Project Outline

## Overview

My project will be a calendar where a user submits their tasks for the day or week. The user will be able to see their scheduled tasks with a daily, weekly, and monthly view. Eventually the application will be able to place more flexible tasks (e.g. "stop at the grocery store between now and Thursday") around existing events, and if a user moves or removes a task the schedule will rearrange itself.

I was motivated to create this project when I felt overwhelmed by the decision making involved in setting up my own schedule, and I figured a computer would be faster at making efficiency calculations than I am.

## Features
- *New task submission:* Users will be able to create a new task by entering the required fields (title, date, start and end time OR length of event and due date) and optional fields (location, priority level - default medium, flexibility level - default firm).
- *Edit existing tasks:* Users will be able to edit tasks.
- *Delete tasks:* Users will be able to delete tasks.
- *View the schedule:* Users will be able to see their scheduled tasks displayed for the day or week. Clicking on a task will bring up the detail page for that task, with the option to edit or delete it.
- *__(Upgrade)__ Schedule flexible tasks:* Users will be able to schedule a task with a window of time for completion. The application will find a space for this new task and automatically schedule it, or if no space currently exists it will suggest rescheduling a lower-priority task in the same window.
- *__(Upgrade)__ Highlight schedule changes:* Once the application is able to automatically rearrange a user's schedule, the events that were recently changed will be displayed differently to notify the user that a change was made.

## Technologies

- Java
- Spring Boot
- MySQL
- Thymeleaf templates
- Bootstrap, or something else to handle visuals
- potentially integrating Google Calendar API
- eventually Machine Learning

## What I'll Have to Learn
For the visuals of the schedule view, I will have to learn more about Bootstrap or another graphical interface that would work with Spring and Java.

Once a minimally viable product is created where the user manually submits the exact start and end time for tasks, I will need to learn how to create an algorithm which can "decide" on the placement of new tasks. This may involve machine learning so that over time the application is better able to predict which task placements work best for the user.

## Project Tracker
[Pivotal Tracker](https://www.pivotaltracker.com/n/projects/2185405 "Ther's Project Tracker")