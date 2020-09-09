package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotes;
    private ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.recycleViewNotes);
        notes.add(new Note("Barber", "Do anything", "Monday", 2));
        notes.add(new Note("Football", "Watch Real Madrid match", "Tuesday", 1));
        notes.add(new Note("Learn Kotlin", "Read a few lists", "Wendsday", 2));
        notes.add(new Note("Watch Android Lessons", "Watch youtube lessons", "Thursday", 2));
        notes.add(new Note("Shop", "Shoping to MegaCenter", "Friday", 1));
        notes.add(new Note("Rest", "Rest in Saturday", "Saturday", 3));
        notes.add(new Note("Clean", "Clean house", "Sunday", 2));
        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNotes.setAdapter(adapter);

    }
}