package com.example.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View constraintParticular;
    private View constraintBussiness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintBussiness = findViewById(R.id.constraintBussiness);
        constraintParticular = findViewById(R.id.constraintParticular);
    }

    /**
     * Metodo que gestiona el evento onCLick en los componentes RadioButton de la interfaz
     *
     * @param view
     */
    public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.rbtBussiness:
                viewParticular(false);
                break;
            case R.id.rbtParticular:
                viewParticular(true);
                break;
        }
    }

    /**
     * Método que pone visible un constraint u otro dependiendo del parámetro que se le pase.
     * @param visible Dice si estará visible el constraint Particular o no.
     *
     */
    private void viewParticular(boolean visible) {
        constraintParticular.setVisibility(visible ? View.VISIBLE : View.GONE);
        constraintBussiness.setVisibility(visible ? View.GONE : View.VISIBLE);
    }
}
