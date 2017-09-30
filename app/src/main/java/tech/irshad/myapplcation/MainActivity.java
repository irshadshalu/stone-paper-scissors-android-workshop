package tech.irshad.myapplcation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView cMoveTV, myMoveTV, resultTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cMoveTV = (TextView)findViewById(R.id.computerMove);
        myMoveTV = (TextView)findViewById(R.id.myMove);
        resultTV = (TextView)findViewById(R.id.result);
    }
    public static String result(String player1move, String player2move){
        if (player1move == player2move)
            return "Game is a draw";
        if (player1move == "STONE" && player2move == "PAPER")
            return "Player two wins!";
        else if (player1move == "PAPER" && player2move == "SCISSORS")
            return "Player two wins!";
        else if (player1move == "SCISSORS" && player2move == "STONE")
            return "Player two wins!";
        return "Player one wins";
    }

    public void StonePressed(View v){
        String myMove = "STONE";
        String cMove = computerMove();
        String result = result(myMove, cMove);
        resultTV.setText(result);
        cMoveTV.setText(cMove);
        myMoveTV.setText(myMove);
    }


    public void PaperPressed(View v){
        String myMove = "PAPER";
        String cMove = computerMove();
        String result = result(myMove, cMove);
        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
        resultTV.setText(result);
        cMoveTV.setText(cMove);
        myMoveTV.setText(myMove);
    }

    public void ScissorsPressed(View v){
        String myMove = "SCISSORS";
        String cMove = computerMove();
        String result = result(myMove, cMove);
        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
        resultTV.setText(result);
        cMoveTV.setText(cMove);
        myMoveTV.setText(myMove);
    }

    public String computerMove(){
        double val = Math.random();
        if (val < 0.33)
                return "STONE";
        if (val < 0.66)
                return  "PAPER";
        else
            return "SCISSORS";

    }

}
