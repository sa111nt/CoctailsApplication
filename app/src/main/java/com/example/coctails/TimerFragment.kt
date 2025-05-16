package com.example.coctails

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.coctails.databinding.FragmentTimerBinding

class TimerFragment : Fragment() {

    private var _binding: FragmentTimerBinding? = null
    private val binding get() = _binding!!

    private val timerViewModel: TimerViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTimerBinding.inflate(inflater, container, false)

        timerViewModel.timeRemaining.observe(viewLifecycleOwner, { timeRemaining ->
            updateTimerDisplay(timeRemaining)
        })

        timerViewModel.isTimerRunning.observe(viewLifecycleOwner, { isRunning ->
            if (isRunning) {
                binding.startButton.isEnabled = false
                binding.stopButton.isEnabled = true
                binding.pauseButton.isEnabled = true
            } else {
                binding.startButton.isEnabled = true
                binding.stopButton.isEnabled = false
                binding.pauseButton.isEnabled = false
            }
        })

        binding.startButton.setOnClickListener {
            timerViewModel.startTimer()
        }

        binding.stopButton.setOnClickListener {
            timerViewModel.stopTimer()
        }

        binding.pauseButton.setOnClickListener {
            timerViewModel.pauseTimer()
        }

        return binding.root
    }

    private fun updateTimerDisplay(timeRemaining: Long) {
        val minutes = (timeRemaining / 1000) / 60
        val seconds = (timeRemaining / 1000) % 60
        binding.timerTextView.text = String.format("%02d:%02d", minutes, seconds)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
