package com.szczepaniak.dawid.gymlog

import android.content.Context
import com.szczepaniak.dawid.gymlog.models.Exercise
import com.szczepaniak.dawid.gymlog.models.Routine

object Singleton {
    private var selectedExercises: MutableList<Exercise> = mutableListOf()
    private lateinit var newRoutine: Routine
    fun getSelectedExercises(): List<Exercise> {
        return selectedExercises
    }

    fun setSelectedExercise(exercises: List<Exercise>) {
        selectedExercises = exercises.toMutableList()
    }
    fun clearSelectedExercises() {
        selectedExercises.clear()
    }

    fun getNewRoutine() : Routine{
        return  newRoutine
    }

    fun setNewRoutine(routine: Routine){
        newRoutine = routine
    }
}