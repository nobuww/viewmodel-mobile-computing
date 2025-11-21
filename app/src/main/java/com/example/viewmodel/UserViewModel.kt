package com.example.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

data class Item(
    val name: String,
    val quantity: Int
)

class UserViewModel : ViewModel() {
    private val _userName = mutableStateOf("")
    val userName: androidx.compose.runtime.State<String> = _userName

    private val _itemList = mutableStateListOf<Item>()
    val itemList: List<Item> = _itemList

    fun setUserName(name: String) {
        _userName.value = name
    }

    fun addItem(item: Item) {
        _itemList.add(item)
    }
}

