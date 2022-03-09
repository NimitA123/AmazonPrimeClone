package com.example.tastyappclone.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tastyappclone.reposirity.TastyReposirity


class MainTastyAppViewModel(private val tastyResposirity: TastyReposirity) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return  TastyAppViewModel(tastyResposirity) as T
    }
}