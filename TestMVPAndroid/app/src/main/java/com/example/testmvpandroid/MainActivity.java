package com.example.testmvpandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testmvpandroid.LoginHandle.PresenterLogicLoginHandle;
import com.example.testmvpandroid.LoginHandle.ViewLoginHandle;

public class MainActivity extends AppCompatActivity implements ViewLoginHandle, View.OnClickListener {

    Button btnLogin;
    EditText etLoginName, etPassword;
    PresenterLogicLoginHandle presenterLogicLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        etLoginName = (EditText) findViewById(R.id.etLoginName);
        etPassword = (EditText) findViewById(R.id.etPassWord);

        presenterLogicLogin = new PresenterLogicLoginHandle(this);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void HandleSuccessLogin() {
        Toast.makeText(MainActivity.this, "Login succes", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void HanldeFaileLogin() {
        Toast.makeText(MainActivity.this, "Login faile", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        String loginName, password;
        loginName = etLoginName.getText().toString();
        password = etPassword.getText().toString();

        presenterLogicLogin.CheckLogin(loginName, password);
    }
}
