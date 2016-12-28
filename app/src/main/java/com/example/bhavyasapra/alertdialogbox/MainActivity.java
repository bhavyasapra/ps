package com.example.bhavyasapra.alertdialogbox;

import android.content.DialogInterface;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button) findViewById(R.id.button);
        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog=new AlertDialog.Builder(getApplicationContext()).create();
                alertDialog.setTitle("DIALOG BOX");
                alertDialog.setMessage("Do u really wanna make an ANDROID APP xD");
                alertDialog.setButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {

                        Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });


    }
}
