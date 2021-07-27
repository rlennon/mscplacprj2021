# mscplacprj2021

## Table of Contents

* [Preamble](#preamble)
  * [Product Owner](#product-owner)
  * [Team Members](#team-members)
* [Project Deadline](#project-deadline)
* [Project Specification](#project-specification)
* [Considerations](#considerations)
* [Useful Links](#useful-links)
  * For more information visit our other sections
* [Risk Register](#risk-register)
* [Tenants of Design](#tenants-of-design)
* [Social Contract](#social-contract)
  * [Meetings](#meetings)
  * [Communication](#communication)
  * [Other](#other)
    * [Estimating Story Points](#estimating-story-points)
    * [Scrum Master](#scrum-master)
* [Workflow](#workflow)
  

   
   

## Preamble

This is the online repository for the CleanerCode. We are moving forward from Waterfall and Spreadsheets for project management.

Our product will be delivered using an Agile methodology that embraces the DevOps culture. Please note that our culture embraces change and these documents are treated as living, breathing artefacts that will be continuously updated.

CleanerCode is a very large company with many divisions. The task is to create pipelines for development work. This is an internal project. 
* Create a pipeline in GitHub. Using early prototyping to establish what is needed. 
* Write scripts to automate pipelines for any future projects the company may work on. 
* Use the prototype pipeline to manage the scripts to demonstrate the value of pipelines

### Product Owner

       Ruth G. Lennon
       
### Team Members
       Sharon
       Sunoj
       George

## Project Deadline

**timeline on BB UTC/GMT**

## Project Specification
    
    Clean and simple design

    Frameworks
    Database
    Database persistence technology
    Define the buisness Requirements

## Considerations
       <TBD>
## Useful Links

* [Slack](https://app.slack.com/client/T84LE6L6R/C0232F5G9T7)
* [Task Management](https://github.com/rlennon/mscplacprj2021/projects)
* [GitHub](https://github.com/rlennon/mscplacprj2021)
    
### For more information visit our other sections
Section | Description
--------| -------------
Process | Describes the companies process
Project Log | Log of project activities
Costings | Overview of the project cost
Architecture | Outlines the architecture
Environments | Overview of the environment set-up
DR Plan | Disaster Recovery Plan and procedures
Requirements | Overview of the requirements for the project
SLAs | Service level agreements
Risk Management | How we manage risk
Security | Overview of security
Project Log | Team log for the project
       
## Risk Register

These are the current Risks on the project, re-aligned on a weekly basis

    Team is finding itself to be running short on time due to other work and study commitments
    No PO feedback on software
    Unknown technology choices has led to a lot of upskilling required
    Changing / ambiguous requirements

## Tenants of Design

    Dedication to clean, secure, performant and self documented code
        code Frameworks used
        code coverage tool used
        Secure code will be used
        performance testing tool to be used
    Documentation / code commenting (tool to be decided)/seperate branch
    
    Testing:
        Unit testing
	Automated acceptance testing
	Exploratory testing
        integretation testing
        UAT (user Acceptance testing)
        
    Environments:
        staging and production
        tight configuration management for consistency and reproducibility (IEEE 828)
        automated creation and deployments
        integrated and automated pipeline (commit -> test -> deploy)
    Github version control:
        [Branching Strategy](docs/branching.md)
        version/release management
            Release versioning
                x.0 for project deliverables and enhancements
                x.x for bug fixes                            
    Agile project management methods/principles
        Github Project Tasks for managing project tasks and deliverables

## Social Contract

### Meetings

    Stand-ups will occur on Tuesdays 9pm and Fridays 9 PM GMT.
    The order that people give their updates will be based on alphabetical order of those present at the meeting.
    Updates will be in the form: What I've done, What I plan to do, Impediments
    Sprint planning will occur Tue after standup.
    Please add and update items within GitHub Issues prior to the sprint planning session.
    Sprint retro will occur once a week at 8:30pm on Tue.
    The order that people present their sprint retro updates will be based on alphabetical order of those present at the meeting.
    Points raised in the sprint retro will be noted and posted on the slack channel by the Scrum Master.
    Backlog refinement - When, where, how....
    Task estimation will be done using Fibonacci, planning poker. 
    Come prepared to meetings.
    Be on time for Stand Ups and meetings.
    Mobile phones on silent.
    Everyone has equal voice and valuable contribution.
    Keep your language and tone professional at all times.
    Be honest.

### Communication

    Slack is the preferred method of communication.
       Utilize Slack threads to keep subject items and conversations together
    If a demonstration is required use Collab Ultra, record the session and upload to the Slack channel.
    No Slack communications between 9am and 5pm Irish Standard Time.
    Raise a problem as soon as you see it.
    Respect each other and understand differences in knowledge.
    All team documents are to be created using Markdown language and shared on GitHub.
    There are no silly questions, if you don’t understand, ask.
    Share success stories.
    Focus on the positives.
    Don’t make assumptions.
    Don’t interrupt and cut another person off while they are talking.
    Listen when someone is talking, don’t interject.
    Zero tolerance for bullying.
    Communication in this order: Slack, Email, Collab Ultra
    Agile way of working.
    If are assigned a job, take ownership of it and keep it up to date.
    Stick to your agreed working patterns. Let the team know when you are late or going early.
    Keep <boards> updated at all times.
    Update the <Scrum Board> as you progress the story i.e. don’t update at standup.
    Don't be afraid to ask for help.
    Don't be afraid to give constructive critism, as long as it is constructive.
    Solve roadblocks within the team. If the impediment can’t be solved within the team then give it to the Scrum Master.

### Other

    Sprints will start Wednesday.
    The Scrum Master role rotates each week, the schedule is available on the on the process section
    GitHub Projects will be used for task management and planning.
    Each member of the team will work 6 hours per week, unless they are on vacation.

#### Estimating Story Points 
Within Planning Poker

The teams team's velocity is calculated by dividing the the number of points burned each sprint divided by no of sprints. The Velocity chart is used for this calculation.

The teams current story point velocity is "<Choose the number!>".

#### Scrum Master
       
       Week 1: Sharon
       Week 2: Sunoj
       Week 3: George
       Week 4: Sharon 
       Week 5: Sunoj
       Week 6: George
       Week 7: Sharon
       Week 8: Sunoj


## Workflow 
The team has decided to go with Git Flow workflow strategy proposed by [Vincent Driessen](https://nvie.com/posts/a-successful-git-branching-model/) for the project. The details can be found [here](docs/branching.md)
