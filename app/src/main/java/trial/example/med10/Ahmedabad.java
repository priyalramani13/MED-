package trial.example.med10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class Ahmedabad extends AppCompatActivity {


    Button b;
    ActionBar actionBar;
    RecyclerView mRecyclerView;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmedabad);

        actionBar=getSupportActionBar();
        actionBar.setTitle("All Records");

        mRecyclerView=findViewById(R.id.recyclerView);
        databaseHelper=new DatabaseHelper(this);

        showRecord();

       /*fab=findViewById(R.id.addFabButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
                //startActivity(new Intent(Ahmedabad.this,Bilimora.class));
            }
        });*/
       b=findViewById(R.id.addFabButton);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openActivity();
           }
       });
    }

    public void openActivity() {
        Intent i=new Intent(Ahmedabad.this,AddRecordActivity.class);
        startActivity(i);
    }

    private void showRecord() {

        Adapter adapter = new Adapter(Ahmedabad.this,
                databaseHelper.getAllData(Constants.C_ADD_TIMESTAMP + " DESC"));

        mRecyclerView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        showRecord();

    }
}


