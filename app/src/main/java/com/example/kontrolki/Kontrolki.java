package com.example.kontrolki;

/**
 * Created by Kamila on 03.12.2016.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Kontrolki extends Activity implements OnClickListener{
    private RadioButton rb1, rb2;
    private EditText et1, et2;
    private DatePicker dp;
    private CheckBox chk1, chk2, chk3;
    private Button btn1, btn2;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        rb1 = (RadioButton) this.findViewById(R.id.radio0);
        rb2 = (RadioButton) this.findViewById(R.id.radio1);
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        et1 = (EditText) this.findViewById(R.id.editText1);
        et2 = (EditText) this.findViewById(R.id.editText2);
        dp = (DatePicker) this.findViewById(R.id.datePicker1);
        chk1 = (CheckBox) this.findViewById(R.id.checkBox1);
        chk2 = (CheckBox) this.findViewById(R.id.checkBox2);
        chk3 = (CheckBox) this.findViewById(R.id.checkBox3);
        chk1.setOnClickListener(this);
        chk2.setOnClickListener(this);
        chk3.setOnClickListener(this);
        btn1 = (Button) this.findViewById(R.id.button1);
        btn2 = (Button) this.findViewById(R.id.button2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button1: wczytaj(); break;
            case R.id.button2: this.finish(); break;
        }
    }

    private void wczytaj() {
        CharSequence imie = (CharSequence) et1.getText();
        CharSequence nazwisko = (CharSequence) et2.getText();
        int r = dp.getYear();
        int m = dp.getMonth()+1; // miesiące liczone od 0
        int d = dp.getDayOfMonth();
        String s = (rb1.isChecked() ? "Pan " : "Pani ") + imie.toString() + ' ' +
                nazwisko.toString();
        s = s + "\nurodz. " + r + '-' + m + '-' + d + "\nzainteresowania: ";
        if (chk1.isChecked()) s = s + chk1.getText().toString() + ", ";
        if (chk2.isChecked()) s = s + " " + chk2.getText().toString() + ", ";
        if (chk3.isChecked()) s = s + chk3.getText().toString();
        Toast toast = Toast.makeText(com.example.kontrolki.Kontrolki.this, s, Toast.LENGTH_LONG);
        toast.show();
    }
}
