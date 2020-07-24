package com.example.fac;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Objects;

public class ProfileActivity extends AppCompatActivity {

    Button btn;
    TextView tvName;
    String userID;
    FirebaseAuth mAuth;
    FirebaseFirestore db;
    TextInputLayout phone, gender, dob, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //intent

        phone = (TextInputLayout) findViewById(R.id.profilePhone);
        gender = (TextInputLayout) findViewById(R.id.profileGender);
        dob = (TextInputLayout) findViewById(R.id.profileDob);
        age = (TextInputLayout) findViewById(R.id.profileAge);
        tvName = (TextView) findViewById(R.id.profileName);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        userID = Objects.requireNonNull(mAuth.getCurrentUser()).getUid();

        DocumentReference reference = db.collection("users").document(userID);
        reference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                assert value != null;
                tvName.setText(value.getString("Name"));
                Objects.requireNonNull(phone.getEditText()).setText(value.getString("Phone"));
                Objects.requireNonNull(gender.getEditText()).setText(value.getString("Gender"));
                Objects.requireNonNull(dob.getEditText()).setText(value.getString("DOB"));
                Objects.requireNonNull(age.getEditText()).setText(value.getString("Age"));
            }
        });



        btn = (Button) findViewById(R.id.btnLogout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(ProfileActivity.this,LoginActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
        });
    }

    public void back(View view) {
        startActivity(new Intent(ProfileActivity.this,HomeScreen.class));
    }
}
