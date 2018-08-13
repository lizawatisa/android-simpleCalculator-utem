package my.edu.utem.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ansTextView;
    EditText firstEdit, secondEdit;
    double first = 0;
    double second = 0;
    double ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        ansTextView = findViewById(R.id.ans_TextView);
        firstEdit = findViewById(R.id.first_EditView);
        secondEdit = findViewById(R.id.second_EditView);
    }

    public void addPressed(View view) {
        first = Double.parseDouble(firstEdit.getText().toString()) ;
        second = Double.parseDouble(secondEdit.getText().toString());
        ansTextView.setText(""+(first+second));
    }

    public void subPressed(View view) {
        first = Double.parseDouble(firstEdit.getText().toString()) ;
        second = Double.parseDouble(secondEdit.getText().toString());
        ans = first - second;
        ansTextView.setText(ans+"");
    }

    public void divPressed(View view) {
        first = Double.parseDouble(firstEdit.getText().toString()) ;
        second = Double.parseDouble(secondEdit.getText().toString());
        ans = first / second;
        ansTextView.setText(ans+"");
    }

    public void mulPressed(View view) {
        first = Double.parseDouble(firstEdit.getText().toString()) ;
        second = Double.parseDouble(secondEdit.getText().toString());
        ans = first * second;
        ansTextView.setText(ans+"");
    }
}
