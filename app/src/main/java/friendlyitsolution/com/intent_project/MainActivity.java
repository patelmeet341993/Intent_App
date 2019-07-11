package friendlyitsolution.com.intent_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{


    Button btnnext;
    EditText etname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnext=findViewById(R.id.btnnext);
        etname=findViewById(R.id.etname);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=etname.getText().toString();

                Intent i=new Intent(getApplicationContext(),Main2Activity.class);

                i.putExtra("username",name);


                startActivity(i);
                finish();



            }
        });

    }
}
