package mobiletesting.transportworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HireaCab extends AppCompatActivity {

    Button button7_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hire_a_cab);
        button7_sbm= (Button)findViewById(R.id.button8);
        button7_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thank you for the details, we will contact you soon!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
