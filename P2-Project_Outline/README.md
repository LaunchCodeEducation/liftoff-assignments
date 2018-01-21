# Project Outline
For this assignment, you will submit a high-level outline of your project. This can, and likely will, change over time. In particular, your mentor will provide feedback and direction and feedback to help sharpen your ideas. So don't worry if you feel unsure about some aspects of the outline, or if you have to change some things later.

## Assignment Description
[Project Outline Assignment](https://education.launchcode.org/liftoff/assignments/project-outline/)

## Submission Instructions

### Overview
My project ("Nevermind") is a filter service for your texts. If you've ever had someone in your phone that you might one day be inclinded to send a less than appropriate message, this app screens your message and asks if you really want to send that message if it includes an inappropriate word, as determined by a database of words.

It also will use Google Maps to track where you are and, if you're in a bar, how long you're there for. If you're there for more than an hour, it'll ask if you want to send a message after each text, though this feature could be turned off at the user's discretion.

### Features
**User Login**: The user can log into the app and turn on and off the two censors as they see fit

**Bar Tracker**: This will track if the user goes into a bar and how long they're in there for. If they go to one bar for more than an hour or two or more bars in under an hour, it'll start to ask if you want to send whatever text you're trying to send.

**SMS Service**: The heart of the whole thing, this is what looks over your text. After you press send, it reads the message and either sends it without a word or asks you to clarify if you want to send it if your message triggers a keyword.

**Data Registry** : This is more of a backend thing than anything else, but it'll allow the admins to add or remove inappropriate language as is needed

***Future Feature : Photo Tracking** : This would look for inappropriate photos that might not appreciated by the intended recipient. This won't be implemented untill the kinks can be worked out*

### Technologies
- Java
- MySQL
- Google Maps
- SMS
- Android Studio
- Spring
- Thymeleaf
- Bootstrap

### What I'll Have to Learn
I will need to learn how to properly use the Android SDK and how to integrate Google Maps (for the Bar Tracker) and SMS (for texting services) into my app. In addition, I'll need to work out the kinks of how to properly implement user login and authentication using Java. 