package com.example.android.inclassassignment11_jingshanw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {


    private DatabaseReference peopleReference = FirebaseDatabase.getInstance().getReference("people");
    private ArrayList<Person> people = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addPerson(View view) {
        String id = UUID.randomUUID().toString();
        Person p = new Person(id, "Xi Wei", 120, true);
        people.add(p);
        peopleReference.child(id).setValue(p);
//    peopleReference.push().setValue(p);
    }


    public void removePerson(View view) {
        if (people.size() == 0) return;
        Person p = people.remove(0);
        peopleReference.child(p.id).removeValue();
    }
}



