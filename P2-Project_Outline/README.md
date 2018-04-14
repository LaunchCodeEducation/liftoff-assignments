# Project Outline
For this assignment, you will submit a high-level outline of your project. This can, and likely will, change over time. In particular, your mentor will provide feedback and direction and feedback to help sharpen your ideas. So don't worry if you feel unsure about some aspects of the outline, or if you have to change some things later.

## Assignment Description
[Project Outline Assignment](https://education.launchcode.org/liftoff/assignments/project-outline/)

## Submission Instructions

### Overview
My app is for people who are downsizing to a smaller living space and want to offer their excess possessions to family members and friends. Specifically, I’m thinking of seniors who want to give their adult children (and grandchildren) in far-flung places the opportunity to call dibs on the items they’d like to have. There's no need for everyone to gather at Grandma and Grandpa's house in person; this app will allow everyone to view photos and descriptions online. Think of a by-invitation-only OfferUp or Craigslist where users can "like" items.

This idea came to me during a series of sobering lunch meetings with my parents over the past few months. My folks are in their 70s and live in a four-bedroom house. One day in November, after he finished his Saturday morning yard work, my father announced that he didn’t want to be pulling weeds when he was 80. My parents agreed that they no longer want the maintenance hassles of a house and yard, and they want to move into a small apartment or condo.

I remembered how annoyed they were in 2008 when my paternal grandmother secretly downsized and dropped off boxes of things at Goodwill without telling anyone. She got rid of objectively "worthless" items that she didn't realize had sentimental value to my dad and his brother. My parents don't want to make that same mistake as they part with 75 percent of their stuff. (Most of their things will end up being donated to charity, but there are some things my brother, sister, and I would like to have. Cousins, too.)

### Features
Parent user login: A parent user will be able to create an account and log in.
Child user login: At the invitation of a parent, a child user will be able to create an account, log in, and view everything the parent posts.
Search: All users will be able to search the photo descriptions for keywords.
Photos: A parent user will be able to upload photos.
Photo descriptions: A parent user will be able to add brief descriptions that will be displayed with photos.
Dibs: A child user will be able to call dibs on (aka "like") a photo.
Dibs lists: A parent user will be able to view a list for each child and which items that child has claimed.

(Future features I probably won't have time to implement now, but I want to add later:)
Item timer: Each item will be visible to child users for one week. Items that go unclaimed will automatically be moved to a holding area visible to the parent user only.
Holding area: The parent user will see all the unclaimed items and choose what to do with them: sell or donate. 
Donation list: Parent user will be able to populate a list of unclaimed items that they'll donate. At tax time, a list with all those photos and descriptions is good enough for the IRS and would please my father the retired CPA.

### Technologies
Python
Django
PostgreSQL
something TBA that allows users to upload photos
someplace TBA (AWS S3? Google Cloud?) for storage of photos

### What I'll Have to Learn
Django
PostgreSQL
TBA photo uploader
TBA photo storage