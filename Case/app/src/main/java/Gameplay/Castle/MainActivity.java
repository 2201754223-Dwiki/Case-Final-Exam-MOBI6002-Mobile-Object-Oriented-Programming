package Gameplay.Castle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Heroes_ BoostSkill = new Heroes_();
Army_ BoostAttack = new Army_();
Army_Infantry InfantryAttack = new Army_Infantry();
Army_Cavalry cavalryAttack = new Army_Cavalry();
    int PlayerOne;
    int PlayerTwo;
    int Winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerOne > PlayerTwo) {
                    Toast.makeText(getApplicationContext(), "Player 1 Win", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Player 2 Win", Toast.LENGTH_LONG).show();
                }
            }
        });

        PlayerOne = (InfantryAttack.Infantry_Troops+BoostAttack.Army_Attack)+BoostSkill.Heroes_Skill_Cavalry;
        PlayerTwo = (cavalryAttack.Cavalry_Troops+BoostAttack.Army_Attack)+BoostSkill.Heroes_Skill_Infantry;
        Winner = PlayerOne - PlayerTwo;
    }
}