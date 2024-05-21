package com.example.trabalho2progmob.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalho2progmob.entities.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("Select * from user where userId = :id LIMIT 1")
    User getUser(int id);

    @Query("Select * from User")
    List<User> getAll();
    @Update
    void update(User user);

    @Insert
    void insertAll(User... user);
}
