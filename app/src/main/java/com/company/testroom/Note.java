package com.company.testroom;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Note {
    @PrimaryKey(autoGenerate = true) int uid;
    String title;
    String text;

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "uid=" + uid +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
