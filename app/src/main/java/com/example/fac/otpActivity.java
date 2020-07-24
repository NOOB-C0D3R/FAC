package com.example.fac;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class otpActivity extends AppCompatActivity {
    private static final String TAG = "TAG";
    Button btn;
    EditText otp;
    //FirebaseDatabase Node;
    FirebaseFirestore fb;
    //DatabaseReference reference;
    String name, phone, gender, dob, age, userID;

    private String VerificationId;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        phone = i.getStringExtra("phone");
        gender = i.getStringExtra("gender");
        dob = i.getStringExtra("dob");
        age = i.getStringExtra("age");

        mAuth = FirebaseAuth.getInstance();
        fb = FirebaseFirestore.getInstance();
        //Node = FirebaseDatabase.getInstance();
        //reference = Node.getReference("user");
        sendVerificationCode(phone);

        otp = (EditText) findViewById(R.id.etOtp);
        btn = (Button) findViewById(R.id.btnClick);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = otp.getText().toString().trim();

                if(code.isEmpty() || code.length()<6){
                    otp.setError("Enter a valid OTP");
                    otp.requestFocus();
                    return;
                }
                VerifyCode(code);

            }
        });
    }

    private void VerifyCode(String code){
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(VerificationId,code);
        signInWithCredential(credential);
    }

    private void signInWithCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Intent intent = new Intent(otpActivity.this,HomeScreen.class);
                            userID = Objects.requireNonNull(mAuth.getCurrentUser()).getUid();
                            //UserHelperClass helperClass = new UserHelperClass(name, full, selId, dob, age);
                            //reference.child(name).setValue(helperClass);

                            DocumentReference reference = fb.collection("users").document(userID);
                            Map<String,Object> user = new HashMap<>();
                            user.put("Name",name);
                            user.put("Phone",phone);
                            user.put("Gender",gender);
                            user.put("DOB",dob);
                            user.put("Age",age);
                            reference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d(TAG, "onSuccess: user profile created for "+ userID);
                                }
                            });

                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }else{
                            Toast.makeText(otpActivity.this, Objects.requireNonNull(task.getException()).getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    private void sendVerificationCode(String number){

        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                number,
                60,
                TimeUnit.SECONDS,
                TaskExecutors.MAIN_THREAD,
                mCallBack
        );
    }

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks
            mCallBack = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);

            VerificationId = s;
        }

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

            String code = phoneAuthCredential.getSmsCode();
            if(code != null) {
                otp.setText(code);
                VerifyCode(code);
            }

        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(otpActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    };
}
