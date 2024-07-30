# GymLog

GymLog is a university project designed to assist users in tracking their strength training workouts, monitoring progress, and managing workout plans. This report outlines the project goals, implemented features, technologies used, challenges encountered, and the individual contributions to the project.

## Project Overview

The objective of this project was to create an application that enables users to:
- Add and track their workouts
- Monitor exercises performed
- Save results
- Track progress

## Implemented Features

Throughout the project, the following features were implemented:
- Enter personal information such as height and weight
- Browse a large database of exercises with instructions and links to YouTube tutorials
- Create workout plans (routines)
- Create and save workout notes
- Display simple statistics

## Planned Features Not Implemented

The following planned features were not implemented:
- View previous results when creating notes
- Create and save custom exercises

## Technologies and Libraries Used

The development of GymLog involved the following technologies and libraries:
- **Programming Language**: Kotlin
- **Tool**: Android Studio
- **Database**: SQLite
- **Exercise API**: [Ninjas API](https://api-ninjas.com/api/exercises)
- **Libraries**: Retrofit, Room, Lifecycle, Material Calendar View
- **Icons**: [Flaticon](https://www.flaticon.com)

## Challenges and Solutions

During the project, several challenges were encountered:
- **User Interface in Landscape Mode**: Initially, the UI did not look good in landscape mode. Separate XML files for layouts were required, leading to the decision to lock the screen orientation to portrait to simplify development and avoid compatibility issues.
- **Exercise API Issues**: The API did not return unique identifiers for exercises, and other fields could repeat (e.g., exercises with the same name but different descriptions). This necessitated storing all exercise details instead of just the identifier, increasing the database size and potentially impacting performance.
- **Calendar Integration**: To allow users to mark multiple training days, the Material Calendar View library was added.
- **Database Relationships**: Creating relationships between classes such as workouts and exercises using the Room library was challenging. Implementation involved extensive research and trial and error, resulting in some minor bugs when saving workouts.

## Screenshots

GymLog offers a clear and intuitive user interface. Below are some screenshots showcasing the key views of the application:

<img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/1.png" alt="Create Local Profile" width="200"/> <img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/2.png" alt="Routine Page" width="200"/>
<img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/3.png" alt="Search Exercises by Name" width="200"/> <img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/4.png" alt="Exercise Information" width="200"/>
<img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/5.png" alt="Sort Exercises by Body Part" width="200"/> <img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/6.png" alt="Select Exercises for Routine" width="200"/>
<img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/7.png" alt="Create Routine Page" width="200"/> <img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/8.png" alt="Log Workout" width="200"/>
<img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/9.png" alt="Home Page" width="200"/> <img src="https://github.com/Dawid01/WorkoutMobileApp/blob/main/Screens/10.png" alt="User Profile" width="200"/>
