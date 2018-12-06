package com.example.korkor.userinput;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;
   EditText nameField;
    TextView Text;
    private TextView text;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        submitButton = (Button) findViewById(R.id.submit);

        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nameField = (EditText) findViewById(R.id.Name);
                text = (TextView) findViewById(R.id.TextView);
                text.setText(nameField.getText());


                //showToast(name);
                //showMessage(name);

            }
        });

    }

//    public void showMessage(String view) {
//        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
//        myAlert.setMessage("Welcome");
//
//
//        myAlert.show();
//
//    }

   // private void showToast(String text) {
       // Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();

}


