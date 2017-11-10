package com.company.testroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    void insertOne(Note note);

    @Insert
    void insertList(List<Note> noteList);

    @Query("SELECT * FROM note")
    List<Note> getAllNotes(); //fail table name


    @Query("SELECT * FROM note WHERE title = :title")
    List<Note> getNoteByTitle(String title);


    @Query("SELECT * FROM note WHERE uid = :uid")
    List<Note> getNoteByUid(int uid);
}
