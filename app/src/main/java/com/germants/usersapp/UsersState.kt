package com.germants.usersapp

import com.germants.usersapp.model.Data

interface UsersState {

    fun apply(): UsersUi

    class SuccessUsers(private val users: List<Data?>?) : UsersState {
        override fun apply() = UsersUi.SuccessUi(users)
    }

    class ErrorUsers(private val errorMessage: String) : UsersState {
        override fun apply() = UsersUi.ErrorUi(errorMessage)
    }
}

