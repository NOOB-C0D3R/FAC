package com.example.fac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;

import java.util.Calendar;
import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    Button btn;
    TextInputLayout etName, etPhone;
    CountryCodePicker ccp;
    RadioGroup radioGroup;
    RadioButton button;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        btn = (Button) findViewById(R.id.btnGo);
        etName = (TextInputLayout) findViewById(R.id.username);
        etPhone = (TextInputLayout) findViewById(R.id.mobileNum);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        datePicker = (DatePicker) findViewById(R.id.date);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = Objects.requireNonNull(etName.getEditText()).getText().toString().trim();
                String code = ccp.getFullNumber();
                String phone = Objects.requireNonNull(etPhone.getEditText()).getText().toString().trim();
                String full = "+" + code + phone;
                int selId = radioGroup.getCheckedRadioButtonId();

                if(!isConnected(LoginActivity.this)){
                    showCustomDialog();
                }

                if(!ValidateName() | !ValidatePhone()){
                    return;
                }

                if(!ValidateGender()) {
                    return;
                }
                button = findViewById(selId);
                String gender = button.getText().toString().trim();

                if(!ValidateAge()) {
                    return;
                }

                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth()+1;
                int year = datePicker.getYear();

                String dob = day + "-" + month + "-" + year;

                String Age = getAge( year,  month,  day);

                Intent i = new Intent(LoginActivity.this,otpActivity.class);
                i.putExtra("name",name);
                i.putExtra("phone",full);
                i.putExtra("gender",gender);
                i.putExtra("dob",dob);
                i.putExtra("age",Age);
                startActivity(i);
            }
        });
    }

    private boolean isConnected(LoginActivity loginActivity) {

        ConnectivityManager connectivityManager = (ConnectivityManager) loginActivity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mobile = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if((mobile != null && mobile.isConnected()) || (wifi != null && wifi.isConnected())){
            return true;
        } else {
            return false;
        }
    }

    private void showCustomDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
        builder.setMessage("No Internet Connection. Please connect to a Network!")
                .setCancelable(false)
                .setPositiveButton("Connect", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        LoginActivity.this.finishAffinity();
                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private boolean ValidateName() {
        String name = Objects.requireNonNull(etName.getEditText()).getText().toString().trim();
        if(name.isEmpty()){
            etName.setError("Name Required");
            return false;
        }else if(name.length()<3){
            etName.setError("Name too short");
            return false;
        }else if(name.length()>15){
            etName.setError("Name too long");
            return false;
        }else{
            etName.setError(null);
            etName.setErrorEnabled(false);
            return true;
        }
    }

    private boolean ValidatePhone() {
        String phone = Objects.requireNonNull(etPhone.getEditText()).getText().toString().trim();
        if(phone.isEmpty()){
            etPhone.setError("Phone Number Required");
            return false;
        }else if(phone.length()<10){
            etPhone.setError("Please enter a valid Phone Number");
            return false;
        }else {
            etPhone.setError(null);
            etPhone.setErrorEnabled(false);
            return true;
        }
    }

    private boolean ValidateGender() {
        if(radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this,"Please select Gender",Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }

    private String getAge(int year, int month, int day){
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        month--;

        dob.set(year, month, day);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if(today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
            age--;
        }else if(today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)) {
            if (today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
                age--;
            }
        }
        return Integer.toString(age);
    }

    private boolean ValidateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int userAge = datePicker.getYear();
        int isAgeValid = currentYear - userAge;

        if(isAgeValid < 12) {
            Toast.makeText(this,"Must be atleast 12 Years of age to continue!",Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(FirebaseAuth.getInstance().getCurrentUser() != null){

            Intent i = new Intent(this,HomeScreen.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);

        }
    }
}


