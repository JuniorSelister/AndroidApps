package com.sanguine.smsapp;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button send;
    EditText phone_Number, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = (Button) findViewById((R.id.Send_msg_Btn));
        phone_Number = (EditText) findViewById(R.id.EditText_PhoneNumber);
        message = (EditText) findViewById(R.id.MainActivity_Message);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String phone_Num = phone_Number.getText().toString();
        String send_msg = message.getText().toString();
        Toast.makeText(this, "SMS enviado!", Toast.LENGTH_LONG).show();

        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phone_Num, null, send_msg, null, null);
        } catch (Exception e) {
            Toast.makeText(this, "SMS não enviado!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

}
