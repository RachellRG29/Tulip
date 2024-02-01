package com.ugb.tulip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class MainActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        //cambiar color barra estado
        cambiarColorBarraEstado(getResources().getColor(R.color.purple1));



    }

    private void cambiarColorBarraEstado(int color) {
        // Verificar si la versión del SDK es Lollipop o superior
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    } //fin cambiar colorbarraestado

}