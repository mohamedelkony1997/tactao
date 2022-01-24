package com.example.tactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,player1,player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(TextView)findViewById(R.id.label1);
        l2=(TextView)findViewById(R.id.label2);
        l3=(TextView)findViewById(R.id.label3);
        l4=(TextView)findViewById(R.id.label4);
        l5=(TextView)findViewById(R.id.label5);
        l6=(TextView)findViewById(R.id.label6);
        l7=(TextView)findViewById(R.id.label7);
        l8=(TextView)findViewById(R.id.label8);
        l9=(TextView)findViewById(R.id.label9);
        player1=(TextView)findViewById(R.id.player1scoretext);
        player2=(TextView)findViewById(R.id.player2scoretext);

    }
    int counter=0;
    int winnerx=0;
    int winnero=0;
    public void onplayerclick(View view) {
        TextView cell=((TextView)view);
        if(!cell.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "it's fill", Toast.LENGTH_SHORT).show();
            return;
        }
        if(counter%2==0){
            cell.setText("X");
        }else{
            cell.setText("O");
        }
        counter++;

        playtowin();
    }


    public void onclearclick(View view) {

        if(!l1.getText().toString().equals("")||!l2.getText().toString().equals("")||!l3.getText().toString().equals("")||!l4.getText().toString().equals("")||!l5.getText().toString().equals("")||!l6.getText().toString().equals("")||!l7.getText().toString().equals("")||!l8.getText().toString().equals("")||!l9.getText().toString().equals("")) {
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("");
            l7.setText("");
            l8.setText("");
            l9.setText("");
        }else{
            Toast.makeText(MainActivity.this, "empty", Toast.LENGTH_SHORT).show();
        }

    }

    public void playtowin( ){

 if(((l1.getText().toString().equals("X"))&&(l2.getText().toString().equals("X"))&&(l3.getText().toString().equals("X")))||((l4.getText().toString().equals("X"))&&(l5.getText().toString().equals("X"))&&(l6.getText().toString().equals("X")))||
         ((l7.getText().toString().equals("X"))&&(l8.getText().toString().equals("X"))&&(l9.getText().toString().equals("X")))||((l1.getText().toString().equals("X"))&&(l4.getText().toString().equals("X"))&&(l7.getText().toString().equals("X")))||
         ((l2.getText().toString().equals("X"))&&(l5.getText().toString().equals("X"))&&(l8.getText().toString().equals("X")))||((l3.getText().toString().equals("X"))&&(l6.getText().toString().equals("X"))&&(l9.getText().toString().equals("X")))||
         ((l1.getText().toString().equals("X"))&&(l5.getText().toString().equals("X"))&&(l9.getText().toString().equals("X")))||((l3.getText().toString().equals("X"))&&(l5.getText().toString().equals("X"))&&(l7.getText().toString().equals("X")))
 ){
   winnerx++;
   player1.setText(winnerx +"");
}else if(((l1.getText().toString().equals("O"))&&(l2.getText().toString().equals("O"))&&(l3.getText().toString().equals("O")))||((l4.getText().toString().equals("O"))&&(l5.getText().toString().equals("O"))&&(l6.getText().toString().equals("O")))||
   ((l7.getText().toString().equals("O"))&&(l8.getText().toString().equals("O"))&&(l9.getText().toString().equals("O")))||((l1.getText().toString().equals("O"))&&(l4.getText().toString().equals("O"))&&(l7.getText().toString().equals("O")))||
   ((l2.getText().toString().equals("O"))&&(l5.getText().toString().equals("O"))&&(l8.getText().toString().equals("O")))||((l3.getText().toString().equals("O"))&&(l6.getText().toString().equals("O"))&&(l9.getText().toString().equals("O")))||
   ((l1.getText().toString().equals("O"))&&(l5.getText().toString().equals("O"))&&(l9.getText().toString().equals("O")))||((l3.getText().toString().equals("O"))&&(l5.getText().toString().equals("O"))&&(l7.getText().toString().equals("O")))
 ) {
     winnero++;
     player2.setText(winnero +"");
 }
 }

    }
