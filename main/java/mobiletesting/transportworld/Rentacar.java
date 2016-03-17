package mobiletesting.transportworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Rentacar extends AppCompatActivity {

    Button button4_sbm;
    Button button9_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentacar);
        onClickMessage();
        onClickCallListener();
    }
    public void onClickCallListener(){
        button4_sbm = (Button)findViewById(R.id.button7);
        button4_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:+1 654 662255"));
                startActivity(intent);
            }
        });}
    public void onClickMessage(){
        button9_sbm = (Button)findViewById(R.id.button6);
        button9_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thank You. Your car has been booked", Toast.LENGTH_LONG).show();
            }
        });
    }}

