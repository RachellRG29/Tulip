package com.ugb.tulip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivitySign_up extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);

        //valores para usuario y contraseña
        EditText txtUsuarioS= (EditText)findViewById(R.id.txt_usuario_sign);
        EditText txtContrasenaS= (EditText)findViewById(R.id.txt_contrasena_sign);
        EditText txtConfContraS= (EditText)findViewById(R.id.txt_conf_contra_sign);


        //color superior barra de estado
        cambiarColorBarraEstado(getResources().getColor(R.color.purple2));

        //boton ingresar
        Button btnPrincipal = (Button) findViewById(R.id.btn_registrar);

        //txt lbl_signup_aActivitySignup a Registrar en caso de no tener cuenta
        TextView lblIngresar = (TextView) findViewById(R.id.lbl_signup_aActivityLogin);
        lblIngresar.setOnClickListener(v -> openRegistrarlbl());

        //
        if (txtUsuarioS.getText().toString().isEmpty() && txtContrasenaS.getText().toString().isEmpty()
                && txtConfContraS.getText().toString().isEmpty() ){
            txtUsuarioS.setError("Campo requerido");
            txtContrasenaS.setError("Campo requerido");
            txtConfContraS.setError("Campo requerido");

            //btnPrincipal.setOnClickListener(v -> openLogin());
            return;
        } else {
            btnPrincipal.setOnClickListener(v -> openLogin());
        }



       // btnPrincipal.setOnClickListener(v -> openLogin());


    }


    //abrir view main activity Ingresar o Login
   /* public void openIngresar(){
        Intent intent = new Intent(this, MainActivityLogin.class);
        startActivity(intent);



    }*/

    public void onRadioButtonClick(View view){
        RadioGroup radioGroup= findViewById(R.id.rd_groupgenero);
        RadioButton radioButton= findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

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