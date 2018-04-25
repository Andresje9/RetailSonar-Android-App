package be.retailsonar.retailsonar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

public class TakenActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MijnAdapterTaken mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] taken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.takenactivity);

        taken = ((GlobaleVariabelen) getApplication()).getTaken();

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_taken);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MijnAdapterTaken(taken);
        mRecyclerView.setAdapter(mAdapter);
        System.out.println("takenactivity----------------------------------");

    }
}