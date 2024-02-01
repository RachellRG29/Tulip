package com.ugb.tulip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import android.os.Build; //barra estado
import android.view.Window; //barra estado
import android.view.WindowManager; //barra estado

public class MainActivity extends AppCompatActivity {
    Handler handler;
    ImageView logotulipv1;
    TextView bienvenidos;
    RelativeLayout splashBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cambiar color barra estado
        cambiarColorBarraEstado(getResources().getColor(R.color.purple1));


        //splash para pasar al nuevo MainActivityPage1
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, MainActivityLogin.class);
                startActivity(intent);
                finish();
            }
        },2020);

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