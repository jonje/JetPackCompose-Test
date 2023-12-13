package org.haknet.jetpackcompose_test.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    @Delete
    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    @Query("select * from shopping_items")
    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    @Query("select sum(price * amount) from shopping_items")
    fun observeTotalPrice(): LiveData<Float>
}