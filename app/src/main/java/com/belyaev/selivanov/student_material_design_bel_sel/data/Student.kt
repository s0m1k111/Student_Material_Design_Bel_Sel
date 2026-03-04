package com.belyaev.selivanov.student_material_design_bel_sel.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Student (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val description: Int
)