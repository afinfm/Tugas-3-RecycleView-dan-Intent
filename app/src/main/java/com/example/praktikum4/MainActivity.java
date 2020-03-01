package com.example.praktikum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvPahlawan;
    private ArrayList<pahlawanModel> listPahlawan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPahlawan = findViewById(R.id.rv_target);
        rvPahlawan.setHasFixedSize(true);
        listPahlawan.addAll(pahlawanData.getHeroList());

        showRecyclerList();
    }

    private void showRecyclerList()  {
        rvPahlawan.setLayoutManager(new LinearLayoutManager(this));
        pahlawanAdapter pahlawanAdapter = new pahlawanAdapter(this);
        pahlawanAdapter.setPahlawanModels(listPahlawan);
        rvPahlawan.setAdapter(pahlawanAdapter);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.itemBtLihat:

                Intent detailPahlawan = new Intent(MainActivity.this, DetailPahlawan.class);
                startActivity(detailPahlawan);

                break;

            case R.id.itemBtShare:


                break;

            default:
                break;
        }
    }
}
