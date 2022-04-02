package com.mohan.practice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {

    public EditText name_signIn,DOB_signIn,schoolORcollegeName_signIn, gradeORdegreeName_signIn,email_signIn,mobileNumber_signIn,password_signIn,passwordConfirm_signIn;
    public Button signInBtn_signIn;
    public CheckBox checkBox_signIn;
    public ProgressBar progressBar_signIn;
    public FirebaseAuth fauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

//        FUNCTION FOR INITIALIZING THE SIGN IN ACTIVITY VIEWSSSS....................

        initThisActivityView();


//        GETTING INSTANCE FOR THE FIREBASE CLASS;...........................

        fauth=FirebaseAuth.getInstance();

//        CHECKING WHETHER THE USER ALREADY REGISTERED IF REGISTERED AUTOMATIC SIGN IN...............

        if (fauth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

//        SETTING ONCLICK LISTENER FOR THE SIGNIN BUTTON...................

        signInBtn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dat_name_signIn=name_signIn.getText().toString().trim();
                String dat_DOB_signIn=DOB_signIn.getText().toString().trim();
                String dat_schoolORcollegeName_signIn=schoolORcollegeName_signIn.getText().toString().trim();
                String dat_gradeORdegreeName_signIn= gradeORdegreeName_signIn.getText().toString().trim();
                String dat_email_signIn=email_signIn.getText().toString().trim();
                String dat_mobileNumber_signIn=mobileNumber_signIn.getText().toString().trim();
                String dat_password_signIn=password_signIn.getText().toString().trim();
                String dat_passwordConfirm_signIn=passwordConfirm_signIn.getText().toString().trim();


//                "IF STATEMENTS" TO CHECK WHETHER THE USER HAS FILLED ALL THE EDIT TEXT BOX

                if(TextUtils.isEmpty(dat_name_signIn)){
                    name_signIn.setError("NAME is required");
                    return;
                }
                if(TextUtils.isEmpty(dat_DOB_signIn)){
                    DOB_signIn.setError("DATE OF BIRTH is required");
                    return;
                }
                if(TextUtils.isEmpty(dat_schoolORcollegeName_signIn)){
                    schoolORcollegeName_signIn.setError("KINDLY FILL IT");
                    return;
                }
                if(TextUtils.isEmpty(dat_gradeORdegreeName_signIn)){
                    gradeORdegreeName_signIn.setError("KINDLY FILL IT");
                    return;
                }
                if(TextUtils.isEmpty(dat_email_signIn)){
                    email_signIn.setError("EMAIL ADDRESS is required");
                    return;
                }
                if(TextUtils.isEmpty(dat_mobileNumber_signIn)){
                    mobileNumber_signIn.setError("MOBILE NUMBER is required");
                    return;
                }
                if(TextUtils.isEmpty(dat_password_signIn)){
                    password_signIn.setError("PASSWORD is required");
                    return;
                }
                if(TextUtils.isEmpty(dat_passwordConfirm_signIn)){
                    passwordConfirm_signIn.setError("FILL IT TO CONFIRM PASSWORD");
                    return;
                }


//                CHECKING FOR INVALID DATA FROM USERS USING IF STATEMENTS...............................

                if (dat_mobileNumber_signIn.length() != 10){

                    mobileNumber_signIn.setError("MOBILE NUMBER is invalid");

                }
                if (dat_password_signIn.length() < 8 || dat_password_signIn.length() > 15 ||
                        dat_passwordConfirm_signIn.length() < 8 || dat_passwordConfirm_signIn.length() > 15){

                    password_signIn.setError("PASSWORD must contain 8 to 15 characters");
                }

                if (!dat_password_signIn.equals(dat_passwordConfirm_signIn)){

                    passwordConfirm_signIn.setError("CONFIRMATION PASSWORD LOOKS DIFFERENT");

                }
                if (!checkBox_signIn.isChecked()){

                    checkBox_signIn.setError("KINDLY AGREE TO THE TERMS AND CONDITIONS");

                }

//                MAKING PROGRESSBAR VISIBLE

                progressBar_signIn.setVisibility(View.VISIBLE);

//                STARTING OTP ACTIVITY AFTER CHECKING ALL THE USER DATA ARE TRUE...................

                Intent signinTootp=new Intent(getApplicationContext(),OtpActivity.class);
                startActivity(signinTootp);










            }
        });
















    }

    private void initThisActivityView() {

        name_signIn = findViewById(R.id.name_signIn);
        DOB_signIn = findViewById(R.id.DOB_signIn);
        schoolORcollegeName_signIn = findViewById(R.id.schoolORcollegeName_signIn);
        gradeORdegreeName_signIn = findViewById(R.id.gradeORdegreeName_signIn);
        email_signIn = findViewById(R.id.email_signIn);
        mobileNumber_signIn = findViewById(R.id.mobileNumber_signIn);
        password_signIn = findViewById(R.id.password_signIn);
        passwordConfirm_signIn = findViewById(R.id.passwordConfirm_signIn);
        signInBtn_signIn = findViewById(R.id.signInBtn_signIn);
        checkBox_signIn = findViewById(R.id.checkBox_signIn);
        progressBar_signIn = findViewById(R.id.progressBar_signIn);


    }



}