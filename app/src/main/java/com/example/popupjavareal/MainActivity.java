package com.example.popupjavareal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnPopup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPopup = findViewById(R.id.btnPopup);
        registerForContextMenu(btnPopup);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_item,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_1:
                Toast.makeText(this,"Item 1", Toast.LENGTH_SHORT).show();
            case R.id.item_2:
                Toast.makeText(this,"Item 2", Toast.LENGTH_SHORT).show();
            case R.id.item_3:
                Toast.makeText(this,"Item 3", Toast.LENGTH_SHORT).show();
            case R.id.item_4:
                Toast.makeText(this,"Item 4", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}