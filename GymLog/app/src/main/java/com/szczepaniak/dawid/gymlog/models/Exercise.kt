package com.szczepaniak.dawid.gymlog.models

data class Exercise(
    val id: Int,
    val name: String? = null,
    val type: String? = null,
    val muscle: String? = null,
    val difficulty: String? = null,
    val instructions: String? = null
)