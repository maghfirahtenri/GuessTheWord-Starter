package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int, lastWord: String) : ViewModel() {
    // The final score
    var score = finalScore
    var word = lastWord
    init {
        Log.i("ScoreViewModel", "Final score is $finalScore and final word is $lastWord")
    }
}
