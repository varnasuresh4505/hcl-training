# College Timetable & Attendance System

## 1. Project Overview

The *College Timetable & Attendance System* is a web-based application designed to simplify academic timetable management and student attendance tracking in colleges.

The system allows administrators to manage academic information, Heads of Departments (HODs) to create timetables and manage faculty substitutions, faculty members to mark period-wise attendance, and students to view their subject-wise attendance percentage.

It also detects timetable clashes, identifies students with attendance shortages, and generates attendance reports to improve academic administration.

## 2. User Roles

- *Admin:* Manages subjects, sections, classrooms, users, and section reports.
- *HOD (Head of Department):* Creates timetables, resolves scheduling issues, and assigns substitute faculty.
- *Faculty:* Marks attendance for assigned periods and edits attendance within the permitted time window.
- *Student:* Views subject-wise attendance percentages and receives shortage alerts.

## 3. Key Features

### Academic Management
- Manage subjects, courses, sections, classrooms, and faculty workloads.
- Maintain academic information required for timetable generation.

### Timetable Management
- Create and manage class timetables.
- Detect faculty, classroom, and section scheduling clashes.
- Allow HODs to assign substitute faculty when required.

### Attendance Management
- Mark attendance for individual class periods.
- Restrict attendance marking to the faculty assigned to the relevant period.
- Allow attendance edits only within 24 hours.
- Maintain an audit trail of attendance modifications.

### Student Attendance Tracking
- Display subject-wise attendance percentages.
- Identify students whose attendance falls below 75%.
- Generate attendance shortage alerts.
- Support condonation requests for attendance shortages.

### Reports and Notifications
- Generate attendance reports for individual sections.
- Export section-wise attendance reports.
- Provide shortage information to support academic monitoring.

## 4. Functional Requirements

FR1 - Admin can configure subjects, sections, and classrooms. 
FR2 - HOD can create timetables, and the system detects faculty and classroom clashes. 
FR3 - Faculty can mark attendance only for their assigned periods. 
FR4 - Faculty can edit attendance within 24 hours of marking it. 
FR5 - Students can view their subject-wise attendance percentages. 
FR6 - The system alerts students whose attendance falls below 75%. 
FR7 - HOD can assign substitute faculty. 
FR8 - Admin can export section-wise attendance reports. 

## 5. Non-Functional Requirements

- *Performance:* Attendance marking should take less than one second for a class of 70 students under the specified test conditions.
- *Security:* Attendance-edit restrictions must be enforced on the server side.
- *Auditability:* Attendance modifications must be recorded in an audit trail.
- *Responsiveness:* The application should work on tablets and other supported screen sizes.
- *Reliability:* Timetable and attendance operations should maintain data consistency.

## 6. Technology Stack

- *Frontend:* React.js
- *Backend:* Java, Spring Boot
- *Database:* MySQL
- *Architecture:* Microservices
- *API Communication:* REST APIs
- *Build Tool:* Maven
- *Version Control:* Git and GitHub
- *Development Environments:* IntelliJ IDEA and Visual Studio Code

## 7. System Architecture

The application is organized into the following logical services:

### Auth Service (`auth-service`)
Handles user authentication, user information, and role-based access for Admin, HOD, Faculty, and Student.

### Academic Service (`academic-service`)
Manages academic setup, subjects, sections, rooms, faculty workloads, timetable creation, clash detection, and faculty substitutions.

### Attendance Service (`attendance-service`)
Manages period sessions, attendance marking, attendance editing, attendance calculations, shortage alerts, condonation requests, and attendance reports.

### Service Communication

The Attendance Service communicates with the Academic Service through OpenFeign when academic or timetable information is required.

## 8. Database Design

`app_user`             Stores user and role information. 
`subject`              Stores subject details. 
`section`              Stores class and section information. 
`room`                 Stores classroom information. 
`faculty`              Stores faculty details. 
`timetable_slot`       Stores scheduled timetable slots. 
`period_session`       Represents an individual class period. 
`attendance`           Stores student attendance records. 
`substitution`         Stores substitute faculty assignments. 
`condonation`          Stores attendance condonation requests. 
