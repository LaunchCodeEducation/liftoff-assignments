# Project Outline


### Overview
The **[Saint Louis Game Developer Co-op](http://stlgamedev.com/)** (STLGDC) is an non-profit organization that 
provides support, resources, and events for game creators in St. Louis metro area. 
The STLGDC already has and membership program but it is poorly executed, incomprehensive, 
and does not offer a searchable directory or even a list of currently active members.

This project aims to revise or replace the current membership signup process and 
implement a more robust system that will provide a searchable member directory for use by 
STLGDC community and board members for various purposes.



### Features
* **Member signup:** Users will be able to create accounts and pay their membership dues
via PayPal.  Will include email validation and verify dues are paid with PayPal before adding 
member to the database.

* **Email confirmation:** A confirmation email will be sent with a link to confirm member 
account. Once confirmed, another email will be sent with new member information and a link 
to join the STLGDC Slack workspace.

* **User login/profile:** Each user will have a profile page which they can edit/update while 
logged into the site.  Users will be able to set their profile to either be viewable by the 
public or available only to other members.

* **Active/Inactive Members:** Each profile will have an _'active'_ field which will be updated 
when they pay their annual dues.  Will use PayPal API to verify payment.  Slack access will 
also be updated using this system.

* **Search/Sort:** Users will be able to search the member directory for member profiles 
matching their search criteria and sort the list by a desired profile field (ie. skills).

* **Pre-existing Members:** an automated system for adding current active members to the new 
database will need to be devised so that hopefully current members do not need to sign up again.



### Technologies
* WordPress
* HTML
* CSS
* Javascript
* C# or Python ?



### What I'll Have to Learn
The project will likely utilize WordPress as the current website is already using that.  
PayPal API will be used to handle payment of membership dues and verify active membership. 
Some Javascript, Python or C# may be required to execute features, but I have no idea yet.