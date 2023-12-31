package com.example.ece_452_project.data

import com.example.ece_452_project.remote.RemoteUser

data class User (
    var username: String = "",
    var password: String = "",
    var name: String = "",
    var email: String = "",
    var dietary: List<String> = listOf<String>(),
    var friends: List<String> = listOf<String>(),
    var schedule: MutableList<Event> = mutableListOf<Event>(),
    var discussions: MutableList<Discussion> = mutableListOf<Discussion>()
) {
    constructor(user: RemoteUser) : this() {
        user.email?.let{email = it}
        user.password?.let{password = it}
        user.username?.let{username = it}
        user.name?.let{name = it}
        user.dietary?.let{dietary = it}
        user.friends?.let{friends = it}
    }

    constructor(user: User) : this() {
        user.username?.let{username = it}
        user.password?.let{password = it}
        user.name?.let{name = it}
        user.email?.let{email = it}
        user.dietary?.let{dietary = it}
        user.friends?.let{friends = it}
        user.schedule?.let{schedule = it}
        user.discussions?.let{discussions = it}
    }
}