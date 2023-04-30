package vistula.hm.l06_mupindu_60773_mid1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class GameActivityHm extends AppCompatActivity {

    LinearLayout mainLayout;
    int result;
    int randomNum1;
    int randomNum2;
    int randomNum3;
    Button button1;
    Button button2;
    Button button3;
    TextView resultTextView;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_hm);
        readFromIntent();
        random = new Random();
        addButtons();

        resultTextView  = (TextView)findViewById(R.id.textView26);
        button1.setOnClickListener(view -> {
            randomNum1 = Integer.parseInt(button1.getText().toString());
            randomNum2 = Integer.parseInt(button2.getText().toString());
            randomNum3 = Integer.parseInt(button3.getText().toString());
            if(randomNum1>randomNum2&&randomNum1>randomNum3){
                result++;
            }else result--;
            resultTextView.setText("Result = "+result);
            newGame();
        });   button2.setOnClickListener(view -> {
            randomNum1 = Integer.parseInt(button1.getText().toString());
            randomNum2 = Integer.parseInt(button2.getText().toString());
            randomNum3 = Integer.parseInt(button3.getText().toString());
            if(randomNum2>randomNum1&&randomNum2>randomNum3)result++;
            else result--;
            resultTextView.setText("Result = "+result);
            newGame();
        });
        button3.setOnClickListener(view -> {
            randomNum1 = Integer.parseInt(button1.getText().toString());
            randomNum2 = Integer.parseInt(button2.getText().toString());
            randomNum3 = Integer.parseInt(button3.getText().toString());
            if(randomNum3>randomNum2&&randomNum3>randomNum1)result++;
            else result--;
            resultTextView.setText("Result = "+result);
            newGame();
        });
    }
    public void toMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void addButtons(){
        mainLayout = findViewById(R.id.linearLayout);
        randomNum1 = random.nextInt(60733)+1;
        randomNum2 = random.nextInt(60733)+1;
        randomNum3 = random.nextInt(60733)+1;
        button1 = new Button(this);
        button2 = new Button(this);
        button3 = new Button(this);
        button1.setText(Integer.toString(randomNum1));
        button2.setText(Integer.toString(randomNum2));
        button3.setText(Integer.toString(randomNum3));
        mainLayout.addView(button1);
        mainLayout.addView(button2);
        mainLayout.addView(button3);
    }
    private void readFromIntent() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("firstName");
        String surname = intent.getStringExtra("lastName");//receiving empty String
        TextView getResultName,getResultSurname;
        getResultName =(TextView)findViewById(R.id.txtFirstName);
        getResultSurname =(TextView)findViewById(R.id.txtLastName);
        getResultName.setText(name);
        getResultSurname.setText(surname);
    }
    public void newGame(View view){
        button1.setText(Integer.toString(random.nextInt(60773)+1));
        button2.setText(Integer.toString(random.nextInt(60773)+1));
        button3.setText(Integer.toString(random.nextInt(60773)+1));
        result=0;
        resultTextView.setText("Result = "+result);

    }
    public void newGame(){
        button1.setText(Integer.toString(random.nextInt(60773)+1));
        button2.setText(Integer.toString(random.nextInt(60773)+1));
        button3.setText(Integer.toString(random.nextInt(60773)+1));

    }
}