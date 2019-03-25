package hkcc.ccn2279.appbasics1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnN1, btnN2, btnN3, btnN4, btnN5, btnN6;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnN1 = (Button) findViewById(R.id.btnN1);
        btnN2 = (Button) findViewById(R.id.btnN2);
        btnN3 = (Button) findViewById(R.id.btnN3);
        btnN4 = (Button) findViewById(R.id.btnN4);
        btnN5 = (Button) findViewById(R.id.btnN5);
        btnN6 = (Button) findViewById(R.id.btnN6);
        btnN1.setOnClickListener(listener);
        btnN2.setOnClickListener(listener);
        btnN3.setOnClickListener(listener);
        btnN4.setOnClickListener(listener);
        btnN5.setOnClickListener(listener);
        btnN6.setOnClickListener(listener);
    }

    private Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnN1:
                    str = btnN1.getText().toString();
                    display(str);
                    break;
                case R.id.btnN2:
                    str = btnN2.getText().toString();
                    display(str);
                    break;
                case R.id.btnN3:
                    str = btnN3.getText().toString();
                    display(str);
                    break;
                case R.id.btnN4:
                    str = btnN4.getText().toString();
                    display(str);
                    break;
                case R.id.btnN5:
                    str = btnN5.getText().toString();
                    display(str);
                    break;
                case R.id.btnN6:
                    str = btnN6.getText().toString();
                    display(str);
                    break;
            }
        }
    };

    private void display(String s) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Dialog Box")
                .setIcon(R.drawable.ic_launcher)
                .setMessage("You have pressed " + str + "!\nPlease press Okay to close this dialog")
                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                    }
                })
                .show();

        Toast toast = Toast.makeText(getApplicationContext(),
                "You have pressed " + str + "!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}