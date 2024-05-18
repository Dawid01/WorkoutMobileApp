package com.szczepaniak.dawid.gymlog.models

import java.sql.Date

data class Workout (
    val id: Int,
    val time: Int,
    val volume: Float,
    val date: Date,
    val exerciseSets: List<ExerciseSet>
)