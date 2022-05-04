package com.example.splashscreen;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

import java.io.IOException;

public class battle extends AppCompatActivity {
    public static boolean shouldPlay = false;
    private SoundPool soundPool;
    MediaPlayer music;
    private int click;
    Button btnLight;
    Button btnHeavy;
    Button btnFight;

    int creatureAttack1;
    int creatureHP1;
    int creatureDefense1;
    int creatureSpeed1;
    int creaturetype1;

    int creatureAttack2;
    int creatureHP2;
    int creatureDefense2;
    int creatureSpeed2;
    int creaturetype2;

    //type effectivity
    int effect1;
    int effect2;

    //who attacks first based on speed
    int turnPriorityP1;
    int turnPriorityP2;

    int tempturnPriorityP1;
    int tempturnPriorityP2;
    //if 0 its light, if 1 its heavy
    int p1attack1;
    int p2attack2;

    //0 is p2's turn to select. 1 is p1's turn to select.
    boolean isturn1;

    int damage;




    ImageView img2 = (ImageView) findViewById(R.id.imagecreature2);
    ImageView img1 = (ImageView) findViewById(R.id.imagecreature1);
    TextView txtnameCC2 = (TextView)findViewById(R.id.txtnameCC2);
    TextView txtnameCC1 = (TextView)findViewById(R.id.txtnameCC1);
    TextView txtcurrentHPCC2 = (TextView)findViewById(R.id.txtcurrentHPCC2);
    TextView txtcurrentHPCC1 = (TextView)findViewById(R.id.txtcurrentHPCC1);
    TextView txttotaltHPCC2 = (TextView)findViewById(R.id.txttotaltHPCC2);
    TextView txttotaltHPCC1 = (TextView)findViewById(R.id.txttotaltHPCC1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle2);
        int creature1 = 7;


        int creature2 = 3;


        if (creature1 == 1) {
            img1.setImageResource(R.drawable.cc1);
            txtnameCC1.setText("River");
            creaturetype1 = 1;
            creatureHP1 = 25;
            creatureAttack1 = 100;
            creatureDefense1 = 25;
            creatureSpeed1 = 150;


        } else if (creature1 == 2) {
            img1.setImageResource(R.drawable.cc2);
            txtnameCC1.setText("Sputnik");
            creaturetype1 = 2;
            creatureHP1 = 340;
            creatureAttack1 = 1;
            creatureDefense1 = 8;
            creatureSpeed1 = 1;


        } else if (creature1 == 3) {
            img1.setImageResource(R.drawable.cc3);
            txtnameCC1.setText("Lion");
            creaturetype1 = 3;
            creatureHP1 = 100;
            creatureAttack1 = 150;
            creatureDefense1 = 50;
            creatureSpeed1 = 50;


        } else if (creature1 == 4) {
            img1.setImageResource(R.drawable.cc4);
            txtnameCC1.setText("Baguette");
            creaturetype1 = 2;
            creatureHP1 = 147;
            creatureAttack1 = 60;
            creatureDefense1 = 103;
            creatureSpeed1 = 40;


        } else if (creature1 == 5) {
            img1.setImageResource(R.drawable.cc5);
            txtnameCC1.setText("Munkey");
            creaturetype1 = 3;
            creatureHP1 = 100;
            creatureAttack1 = 120;
            creatureDefense1 = 60;
            creatureSpeed1 = 70;


        } else if (creature1 == 6) {
            img1.setImageResource(R.drawable.cc6);
            txtnameCC1.setText("Star");
            creaturetype1 = 1;
            creatureHP1 = 60;
            creatureAttack1 = 120;
            creatureDefense1 = 60;
            creatureSpeed1 = 110;


        } else if (creature1 == 7) {
            img1.setImageResource(R.drawable.cc7);
            txtnameCC1.setText("Cat");
            creaturetype1 = 2;
            creatureHP1 = 69;
            creatureAttack1 = 105;
            creatureDefense1 = 82;
            creatureSpeed1 = 94;

        } else if (creature1 == 8) {
            img1.setImageResource(R.drawable.cc8);
            txtnameCC1.setText("Tako");
            creaturetype1 = 3;
            creatureHP1 = 88;
            creatureAttack1 = 101;
            creatureDefense1 = 75;
            creatureSpeed1 = 86;

        } else if (creature1 == 9) {
            img1.setImageResource(R.drawable.cc9);
            txtnameCC1.setText("Dwayne");
            creaturetype1 = 1;
            creatureHP1 = 150;
            creatureAttack1 = 80;
            creatureDefense1 = 100;
            creatureSpeed1 = 20;

        }


        if (creature2 == 1) {
            img2.setImageResource(R.drawable.cc1);
            txtnameCC2.setText("River");
            creaturetype2 = 1;
            creatureHP2 = 25;
            creatureAttack2 = 100;
            creatureDefense2 = 25;
            creatureSpeed2 = 150;


        } else if (creature2 == 2) {
            img2.setImageResource(R.drawable.cc2);
            txtnameCC2.setText("Sputnik");
            creaturetype2 = 2;
            creatureHP2 = 340;
            creatureAttack2 = 1;
            creatureDefense2 = 8;
            creatureSpeed2 = 1;

        } else if (creature2 == 3) {
            img2.setImageResource(R.drawable.cc3);
            txtnameCC2.setText("Lion");
            creaturetype2 = 3;
            creatureHP2 = 100;
            creatureAttack2 = 150;
            creatureDefense2 = 50;
            creatureSpeed2 = 50;

        } else if (creature2 == 4) {
            img2.setImageResource(R.drawable.cc4);
            txtnameCC2.setText("Baguette");
            creaturetype2 = 2;
            creatureHP2 = 147;
            creatureAttack2 = 60;
            creatureDefense2 = 103;
            creatureSpeed2 = 40;

        } else if (creature2 == 5) {
            img2.setImageResource(R.drawable.cc5);
            txtnameCC2.setText("Munkey");
            creaturetype2 = 3;
            creatureHP2 = 100;
            creatureAttack2 = 120;
            creatureDefense2 = 60;
            creatureSpeed2 = 70;

        } else if (creature2 == 6) {
            img2.setImageResource(R.drawable.cc6);
            txtnameCC2.setText("Star");
            creaturetype2 = 1;
            creatureHP2 = 60;
            creatureAttack2 = 120;
            creatureDefense2 = 60;
            creatureSpeed2 = 110;

        } else if (creature2 == 7) {
            img2.setImageResource(R.drawable.cc7);
            txtnameCC2.setText("Cat");
            creaturetype2 = 2;
            creatureHP2 = 69;
            creatureAttack2 = 105;
            creatureDefense2 = 82;
            creatureSpeed2 = 94;

        } else if (creature2 == 8) {
            img2.setImageResource(R.drawable.cc8);
            txtnameCC2.setText("Tako");
            creaturetype2 = 3;
            creatureHP2 = 88;
            creatureAttack2 = 101;
            creatureDefense2 = 75;
            creatureSpeed2 = 86;

        } else if (creature2 == 9) {
            img2.setImageResource(R.drawable.cc9);
            txtnameCC2.setText("Dwayne");
            creaturetype2 = 1;
            creatureHP2 = 150;
            creatureAttack2 = 80;
            creatureDefense2 = 100;
            creatureSpeed2 = 20;

        }

        //initialization of current hp
        txtcurrentHPCC2.setText(creatureHP2);
        txtcurrentHPCC1.setText(creatureHP1);

        //initialization of total hp
        txttotaltHPCC1.setText(creatureHP1);
        txttotaltHPCC2.setText(creatureHP2);

        //setting priority
        if (creatureSpeed1 > creatureSpeed2) {
            turnPriorityP1 = 1;
            turnPriorityP2 = 2;
        } else if (creatureSpeed1 < creatureSpeed2) {
            turnPriorityP1 = 2;
            turnPriorityP2 = 1;
        } else {
            turnPriorityP1 = 1;
            turnPriorityP2 = 1;
        }
        //temp vals to be changed for priority shifts
        tempturnPriorityP1 = turnPriorityP1;
        tempturnPriorityP2 = turnPriorityP2;

        //type effectivity
        if (creaturetype1 == 1 && creaturetype2 == 1) {
            effect1 = 1;
            effect2 = 1;
        } else if (creaturetype1 == 1 && creaturetype2 == 2) {
            effect1 = 4 / 3;
            effect2 = 2 / 3;
        } else if (creaturetype1 == 1 && creaturetype2 == 3) {
            effect1 = 2 / 3;
            effect2 = 4 / 3;
        } else if (creaturetype1 == 2 && creaturetype2 == 1) {
            effect1 = 2 / 3;
            effect2 = 4 / 3;
        } else if (creaturetype1 == 2 && creaturetype2 == 2) {
            effect1 = 1;
            effect2 = 1;
        } else if (creaturetype1 == 2 && creaturetype2 == 1) {
            effect1 = 4 / 3;
            effect2 = 2 / 3;
        } else if (creaturetype1 == 3 && creaturetype2 == 1) {
            effect1 = 4 / 3;
            effect2 = 2 / 3;
        } else if (creaturetype1 == 3 && creaturetype2 == 2) {
            effect1 = 2 / 3;
            effect2 = 4 / 3;
        } else if (creaturetype1 == 3 && creaturetype2 == 3) {
            effect1 = 1;
            effect2 = 1;
        }


        btnHeavy = findViewById(R.id.buttonHeavy);
        btnLight = findViewById(R.id.buttonLight);
        btnFight = findViewById(R.id.buttonFight1);
        btnFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFight.setVisibility(view.INVISIBLE);
                btnHeavy.setVisibility(view.VISIBLE);
                btnLight.setVisibility(view.VISIBLE);
            }
        });

        btnLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFight.setVisibility(view.INVISIBLE);
                btnHeavy.setVisibility(view.INVISIBLE);
                btnLight.setVisibility(view.INVISIBLE);
                if (isturn1) {
                    p1attack1 = 0;
                    isturn1 = false;
                    tempturnPriorityP1--;
                } else {
                    p2attack2 = 0;
                    isturn1 = true;
                    tempturnPriorityP2--;
                }
            }
        });


        btnHeavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFight.setVisibility(view.VISIBLE);
                btnHeavy.setVisibility(view.INVISIBLE);
                btnLight.setVisibility(view.INVISIBLE);
                if (isturn1) {
                    p1attack1 = 1;
                    isturn1 = false;
                } else {
                    p2attack2 = 1;
                    isturn1 = true;
                    //creature1 faster
                    if (tempturnPriorityP1 > tempturnPriorityP2) {
                        damage = 4 / 5 * effect1 * creatureAttack1 + 2 * creatureAttack1 / creatureDefense2;
                        creatureHP2 -= damage;
                        txtcurrentHPCC2.setText(creatureHP2);
                        Toast.makeText(battle.this,
                                ("P1's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();

                        if (creatureHP2 > 0) {
                            damage = 4 / 5 * effect2 * creatureAttack2 + 2 * creatureAttack2 / creatureDefense1;
                            creatureHP1 -= damage;
                            txtcurrentHPCC1.setText(creatureHP1);
                            Toast.makeText(battle.this,
                                    ("P2's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();
                            if (creatureHP1 <= 0) {
                                //sent intent for winner 1
                                Intent intent = new Intent(battle.this, victory.class);
                                intent.putExtra("winner", 2);
                                startActivity(intent);
                            }
                        } else {
                            Intent intent = new Intent(battle.this, victory.class);
                            intent.putExtra("winner", 1);
                            startActivity(intent);
                        }

                        //creature2 faster
                    } else if (tempturnPriorityP1 < tempturnPriorityP2) {
                        damage = 4 / 5 * effect2 * creatureAttack2 + 2 * creatureAttack2 / creatureDefense1;
                        creatureHP1 -= damage;
                        txtcurrentHPCC1.setText(creatureHP1);
                        Toast.makeText(battle.this,
                                ("P2's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();
                        if (creatureHP1 > 0) {
                            damage = 4 / 5 * effect1 * creatureAttack1 + 2 * creatureAttack1 / creatureDefense2;
                            creatureHP2 -= damage;
                            txtcurrentHPCC2.setText(creatureHP2);
                            Toast.makeText(battle.this,
                                    ("P1's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();
                            if (creatureHP2 <= 0) {
                                Intent intent = new Intent(battle.this, victory.class);
                                intent.putExtra("winner", 1);
                                startActivity(intent);
                            }
                        } else {
                            Intent intent = new Intent(battle.this, victory.class);
                            intent.putExtra("winner", 2);
                            startActivity(intent);
                        }


                        //tiebreaker 1 wins
                    } else if (ThreadLocalRandom.current().nextBoolean()) {
                        damage = 4 / 5 * effect1 * creatureAttack1 + 2 * creatureAttack1 / creatureDefense2;
                        creatureHP2 -= damage;
                        txtcurrentHPCC2.setText(creatureHP2);
                        Toast.makeText(battle.this,
                                ("P1's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();

                        if (creatureHP2 > 0) {
                            damage = 4 / 5 * effect2 * creatureAttack2 + 2 * creatureAttack2 / creatureDefense1;
                            creatureHP1 -= damage;
                            txtcurrentHPCC1.setText(creatureHP1);
                            Toast.makeText(battle.this,
                                    ("P2's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();
                            if (creatureHP1 <= 0) {
                                //sent intent for winner 1
                                Intent intent = new Intent(battle.this, victory.class);
                                intent.putExtra("winner", 2);
                                startActivity(intent);
                            }
                        } else {
                            Intent intent = new Intent(battle.this, victory.class);
                            intent.putExtra("winner", 1);
                            startActivity(intent);

                        }
                    }

                    //tiebreaker 2 wins
                    else {
                        damage = 4 / 5 * effect2 * creatureAttack2 + 2 * creatureAttack2 / creatureDefense1;
                        creatureHP1 -= damage;
                        txtcurrentHPCC1.setText(creatureHP1);
                        Toast.makeText(battle.this,
                                ("P2's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();
                        if (creatureHP1 > 0) {
                            damage = 4 / 5 * effect1 * creatureAttack1 + 2 * creatureAttack1 / creatureDefense2;
                            creatureHP2 -= damage;
                            txtcurrentHPCC2.setText(creatureHP2);
                            Toast.makeText(battle.this,
                                    ("P1's creature dealt " + damage + " health points to its opponent"), Toast.LENGTH_LONG).show();
                            if (creatureHP2 <= 0) {
                                Intent intent = new Intent(battle.this, victory.class);
                                intent.putExtra("winner", 1);
                                startActivity(intent);
                            }
                        } else {
                            Intent intent = new Intent(battle.this, victory.class);
                            intent.putExtra("winner", 2);
                            startActivity(intent);

                        }
                    }
                }


            }


        });
    }

    @Override
    protected void onSaveInstanceState (Bundle bundle) {

        super.onSaveInstanceState(bundle);
    }

}
