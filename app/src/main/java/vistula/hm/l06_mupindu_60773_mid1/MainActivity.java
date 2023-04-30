package vistula.hm.l06_mupindu_60773_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String firstName ="firstName";
    public static final String lastName ="lastName";
    EditText editTextName;
    EditText editTextSurname;
    String name,surname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toImage(View view){
        Intent intent = new Intent(MainActivity.this,ImageActivityHm.class);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextSurname = (EditText) findViewById(R.id.editTextSurname);
        name = editTextName.getText().toString();
        surname = editTextSurname.getText().toString();
        intent.putExtra(firstName,name);
        intent.putExtra(lastName,surname);
        startActivity(intent);//sending empty String
    }
    public void toCalculator(View view){
        Intent intent = new Intent(MainActivity.this,CalculatorActivityHm.class);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextSurname = (EditText) findViewById(R.id.editTextSurname);
        name = editTextName.getText().toString();
        surname = editTextSurname.getText().toString();
        intent.putExtra("firstName",name);
        intent.putExtra("lastName",surname);
        startActivity(intent);
    }
    public void toGame(View view){
        Intent intent = new Intent(MainActivity.this,GameActivityHm.class);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextSurname = (EditText) findViewById(R.id.editTextSurname);
        name = editTextName.getText().toString();
        surname = editTextSurname.getText().toString();
        intent.putExtra("firstName",name);
        intent.putExtra("lastName",surname);
        startActivity(intent);
    }
}