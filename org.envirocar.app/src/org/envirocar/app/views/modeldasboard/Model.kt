package org.envirocar.app.views.modeldasboard

import androidx.annotation.DrawableRes

data class Model(
    val name: String,
    val url: String,
    @DrawableRes
    val icon: Int
)
