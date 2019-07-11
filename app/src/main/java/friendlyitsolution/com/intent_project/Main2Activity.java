package friendlyitsolution.com.intent_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    TextView tvname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvname=findViewById(R.id.tvname);

        Intent i=getIntent();
        String name=i.getStringExtra("username");
        tvname.setText(name);

    }
}
