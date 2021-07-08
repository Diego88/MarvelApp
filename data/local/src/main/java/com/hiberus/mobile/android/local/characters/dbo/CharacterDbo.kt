package com.hiberus.mobile.android.local.characters.dbo

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Characters")
data class CharacterDbo(
    @PrimaryKey
    val id: Int,
    val name: String,
    val description: String,
    val modified: String,
    val resourceURI: String,
    val imageExtension: String,
    val imagePath: String
)