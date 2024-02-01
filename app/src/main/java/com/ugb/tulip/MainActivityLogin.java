package com.ugb.tulip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class MainActivityLogin extends AppCompatActivity {

    TextView login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        //cambiar color barra de estado
        cambiarColorBarraEstado(getResources().getColor(R.color.purple1));

        //boton ingresar
        Button btnPrincipal = (Button) findViewById(R.id.btn_ingresar);
        btnPrincipal.setOnClickListener(v -> openPrincipal());

        //txt lbl_signup_aActivitySignup a Registrar en caso de no tener cuenta
        TextView lblRegistrar = (TextView) findViewById(R.id.lbl_login_aActivitySignup);
        lblRegistrar.setOnClickListener(v -> openRegistrarlbl());


    }

    private void cambiarColorBarraEstado(int color) {
        // Verificar si la versión del SDK es Lollipop o superior
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    } //fin cambiar colorbarraestado

    //abrir view main activity principal
     public void openPrincipal(){
        Intent intent = new Intent(this, MainActivityPrincipal.class);
        startActivity(intent);

     }

     //abrir view main activity Registrar o Sign up
    public void openRegistrarlbl(){
        Intent intent = new Intent(this, MainActivitySign_up.class);
        startActivity(intent);

    }



}