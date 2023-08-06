package com.example.peaceofmind.data

import com.example.peaceofmind.R
import com.example.peaceofmind.model.Affirmation

class DataSource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.aff1, R.drawable.pict),
            Affirmation(R.string.aff2, R.drawable.pict),
            Affirmation(R.string.aff3, R.drawable.pict),
            Affirmation(R.string.aff4, R.drawable.pict),
            Affirmation(R.string.aff5, R.drawable.pict),
            Affirmation(R.string.aff6, R.drawable.pict),
            Affirmation(R.string.aff7, R.drawable.pict),
            Affirmation(R.string.aff8, R.drawable.pict),
            Affirmation(R.string.aff9, R.drawable.pict),
            Affirmation(R.string.aff10, R.drawable.pict),
        )
    }

}