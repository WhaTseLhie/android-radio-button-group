package pardillo.john.jv.sampleradiobuttongroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    private RadioGroup rdoGender;
    private Button btnSubmit;
    private String gender = "Male";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.rdoGender = this.findViewById(R.id.radioGroup);
        this.btnSubmit =this.findViewById(R.id.button);

        this.rdoGender.setOnCheckedChangeListener(this);
        this.btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Gender: " +gender, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton selectedButton = this.findViewById(checkedId);
        gender = selectedButton.getText().toString();
    }
}
