package ua.alex.a01applications09102017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_KEY_NAME = "EXTRA_KEY_NAME";
    public static final String EXTRA_KEY_SURNAME = "EXTRA_KEY_SURNAME";
    public static final String EXTRA_KEY_NUMBER = "EXTRA_KEY_NUMBER";
    public static final String EXTRA_KEY_DATE = "EXTRA_KEY_DATE";
    public static final String EXTRA_KEY_EMAIL = "EXTRA_KEY_EMAIL";
    public static final String EXTRA_KEY_POSTALADRESS = "EXTRA_KEY_POSTALADRESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        EditText editTextName = (EditText)findViewById(R.id.editTextName);
        EditText editTextSurname = (EditText)findViewById(R.id.editTextSurname);
        EditText editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        EditText editTextDate = (EditText)findViewById(R.id.editTextDate);
        EditText editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        EditText editTextPostalAdress = (EditText)findViewById(R.id.editTextPostalAdress);

        String valueName = intent.getStringExtra(MainActivity.EXTRA_KEY_NAME);
        String valueSurname = intent.getStringExtra(MainActivity.EXTRA_KEY_SURNAME);
        String valueNumber = intent.getStringExtra(MainActivity.EXTRA_KEY_NUMBER);
        String valueDate = intent.getStringExtra(MainActivity.EXTRA_KEY_DATE);
        String valueEmail = intent.getStringExtra(MainActivity.EXTRA_KEY_EMAIL);
        String valuePostalAdress = intent.getStringExtra(MainActivity.EXTRA_KEY_POSTALADRESS);

        editTextName.setText(valueName);
        editTextSurname.setText(valueSurname);
        editTextNumber.setText(valueNumber);
        editTextDate.setText(valueDate);
        editTextEmail.setText(valueEmail);
        editTextPostalAdress.setText(valuePostalAdress);
    }

    public void onClickButtonClear(View view){
        EditText editTextName = (EditText)findViewById(R.id.editTextName);
        EditText editTextSurname = (EditText)findViewById(R.id.editTextSurname);
        EditText editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        EditText editTextDate = (EditText)findViewById(R.id.editTextDate);
        EditText editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        EditText editTextPostalAdress = (EditText)findViewById(R.id.editTextPostalAdress);

        editTextName.setText("");
        editTextSurname.setText("");
        editTextNumber.setText("");
        editTextDate.setText("");
        editTextEmail.setText("");
        editTextPostalAdress.setText("");
    }

    public void onClickButtonSave(View view) {
        Intent intent = new Intent(this, ShareActivity.class);
        EditText editTextName = (EditText)findViewById(R.id.editTextName);
        EditText editTextSurname = (EditText)findViewById(R.id.editTextSurname);
        EditText editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        EditText editTextDate = (EditText)findViewById(R.id.editTextDate);
        EditText editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        EditText editTextPostalAdress = (EditText)findViewById(R.id.editTextPostalAdress);

        String sName = editTextName.getText().toString();
        String sSurname = editTextSurname.getText().toString();
        String sNumber = editTextNumber.getText().toString();
        String sDate = editTextDate.getText().toString();
        String sEmail = editTextEmail.getText().toString();
        String sPostalAdress = editTextPostalAdress.getText().toString();

        intent.putExtra(EXTRA_KEY_NAME, sName);
        intent.putExtra(EXTRA_KEY_SURNAME, sSurname);
        intent.putExtra(EXTRA_KEY_NUMBER, sNumber);
        intent.putExtra(EXTRA_KEY_DATE, sDate);
        intent.putExtra(EXTRA_KEY_EMAIL, sEmail);
        intent.putExtra(EXTRA_KEY_POSTALADRESS, sPostalAdress);

        startActivity(intent);
    }
}
