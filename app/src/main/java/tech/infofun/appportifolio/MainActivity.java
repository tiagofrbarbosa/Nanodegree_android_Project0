package tech.infofun.appportifolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by admin on 14/03/2017.
 */

public class MainActivity extends Activity{
    private Button MyButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portifolio);
    }

    public void click_project(View view){
        MyButton = (Button) findViewById(view.getId());
        String MyText = "Este botão irá iniciar o meu projeto " + MyButton.getText().toString();
        Toast toast = Toast.makeText(this,MyText,Toast.LENGTH_SHORT);
        toast.show();
    }
}
