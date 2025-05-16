package com.example.coctails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import android.os.CountDownTimer


class TimerViewModel : ViewModel() {

    private val _timeRemaining = MutableLiveData<Long>().apply {
        value = 5 * 60 * 1000
    }
    val timeRemaining: LiveData<Long> get() = _timeRemaining

    private val _isTimerRunning = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isTimerRunning: LiveData<Boolean> get() = _isTimerRunning

    private var countDownTimer: CountDownTimer? = null


    fun startTimer() {
        if (_isTimerRunning.value == false) {
            _isTimerRunning.value = true
            countDownTimer = object : CountDownTimer(_timeRemaining.value ?: 0, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    _timeRemaining.value = millisUntilFinished
                }

                override fun onFinish() {
                    _isTimerRunning.value = false
                    _timeRemaining.value = 0
                }
            }.start()
        }
    }

    fun stopTimer() {
        countDownTimer?.cancel()
        _isTimerRunning.value = false
        _timeRemaining.value = 5 * 60 * 1000
    }

    fun pauseTimer() {
        countDownTimer?.cancel()
        _isTimerRunning.value = false
    }

    override fun onCleared() {
        super.onCleared()
        countDownTimer?.cancel()
    }
}
