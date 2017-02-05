package css.cis3334.tipcalcparticipation3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBill;
    EditText etNumPeople;
    TextView tvTotalTip;
    TextView tvTipPerPerson;
    CheckBox cbService;
    RadioButton rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBill = (EditText) findViewById(R.id.editTextBill);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewTipPerPerson);
        cbService = (CheckBox) findViewById(R.id.checkBoxService);
    }

    public void onClickButtonCalculate(View view) {
        // Test Comment
        Double bill = Double.parseDouble(etBill.getText().toString());
        int numPeople = 1;
        if (rb1.isChecked()) {
            numPeople = 1;
        }
        if (rb2.isChecked()) {
            numPeople = 2;
        }
        if (rb3.isChecked()) {
            numPeople = 3;
        }
            Double totalTip;
        if (cbService.isChecked()) {
            totalTip = bill * 0.2;
        } else {
            totalTip = bill * 0.1;
        }

        Double tipPerPerson = totalTip / numPeople;

        tvTotalTip.setText("Total Bill: " + etBill.getText());
        tvTipPerPerson.setText("Tip per Person: " + tipPerPerson.toString());
    }
}
