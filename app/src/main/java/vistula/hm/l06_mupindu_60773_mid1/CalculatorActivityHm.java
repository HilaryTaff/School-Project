package vistula.hm.l06_mupindu_60773_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivityHm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_hm);
        readFromIntent();
    }
    public void toMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void readFromIntent() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("firstName");
        String surname = intent.getStringExtra("lastName");//receiving empty String
        TextView getResultName,getResultSurname;
        getResultName =(TextView)findViewById(R.id.txtViewGetName);
        getResultSurname =(TextView)findViewById(R.id.txtViewGetSurname);
        getResultName.setText(name);
        getResultSurname.setText(surname);
    }
    public void Calculate(View view){
        int z1real,z1imaginary,z2real,z2imaginary;
        int resultImaginary=0,resultReal=0;
        String operator;
        EditText z1R = (EditText)findViewById(R.id.editRealZ1);
        EditText z1I = (EditText)findViewById(R.id.editImaginaryZ1);
        EditText z2I = (EditText)findViewById(R.id.editImaginaryZ2);
        EditText z2R = (EditText)findViewById(R.id.editRealZ2);
        EditText resultI = (EditText)findViewById(R.id.editResultImaginary);
        EditText resultR = (EditText)findViewById(R.id.editResultReal);
        Spinner spinnerOperator = (Spinner)findViewById(R.id.spinnerOperator);
        operator = spinnerOperator.getSelectedItem().toString();
        z1imaginary = Integer.parseInt(z1I.getText().toString());
        z2imaginary= Integer.parseInt(z2I.getText().toString());
        z1real = Integer.parseInt(z1R.getText().toString());
        z2real= Integer.parseInt(z2R.getText().toString());
        switch(operator){
            case "+":
                resultReal = z1real+z2real;
                resultImaginary = z1imaginary+z2imaginary;

                    break;
            case "-":
                resultReal = z1real-z2real;
                resultImaginary = z1imaginary-z2imaginary;
//                resultI.setText(resultImaginary);
//                resultR.setText(resultReal);
                break;
            case "*":
                resultReal = (z1real*z2real)-(z1imaginary*z2imaginary);
                resultImaginary =(z1real*z2imaginary)+(z2real*z1imaginary);
//                resultI.setText(resultImaginary);
//                resultR.setText(resultReal);
                break;
        }
        resultI.setText(Integer.toString(resultImaginary));
        resultR.setText(Integer.toString(resultReal));
       // Toast.makeText(getApplicationContext(),resultReal+" "+resultImaginary+"i",Toast.LENGTH_SHORT).show();

    }
}