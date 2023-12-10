package com.example.imvw;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastBtn1(View view){
        Toast toast = Toast.makeText(this, "Seleccionaste el boton 1",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastBtn2(View view){
        Toast toast = Toast.makeText(this, "Seleccionaste el boton 2",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastBtn3(View view){
        Toast toast = Toast.makeText(this, "Seleccionaste el boton 3",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastBtn4(View view){
        Toast toast = Toast.makeText(this, "Seleccionaste el boton 4",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastBtn5(View view){
        Toast toast = Toast.makeText(this, "Seleccionaste el boton 5",Toast.LENGTH_SHORT);
        toast.show();
    }
}