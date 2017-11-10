package com.company.testroom;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "my-db").build();

        new Thread(() -> {

            db.getPersonDao().insertOne(new Note("title1", "hello note"));
            db.getPersonDao().insertOne(new Note("title2", "hello note"));

            List<Note> allNotes = db.getPersonDao().getAllNotes();
            Log.e("aaa", allNotes.toString());
        }).start();

    }



}
