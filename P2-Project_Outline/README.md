# Project Outline
For this assignment, you will submit a high-level outline of your project. This can, and likely will, change over time. In particular, your mentor will provide feedback and direction and feedback to help sharpen your ideas. So don't worry if you feel unsure about some aspects of the outline, or if you have to change some things later.

## Assignment Description
[Project Outline Assignment](https://education.launchcode.org/liftoff/assignments/project-outline/)

## Submission Instructions

### Overview
My project is a web application that will facilitate collaboration among non-profit organizations.  After signing up, users will be able to post descriptions of current projects they're working on, along with information about resources they could use.  Other users will be able to view these posts, ask questions, and make offers to commit resources.  For example, a community action group might submit a post about a tutoring project they would like to initiate, and a local student group whose members need volunteer hours can then offer to serve as tutors.  Or a disaster response organization could post about their work in a community affected by flooding; they might receive offers from a community group that can help with debris removal, or a church that can house volunteers.

Before joining LaunchCode, I served two years in an AmeriCorps program with a disaster relief mission.  Disaster response is a very "who you know" world, and most collaboration takes place at large in-person meetings.  It can be difficult to keep track of all the players in the field and what they're doing.  My hope is that non-profits will find in my app a simple, user-friendly way to bring together parties with common goals and help them work more effectively toward their shared mission.

### Features
1. User login:  each user will be able to sign up for an account and log in to the application.  They will also have a profile page.
2. Browse/search projects:  users will be able to browse all posted projects by criteria including lead organization, name, date, and category.  They will also be able to search projects by keyword.
3. Create project:  users will be able to create projects when logged in.  New projects will appear on the projects page and in browse/search results.
4. Offer resource:  users will be able to submit a resource offer when logged in and viewing a project proposal created by another user.  The creator of the project can accept or decline resource offers.  I would like for project authors and users whose resource offers have been approved to then be able to view and submit content to a project management page; however, I anticipate that functionality being outside the scope of this course.
5. Messaging:  users (when logged in) will be able to submit public or private messages about projects created by other users.  Public messages will appear in a "Comments" section on the project's display page; project authors will be able to post replies to this page.  Private mesages will appear in the project author's inbox.  The recipient will be able to send replies directly.

### Technologies
Java
Gradle
Spring Boot
MySQL
Thymeleaf

### What I'll Have to Learn
I'm not sure what specific technologies will be relevant to my project, but I want to create an attractive and functional front end, so I anticipate having to deepen my HTML/CSS skills and learn some Javascript.  I also want to limit signups to registered nonprofits.  The only way I know to do this is by having users supply their EIN on signup, and having an administrator verify it manually with the IRS.  I will either need to learn how to create an administrator account, or another way of doing this.