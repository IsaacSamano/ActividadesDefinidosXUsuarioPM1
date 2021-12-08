package com.example.samanoisaacintents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button enter, regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void registroo (View view){
        /*Intent i = new Intent(this, MainActivity.class);
        startActivity(i);*/
        mStartForResult.launch(new Intent(this,MainActivity.class));
    }

    ActivityResultLauncher<String> mGetContent = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            new ActivityResultCallback<Uri>() {
                @Override
                public void onActivityResult(Uri uri) {
                    // Handle the returned Uri
                    Toast.makeText(getApplicationContext(),
                            uri.toString(), Toast.LENGTH_LONG).show();
                }
            });



    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>(){

                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode()==Activity.RESULT_OK) {
                        Intent i = result.getData();
                        Toast.makeText(LoginActivity.this, i.getParcelableExtra("alumno").toString(), Toast.LENGTH_LONG).show();
                    }
                }
            }
    );




}
