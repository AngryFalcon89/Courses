package com.example.grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
//data class is used to handle single return object for card view
//this simply returns data of image and string resources which can be further linked to list items
data class Topic(
    @StringRes val name: Int,
    val availableCourse: Int,
    @DrawableRes val imageRes: Int
)