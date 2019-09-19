package hridoy.aiz.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnTap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTap = findViewById(R.id.btnTap);

        btnTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You are toasted",Toast.LENGTH_SHORT).show();
                showTost("You are toasted");
            }
        });
    }

    public void showTost(String msg){

        View toastView = getLayoutInflater().inflate(R.layout.c_toast, (ViewGroup) findViewById(R.id.lin_lay_c_toast));
        TextView tvToast = (TextView) toastView.findViewById(R.id.tvToast);
        tvToast.setText(msg);

        Toast toast = new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastView);
        toast.setGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL,0,0);
        toast.show();
    }
}
