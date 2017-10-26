package ua.alex.a01applications09102017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Intent intent = getIntent();

        String valueName = intent.getStringExtra(MainActivity.EXTRA_KEY_NAME);
        String valueSurname = intent.getStringExtra(MainActivity.EXTRA_KEY_SURNAME);
        String valueNumber = intent.getStringExtra(MainActivity.EXTRA_KEY_NUMBER);
        String valueDate = intent.getStringExtra(MainActivity.EXTRA_KEY_DATE);
        String valueEmail = intent.getStringExtra(MainActivity.EXTRA_KEY_EMAIL);
        String valuePostalAdress = intent.getStringExtra(MainActivity.EXTRA_KEY_POSTALADRESS);

        TextView textViewName = (TextView)findViewById(R.id.textViewName);
        TextView textViewSurname = (TextView)findViewById(R.id.textViewSurname);
        TextView textViewNumber = (TextView)findViewById(R.id.textViewNumber);
        TextView textViewDate = (TextView)findViewById(R.id.textViewDate);
        TextView textViewEmail = (TextView)findViewById(R.id.textViewEmail);
        TextView textViewPostalAdress = (TextView)findViewById(R.id.textViewPostalAdress);

        textViewName.setText(valueName);
        textViewSurname.setText(valueSurname);
        textViewNumber.setText(valueNumber);
        textViewDate.setText(valueDate);
        textViewEmail.setText(valueEmail);
        textViewPostalAdress.setText(valuePostalAdress);
    }

    public void onClickButtonBack(View view){
        Intent intent = new Intent(this, MainActivity.class);

        TextView textViewName = (TextView)findViewById(R.id.textViewName);
        TextView textViewSurname = (TextView)findViewById(R.id.textViewSurname);
        TextView textViewNumber = (TextView)findViewById(R.id.textViewNumber);
        TextView textViewDate = (TextView)findViewById(R.id.textViewDate);
        TextView textViewEmail = (TextView)findViewById(R.id.textViewEmail);
        TextView textViewPostalAdress = (TextView)findViewById(R.id.textViewPostalAdress);

        String sName = textViewName.getText().toString();
        String sSurname = textViewSurname.getText().toString();
        String sNumber = textViewNumber.getText().toString();
        String sDate = textViewDate.getText().toString();
        String sEmail = textViewEmail.getText().toString();
        String sPostalAdress = textViewPostalAdress.getText().toString();

        intent.putExtra(MainActivity.EXTRA_KEY_NAME, sName);
        intent.putExtra(MainActivity.EXTRA_KEY_SURNAME, sSurname);
        intent.putExtra(MainActivity.EXTRA_KEY_NUMBER, sNumber);
        intent.putExtra(MainActivity.EXTRA_KEY_DATE, sDate);
        intent.putExtra(MainActivity.EXTRA_KEY_EMAIL, sEmail);
        intent.putExtra(MainActivity.EXTRA_KEY_POSTALADRESS, sPostalAdress);

        startActivity(intent);
    }
}
