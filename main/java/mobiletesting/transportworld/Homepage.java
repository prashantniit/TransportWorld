package mobiletesting.transportworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    Button button2_sbm;
    Button button5_sbm;
    Button button6_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        onClickButtonListener();
        onClickButtonListener1();
        onClickButtonListene2();
    }
    private void onClickButtonListener(){
        button2_sbm =(Button)findViewById(R.id.button2);

        button2_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.transportworld.Rentacar");
                startActivity(intent);
            }
        });
    }
    private void onClickButtonListener1(){
        button5_sbm =(Button)findViewById(R.id.button4);

        button5_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.transportworld.BookaTruck");
                startActivity(intent);
            }
        });
    }
    private void onClickButtonListene2(){
        button6_sbm =(Button)findViewById(R.id.button3);

        button6_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mobiletesting.transportworld.HireaCab");
                startActivity(intent);
            }
        });
    }
}
