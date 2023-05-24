package br.ufmg.coltec.e04_actionbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar acoes = this.getSupportActionBar();
        acoes.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        MenuItem shareItem = menu.findItem(R.id.action_share);
        ShareActionProvider shareProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);

        MenuItem searchItem = menu.findItem(R.id.action_search);

        SearchView searchBox = (SearchView) searchItem.getActionView();
        searchBox.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Toast.makeText(SecondActivity.this, "Buscar o texto:\n" + s, Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        // criar intent que será exibida pelo provider
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT, "Texto para Compartilhar");

        // exibe a intent
        shareProvider.setShareIntent(intent);//*/

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // recupera id do item selecionado
        int id = item.getItemId();
        // verifica qual é o botão selecionado com base no id
        switch (id) {
            case R.id.action_search:
                Toast.makeText(this, "Clicou no search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_refresh:
                Toast.makeText(this, "Clicou no refresh", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(this, "Clicou no settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_about:

                AlertDialog.Builder about = new AlertDialog.Builder(SecondActivity.this);

                about.setMessage("Desenvolvedor: Raphael Menezes\nVersão: 0.0.10");
                about.setNeutralButton("OK", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i){

                            }
                        });

                AlertDialog dialog = about.create();
                dialog.show();

                return true;
            case R.id.action_exit:
                this.finishAffinity();
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}