# Software Requirements Specification (SRS)

# Weekly Schedule Manager

----------

## Preface

This document provides the Software Requirements Specification (SRS) for the **Weekly Schedule Manager**. It defines the system functionalities, operational requirements, constraints, and overall structure necessary for development and maintenance.

----------

# Version History

Version

Description

1.0

Initial Draft

1.1

Added functional and non-functional requirements

1.2

Added system models and future enhancements

----------

# 1. Introduction

## Purpose

The **Weekly Schedule Manager** is a command-line application developed in the C programming language that helps users organize and manage their weekly schedules efficiently. The system allows users to add, edit, delete, and view subjects along with scheduled times for each day of the week.

The application is intended for students, teachers, and professionals who need a simple schedule management tool.

----------

## Document Conventions

This document follows standard SRS documentation conventions:

-   **Must** → Mandatory system requirements
    
-   **Should** → Recommended system behavior
    
-   **May** → Optional or future enhancements
    

----------

## Intended Audience and Reading Suggestions

### Developers

Use this document as a guideline for implementation and maintenance.

### Testers

Use this document to validate system functionality.

### Users

Understand the capabilities and limitations of the system.

----------

## Scope

The Weekly Schedule Manager provides the following features:

-   Add subjects to weekly schedules
    
-   Edit existing subjects and times
    
-   Delete subjects
    
-   View daily schedules
    
-   View complete weekly schedules
    
-   Store subject and timing information
    

The system operates through a command-line interface (CLI).

----------

## References

-   IEEE SRS Documentation Standard
    
-   C Programming Language Documentation
    
-   GCC Compiler Documentation
    

----------

# 2. Overall Description

## Product Perspective

The Weekly Schedule Manager is a standalone command-line application developed using the C programming language.

The system does not require internet connectivity or external database integration.

----------

## Product Functions

### Schedule Management

-   Add subjects for specific days
    
-   Store subject names and timings
    

### Edit Schedule

-   Modify existing subjects and times
    

### Delete Schedule Entries

-   Remove subjects from the weekly schedule
    

### View Schedule

-   Display schedules for a specific day
    
-   Display the complete weekly schedule
    

----------

## User Classes and Characteristics

### General User

-   Basic computer knowledge required
    
-   Can interact through terminal/console
    
-   No authentication required
    

----------

## Operating Environment

-   Operating System: Windows, Linux, MacOS
    
-   Compiler: GCC or any standard C compiler
    
-   Interface: Command Line Interface (CLI)
    

----------

## Design and Implementation Constraints

-   Developed entirely in C language
    
-   Data stored temporarily during runtime
    
-   Console-based interface only
    

----------

## Assumptions and Dependencies

-   User has a C compiler installed
    
-   User understands basic terminal operations
    
-   Program runs locally on the machine
    

----------

# 3. System Requirements Specification

## Functional Requirements

### User Menu

The system must display a menu with the following options:

1.  Add Subject
    
2.  Edit Subject
    
3.  Delete Subject
    
4.  View Weekly Schedule
    
5.  View Daily Schedule
    
6.  Exit Program
    

----------

## Add Subject

-   The system must allow users to:
    
    -   Select a day of the week
        
    -   Enter subject name
        
    -   Enter subject time
        
-   The system must store the information correctly.
    

----------

## Edit Subject

-   The system must allow users to:
    
    -   Select a day
        
    -   Select a subject
        
    -   Modify subject name or time
        

----------

## Delete Subject

-   The system must allow users to:
    
    -   Select a day
        
    -   Select a subject to remove
        
-   The system must update the schedule after deletion.
    

----------

## View Weekly Schedule

-   The system must display:
    
    -   All days of the week
        
    -   All subjects with scheduled times
        

----------

## View Daily Schedule

-   The system must:
    
    -   Allow users to select a day
        
    -   Display subjects only for that day
        

----------

# Non-Functional Requirements

## Performance Requirements

-   The system should respond instantly to user commands.
    
-   The system should support multiple subjects per day.
    

----------

## Usability Requirements

-   The interface should be simple and user-friendly.
    
-   Menu navigation should be easy to understand.
    

----------

## Reliability Requirements

-   The system must handle invalid input gracefully.
    
-   The system should prevent crashes during execution.
    

----------

## Maintainability Requirements

-   The code should be modular and well-commented.
    
-   Functions should be separated logically.
    

----------

## Portability Requirements

-   The program should compile on:
    
    -   Windows
        
    -   Linux
        
    -   MacOS
        

----------

# 4. System Models

<img src="image/2. imgg.png">

### Inputs

-   User Commands
    
-   Subject Names
    
-   Schedule Times
    

### Outputs

-   Weekly Schedule
    
-   Daily Schedule
    
-   Confirmation Messages
    

----------

## Activity Diagram

### Add Subject Process

1.  Start Program
    
2.  Display Menu
    
3.  Select Add Subject
    
4.  Enter Day
    
5.  Enter Subject Name
    
6.  Enter Subject Time
    
7.  Save Information
    
8.  Return to Menu
    

----------

## Use Case Diagram

### User Use Cases

-   Add Subject
    
-   Edit Subject
    
-   Delete Subject
    
-   View Weekly Schedule
    
-   View Daily Schedule
    
-   Exit Program
    

----------

## Sequence Diagram

### Viewing Daily Schedule

1.  User selects "View Daily Schedule"
    
2.  System requests day number
    
3.  User enters day
    
4.  System retrieves schedule
    
5.  System displays subjects and times
    

----------

## Entity Relationship Model

### Entities

#### Day

-   Day ID
    
-   Day Name
    

#### Subject

-   Subject Name
    
-   Subject Time
    

### Relationship

-   One day can contain multiple subjects.
    

----------

## State Diagram

### Program States

-   Main Menu
    
-   Add Subject
    
-   Edit Subject
    
-   Delete Subject
    
-   View Schedule
    
-   Exit
    

----------

# 5. System Evolution

## Future Enhancements

-   File saving functionality
    
-   Persistent data storage
    
-   User authentication
    
-   Graphical User Interface (GUI)
    
-   Mobile application version
    

----------

## Expected Changes

-   Integration with calendar systems
    
-   Notification/reminder support
    
-   Advanced schedule searching
    

----------

# 6. Appendices

## Hardware Requirements

-   Minimum 2 GB RAM
    
-   Any modern processor
    
-   Keyboard and display terminal
    

----------

## Software Requirements

-   GCC Compiler
    
-   Code::Blocks / VS Code / Dev-C++
    
-   Operating System (Windows/Linux/MacOS)
    

----------

## Database Requirements

Currently, no external database is required.

Future versions may integrate:

-   File handling
    
-   SQLite
    
-   MySQL
    

----------

# Conclusion

The **Weekly Schedule Manager** is a lightweight and efficient C-based scheduling application designed for users who need a simple way to organize weekly tasks and subjects. The system focuses on usability, reliability, and portability while providing essential scheduling functionalities.
