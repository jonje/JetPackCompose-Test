package org.haknet.jetpackcompose_test.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingItemDB : RoomDatabase() {

    abstract fun shoppingDao(): ShoppingDao
}