package com.example.hoangnam.firebaseexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview);
        Firebase.setAndroidContext(this);
        Firebase root = new Firebase("https://fir-example-2caa8.firebaseio.com/nam");
        ArrayList<User> a = new ArrayList<>();
        a.add(new User(1));
        a.add(new User(2));
        a.add(new User(3));
        a.add(new User(4));
        a.add(new User(5));
        a.add(new User(6));
        a.add(new User(7));
        root.setValue(a);
        root.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.e("MYTAGgg",dataSnapshot.getValue().toString());
                ArrayList<User> t = (ArrayList<User>)dataSnapshot.getValue();
                Log.e("MYTAGgg", t.toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
}
