package com.github.juliocesarlb.listadecompras

data class ItemModel(
    val id: Int,
    val name: String,
    val onRemove: (ItemModel) -> Unit
)