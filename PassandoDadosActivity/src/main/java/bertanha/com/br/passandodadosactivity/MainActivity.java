package bertanha.com.br.passandodadosactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.button_enviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                Usuario usuario = new Usuario("Felipe", "bertanhahp@hotmail.com");

                //passar dados
                intent.putExtra("nome", "Felipe");
                intent.putExtra("idade", 30);
                intent.putExtra("objeto", usuario);


                startActivity(intent);
            }
        });
    }
}
