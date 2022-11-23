package com.germants.usersapp

import com.germants.usersapp.model.Data
import com.germants.usersapp.databinding.ActivityMainBinding

interface UsersUi {

    fun handleView(binding: ActivityMainBinding, adapter: UsersAdapter)

    object Empty : UsersUi {
        override fun handleView(binding: ActivityMainBinding, adapter: UsersAdapter) = Unit
    }

    class SuccessUi(private val users: List<Data?>?) : UsersUi {
        override fun handleView(binding: ActivityMainBinding, adapter: UsersAdapter) {
            binding.rvUsers.adapter = adapter
            adapter.submitList(users)
        }
    }

    class ErrorUi(private val errorMessage: String) : UsersUi {
        override fun handleView(binding: ActivityMainBinding, adapter: UsersAdapter) {
            // todo
        }
    }
}