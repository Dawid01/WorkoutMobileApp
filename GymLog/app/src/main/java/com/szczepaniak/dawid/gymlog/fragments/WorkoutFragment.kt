package com.szczepaniak.dawid.gymlog.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.szczepaniak.dawid.gymlog.activities.ExcercisesActivity
import com.szczepaniak.dawid.gymlog.R
import com.szczepaniak.dawid.gymlog.SheetDialogs.MusclesSheetFragment
import com.szczepaniak.dawid.gymlog.activities.CreateRoutineActivity

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class WorkoutFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_workout, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WorkoutFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val exercisesButton: Button = view.findViewById(R.id.exercises_list_button)
        val newRoutineButton: Button = view.findViewById(R.id.new_routine_button)

        exercisesButton.setOnClickListener {
            val intent= Intent(activity, ExcercisesActivity::class.java)
            startActivity(intent)
        }

        newRoutineButton.setOnClickListener {
            val intent= Intent(activity, CreateRoutineActivity::class.java)
            startActivity(intent)
        }


    }
}