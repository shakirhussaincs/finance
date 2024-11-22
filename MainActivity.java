package com.example.financetracker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText dateEditText, timeEditText;
    private ImageButton pickDateButton, pickTimeButton; // Change Button to ImageButton
    private int year, month, day, hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dateEditText = findViewById(R.id.dateEditText);
        timeEditText = findViewById(R.id.timeEditText);
        pickDateButton = findViewById(R.id.pickDateButton);
        pickTimeButton = findViewById(R.id.pickTimeButton);

        final Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);


        pickDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                        (view, year, monthOfYear, dayOfMonth) -> {

                            dateEditText.setText(String.format("%d-%d-%d", dayOfMonth, monthOfYear + 1, year));
                        }, year, month, day);
                datePickerDialog.show();
            }
        });


        pickTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                        (view, hourOfDay, minute) -> {

                            timeEditText.setText(String.format("%02d:%02d", hourOfDay, minute));
                        }, hour, minute, true);
                timePickerDialog.show();
            }
        });
    }
}
