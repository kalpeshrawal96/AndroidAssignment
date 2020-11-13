package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtName;
    private TextView txtDOB;
    private TextView txtAddress;
    private TextView txtCity;
    private TextView txtPinCode;
    private TextView txtMobile;
    private TextView txtEmail;
    private TextView txtInterest;
    private TextView txtProfile;
    private TextView txtExperience;
    private EditText editName;
    private EditText editDOB;
    private EditText editAddress;
    private EditText editCity;
    private EditText editPinCode;
    private EditText editMobile;
    private EditText editEmail;
    private EditText editInterest;
    private EditText editProfile;
    private EditText editExperience;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        txtDOB = findViewById(R.id.txtDOB);
        txtAddress = findViewById(R.id.txtAddress);
        txtCity = findViewById(R.id.txtCity);
        txtPinCode = findViewById(R.id.txtPinCode);
        txtMobile = findViewById(R.id.txtMobile);
        txtEmail = findViewById(R.id.txtEmail);
        txtInterest = findViewById(R.id.txtInterest);
        txtProfile = findViewById(R.id.txtProfile);
        txtExperience = findViewById(R.id.txtExperience);
        editName = findViewById(R.id.editTxtName);
        editDOB = findViewById(R.id.editDOB);
        editAddress = findViewById(R.id.editAddress);
        editCity = findViewById(R.id.editCity);
        editPinCode = findViewById(R.id.editPinCode);
        editMobile = findViewById(R.id.editMobile);
        editEmail = findViewById(R.id.editEmail);
        editInterest = findViewById(R.id.editInterest);
        editProfile = findViewById(R.id.editProfile);
        editExperience = findViewById(R.id.editExperience);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                txtName.setText("Name: "+ editName.getText().toString());
                txtDOB.setText("Date Of Birth: "+ editDOB.getText().toString());
                txtAddress.setText("Address: "+ editAddress.getText().toString());
                txtCity.setText("City: "+ editCity.getText().toString());
                txtPinCode.setText("Pin Code: "+ editPinCode.getText().toString());
                txtMobile.setText("Mobile No.: "+ editMobile.getText().toString());
                txtEmail.setText("Email ID: "+ editEmail.getText().toString());
                txtInterest.setText("Interest: "+ editInterest.getText().toString());
                txtProfile.setText("Profile: "+ editProfile.getText().toString());
                txtExperience.setText("Experience: "+ editExperience.getText().toString());
                Toast toast =  Toast.makeText(getApplicationContext(),editName.getText().toString() + "'s Registration Successful",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}