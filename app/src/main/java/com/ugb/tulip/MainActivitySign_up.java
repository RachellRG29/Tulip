package com.ugb.tulip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class MainActivitySign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);

        //color superior barra de estado
        cambiarColorBarraEstado(getResources().getColor(R.color.purple2));

        //boton ingresar
        Button btnPrincipal = (Button) findViewById(R.id.btn_registrar);
        btnPrincipal.setOnClickListener(v -> openLogin());

        //txt lbl_signup_aActivitySignup a Registrar en caso de no tener cuenta
        TextView lblIngresar = (TextView) findViewById(R.id.lbl_signup_aActivityLogin);
        lblIngresar.setOnClickListener(v -> openRegistrarlbl());
    }


    //abrir view main activity Ingresar o Login
   /* public void openIngresar(){
        Intent intent = new Intent(this, MainActivityLogin.class);
        startActivity(intent);



    }*/

    private void cambiarColorBarraEstado(int color) {
        // Verificar si la versión del SDK es Lollipop o superior
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    } //fin cambiar colorbarraestado


    //abrir view main activity principal
    public void openLogin(){
        Intent intent = new Intent(this, MainActivityPrincipal.class);
        startActivity(intent);

    }

    //abrir view main activity Ingresar o Login
    public void openRegistrarlbl(){
        Intent intent = new Intent(this, MainActivityLogin.class);
        startActivity(intent);

    }
}