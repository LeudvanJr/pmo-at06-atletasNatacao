package br.edu.fateczl.atletasnatacao;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private static final int ATLETA = 0;
    private static final int ATLETA_JOVEM = 1;
    private static final int ATLETA_SENIOR = 2;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        int tipoAtleta = getIntent().getIntExtra("tipoAtleta",-1);
        if(tipoAtleta >= 0){
            carregarFragment(tipoAtleta);
        }
    }

    private void carregarFragment(int tipoAtleta) {
        if(tipoAtleta == ATLETA){
            fragment = new AtletaFragment();
        }else if(tipoAtleta == ATLETA_JOVEM){
            fragment = new AtletaJovemFragment();
        }else if(tipoAtleta == ATLETA_SENIOR){
            fragment = new AtletaSeniorFragment();
        }else{
            return;
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        Intent intent = new Intent(this, MainActivity.class);

        if(itemId == R.id.itemAtleta){
            intent.putExtra("tipoAtleta",ATLETA);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        if(itemId == R.id.itemAtletaJovem){
            intent.putExtra("tipoAtleta",ATLETA_JOVEM);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        if (itemId == R.id.itemAtletaSenior){
            intent.putExtra("tipoAtleta",ATLETA_SENIOR);
            this.startActivity(intent);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}