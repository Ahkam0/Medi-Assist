package com.ahkam.mediassist.navigation

import androidx.navigation.NavOptionsBuilder

sealed class NavigatorEvent {

    object NavigateUp : NavigatorEvent()
    object PopBackStack : NavigatorEvent()
    class Directions(val destination: String, val builder: NavOptionsBuilder.() -> Unit) : NavigatorEvent()
}