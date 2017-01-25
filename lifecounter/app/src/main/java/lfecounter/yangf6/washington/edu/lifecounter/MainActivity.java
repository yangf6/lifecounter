package lfecounter.yangf6.washington.edu.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static int person1 = 0;
    public static int person2 = 0;
    public static int person3 = 0;
    public static int person4 = 0;
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button b10;
    public Button b11;
    public Button b12;
    public Button b13;
    public Button b14;
    public Button b15;
    public Button b16;
    public TextView p1;
    public TextView p2;
    public TextView p3;
    public TextView p4;
    public TextView output;
    public static String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = (TextView) findViewById(R.id.p1);
        p2 = (TextView) findViewById(R.id.p2);
        p3 = (TextView) findViewById(R.id.p3);
        p4 = (TextView) findViewById(R.id.p4);
        output = (TextView) findViewById(R.id.output);
        p1.setText("player 1 (" + person1 + ")");
        p2.setText("player 2 (" + person2 + ")");
        p3.setText("player 3 (" + person3 + ")");
        p4.setText("player 4 (" + person4 + ")");
        output.setText(str);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);

        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);

        b1.setOnClickListener(new MyListener(5,p1,1));
        b2.setOnClickListener(new MyListener(-5,p1,1));
        b3.setOnClickListener(new MyListener(-1,p1,1));
        b4.setOnClickListener(new MyListener(1,p1,1));
        b5.setOnClickListener(new MyListener(5,p2,2));
        b6.setOnClickListener(new MyListener(-5,p2,2));
        b7.setOnClickListener(new MyListener(-1,p2,2));
        b8.setOnClickListener(new MyListener(1,p2,2));
        b9.setOnClickListener(new MyListener(5,p3,3));
        b10.setOnClickListener(new MyListener(-5,p3,3));
        b11.setOnClickListener(new MyListener(-1,p3,3));
        b12.setOnClickListener(new MyListener(1,p3,3));
        b13.setOnClickListener(new MyListener(5,p4,4));
        b14.setOnClickListener(new MyListener(-5,p4,4));
        b15.setOnClickListener(new MyListener(-1,p4,4));
        b16.setOnClickListener(new MyListener(1,p4,4));


    }

    public class MyListener implements View.OnClickListener{
        public int num;
        public TextView v;
        public int player;

        public MyListener(int num, TextView v, int player){
            this.v = v;
            this.num = num;
            this.player = player;
        }

        @Override
        public void onClick(View view){
            if(player == 1){
                person1 = person1 + num;
                if(person1 <= 0){
                    str = "Player 1 LOSES!";
                    output.setText(str);
                }
                v.setText("player 1 (" + person1 + ")");
            }else if(player == 2){
                person2 = person2 + num;
                if(person2 <= 0){
                    str = "Player 2 LOSES!";
                    output.setText(str);
                }
                v.setText("player 2 (" + person2 + ")");
            }else if(player == 3){
                person3 = person3 + num;
                if(person3 <= 0){
                    str = "Player 3 LOSES!";
                    output.setText(str);
                }
                v.setText("player 3 (" + person3 + ")");
            }else{
                person4 = person4 + num;
                if(person4 <= 0){
                    str = "Player 4 LOSES!";
                    output.setText(str);
                }
                v.setText("player 4 (" + person4 + ")");
            }
        }

    }
}
