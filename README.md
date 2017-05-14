# Full-Stack Developer Sample Project


## What is it about?
Here we have a small web application allowing to register for the next Java Meetup.
Unfortunately the most important part of the app is still missing. The form 
fields as well as the backend to store the data in memory. But you are here to 
help us out and get it done.
 
## But *what* should I do exactly?
Extend the form with the required fields (see registration.vm for further details) and 
store the entered information by using a REST endpoint. Giv the user feedback if the
save was successful or in case of an error. Ensure mandatory fields will be entered
and verify the entered values are reasonable e.g. the name must not contains numbers.

To start with, please see the already created files and classes. Especially:

* com.k15t.pat.registration: The package includes a REST endpoint and a controller
* resources/templates: The folder includes the initial velocity templates for the registration page 

The Maven build creates a executable jar which includes the whole runtime (tomcat) to run the app.
You can start it with java -jar registration-0.1.0.jar. If the application is started the pages are
available under http://localhost:8080/registration.html

## A few words about the technology stack
The application is build on top of Spring Boot (http://projects.spring.io/spring-boot/) providing a runtime container. 
Furthermore Jersey for implementing REST resources, Velocity for templating pages and jQuery/Bootstrap is included and 
can be used as well. Building and packaging the application is done with Maven. 

## What's expected of me?
When our engineers receive your final result, we'll be looking at the following things:

* The ability to build it out of the box using maven
* Improvements you made around the main task  
* The quality and style of code written
* The tests and their structure and coverage
* The choice of technologies used to complete the task. You are free to use whatever you think is needed and helps you to get it done!
* The documentation provided (mainly javadoc). Please consider also to document assumptions or decisions you made.  

Typically we expect it to compile and run on a Mac/Windows environment with Java 8. If your set up is any different, do let us know!
When you are done share the result via GitHub.

Tip: Use git as you would in a product environment - small, meaningful commits with descriptive commit messages. This makes it easy for the reviewer to follow your steps and comprehend what you are doing.

Good luck!




## Documentation

##Documentation
	Project name : Java Meetup Registration
------------------------------------------------------------------------------------------------------------------------
##Steps to run the project:
	Please refer run-readme.md file.
------------------------------------------------------------------------------------------------------------------------
##Project Modules :
	This project consists of back-end as well as frontend services 
	
##Project architectural points:
	Points regarding the development phase:

#### 1. Modularise :
	For the time being I have modulerise the project on package level.
	Later we can also modularise in maven modules.

------------------------------------------------------------------------------------------------------------------------
#### 2. DTO :
	It stands for Data Transfer Object.
	In this project DTO are used to send as response object from rest controller.

------------------------------------------------------------------------------------------------------------------------
#### 3. RESTful API design :	
	Backend consists following restful apis i.e.
	a. /api/users - used for all user related services; As registration comes under user ; I have changed the /registration to /user. As per the REST norm we should not use verbs.
	Please refer to UserResource for more

------------------------------------------------------------------------------------------------------------------------
#### 4. Exception Handler via Aspect :
	Added aspect for exception handling at rest layer and send appropriate http status and error messages.
	1. com.k15t.pat.exception -> consists of all user defined errors like BadRequestException
	2.com.k15t.pat.exception.RestResponseEntityExceptionHandler -> Takes care of throwing exceptions in user readable format. Handles exceptions like BadRequestException and other runtime exceptions.
	

------------------------------------------------------------------------------------------------------------------------
#### 5. Dozer mapper used :
	Dozer bean mapper is used to map two objects and its fields. Mappings files have been written in resources/dozer folder.

------------------------------------------------------------------------------------------------------------------------

#### 6. Unit tests:
	Unit test written using testNG and only exception thrown use cases.

------------------------------------------------------------------------------------------------------------------------

#### 7. Comments :
	Entire code styling is influenced by Clean Code principle - Robert Martin
	Which says
	'Truth can only be found in one place: the code’.
	So you may not found any comments anywhere in the project.
	Keeping in mind that git can be used to manage version of file and method name should be kept as self explanatory. However, if you need comments on each file. I can do that too.

------------------------------------------------------------------------------------------------------------------------
#### 8. Design principles used in Project :
	a. SOLID (single responsibility, open-closed, Liskov subsitution, interface segregation, dependency inversion) principle,
	b. Composition over inheritance,
	c. DRY(Don’t repeat yourself),
	d. Test only exceptions,
	e. KISS(Keep it simple, stupid)

------------------------------------------------------------------------------------------------------------------------
#### 9. Frontend :
	a. registrationController is associated to registration.vm and
	it uses userService to consume rest.

------------------------------------------------------------------------------------------------------------------------

#### 10. Area of improvements :
	a. Test cases:
	I have written only exception thrown test case we can also write the positive test cases in future.
	b. while coding I have not used git as we use in professional environment
	c. bower is not used for frontend
	d. no frontend tests written