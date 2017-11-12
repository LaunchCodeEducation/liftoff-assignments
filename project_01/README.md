# Capstone Project Plan

## Overview

A Vinyl Record Collection and Auction application: It would allow the owner of the collection to enter all of the records, with pertinent indentifying and condition information, and then create subset auction sheets to allow others to bid for the purchase of each record in the auction.  Potential bidders could create accounts and submit bids at each auction for the records they want.  At the end of the auction (determined by auction date and time information), the bids will be sifted for winners, who would be notified.

## Features

Record Collection Display:  Accessible only by Owner, would allow selection of any record the owner wants to put up for auction, to be used on a Create Auction page
Create Auction: Auction creation page accessible only by owner, would allow deletions from list for change of mind, and entering auction specific information, such as Start and End dates and times.  This will require a calendar feature.
Create Bid: Bid page accessible by bid customers that would allow them to select records from auction page for bid creation in the same way the owner selects records for auction creation.
Customer Authentication: Potential bid customers will be able to create accounts and log in to bid
Security: The Bid Customers need to feel safe entering confidential contact and payment information and the owner should feel confident that nobody else can see the entire record collection.
Popup calendar: Any date should be able to be entered through a Popup Calendar.
Automated e-mail: To notify bid winners through e-mail.
Label Printing: To make labels for shipping the records.

## Technologies

C#
ASP.NET
MVC
SQL Server
JQuery UI

## What I'll Have to Learn

How to determine the best table and data relation model for these pages.
How to use the user account creation features availble in ASP.NET in a manner compatible with the needs of this app.
How to achieve the security necessary to keep confidential information confidential.
How to incorporate JQuery UI popup features into the larger program for easier date and time entry for starters, and perhaps other data entry conveniences as discovered.
How to print mailing labels.