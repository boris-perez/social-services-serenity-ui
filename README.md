# Automated test SET-Social Services UI  
The automated social services testing project helps you perform automated tests by UI, of the main functions of each social component.

## Table of Contents
* [General Info](#general-info)
* [Serenity](#serenity)
* [Installation](#installation)
* [Configurations](#configurations)
* [Social Explanation](#social-explanation)
* [Social Chat](#social-chat)
* [Social Attachment](#social-attachment)
* [Document Library](#document-library)
* [Contact](#contact)

## General Info
The automated tests are carried out to test a set of main functionalities of the social components.

## Serenity BDD
Serenity BDD is an open source library that aims to make the idea of living documentation a reality.

## Screenplay Pattern
The Screenplay Pattern is an approach to writing high quality automated acceptance tests based on good software engineering principles such as the Single Responsibility Principle.

## Actors and the Screenplay Pattern
In the Screenplay Pattern, we call a user interacting with the system an Actor. Actors are at the heart of the Screenplay Pattern. Each actor has a certain number of Abilities.

## Installation

### Project Dependencies

##### 1.  Java SDK 8 or later
For more details please visit [Download Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html).
```shell
$ java -version
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
 ```
 
##### 2. Serenity 

```shell
<dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay-webdriver</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-junit</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-spring</artifactId>
            <version>${serenity.version}</version>
        </dependency>
 ```

### Run the test cases

####In the console execute all test cases of Explanation

```
$ mvn clean verify -Dtags="EXPLANATION"
```
* Execute test cases "Create explanation"
```
$ mvn clean verify -Dtags="Create Explanation"
```
* Execute test cases "Delete explanation"
```
$ mvn clean verify -Dtags="Delete Explanation"
```
* Execute test cases "Navigate Between Cards"
```
$ mvn clean verify -Dtags="Navigate Between Cards"
```
* Execute test cases of "Edit Explanation"
```
$ mvn clean verify -Dtags="Edit Explanation"
```
#### In the console execute test cases of Social Attachment

#### In the console execute test cases of Social Documents

#### In the console execute test cases of Social Chat

## Reports
You can see the reports by entering:
```
Target>site 
```
open the index.html file

## Social Explanation

### The following scenarios are automated
- Login
- Create new explanation
- Write and save and explanation
- Write and cancel and explanation
- Edit an explanation
- Navigation between explanation cards 
- Delete an explanation 

## Social Chat

### The following scenarios are automated
- Login
- Create Individual conversation
- Create group conversation
- Send text message 
- Send message with image
- Send message with document .pdf 
- Send message with document .docx 
- Reply a message
- Edit a message
- Delete a message
- Mute conversation
- Change the privacy
- Left conversation
- Add participant from add participant icon 
- Add participant from add participant option 
- Add participant from mentions 
- Remove participant participant from add participant option 
- Local search 
- Global search
- Use of hashTags
- Use of mentions


## Social Attachment

### The following scenarios are automated
- Login
- Upload document
- Edit document
- Download document 
- Document version
- Upload document version 
- View document 
- Delete document
- Search from library
- Download from library
- View from library
- Version from library
- Delete from library
- Select from library


## Document Library

### The following scenarios are automated
- Login
- Upload document
- Edit document
- Download document 
- Document version
- Upload document version 
- View document 
- Pagination

## Contact

Copyright © 2019 [Digital Harbor](https://www.digitalharbor.com/), Inc. All Rights Reserved.

