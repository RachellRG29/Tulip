package com.ugb.tulip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        //boton ingresar
        Button btnPrincipal = (Button) findViewById(R.id.btn_ingresar);
        btnPrincipal.setOnClickListener(v -> openPrincipal());


        /*

        <ImageView
        android:id="@+id/bg_fondo_login"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop"
        android:src="@drawable/motivo_tulipv1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"
        app:tint="@color/purple1" />

         */


    }

    //abrir view main activity principal
     public void openPrincipal(){
        Intent intent = new Intent(this, MainActivityPrincipal.class);
        startActivity(intent);

     }


}