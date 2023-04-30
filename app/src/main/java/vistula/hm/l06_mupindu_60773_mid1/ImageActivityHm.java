package vistula.hm.l06_mupindu_60773_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ImageActivityHm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_hm);
        readFromIntent();
    }
    private void readFromIntent() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("firstName");
        String surname = intent.getStringExtra("lastName");//receiving empty String
        TextView getResultName,getResultSurname;
        getResultName =(TextView)findViewById(R.id.txtResultName);
        getResultSurname =(TextView)findViewById(R.id.txtResultSurname);
        getResultName.setText(name);
        getResultSurname.setText(surname);
    }

    public void toMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}