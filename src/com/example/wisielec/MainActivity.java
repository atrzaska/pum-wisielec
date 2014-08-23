package com.example.wisielec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button btnA;
    private Button btnB;
    private Button btnC;
    private Button btnD;
    private Button btnE;
    private Button btnF;
    private Button btnG;
    private Button btnH;
    private Button btnI;
    private Button btnJ;
    private Button btnK;
    private Button btnL;
    private Button btnM;
    private Button btnN;
    private Button btnO;
    private Button btnP;
    private Button btnQ;
    private Button btnR;
    private Button btnS;
    private Button btnT;
    private Button btnU;
    private Button btnV;
    private Button btnW;
    private Button btnX;
    private Button btnY;
    private Button btnZ;
    private ImageView imgView;
    private TextView txtHaslo;
    private TextView txtResult;

    private HangmanGame game;
    private ButtonHandler buttonHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
        btnF = (Button) findViewById(R.id.btnF);
        btnG = (Button) findViewById(R.id.btnG);
        btnH = (Button) findViewById(R.id.btnH);
        btnI = (Button) findViewById(R.id.btnI);
        btnJ = (Button) findViewById(R.id.btnJ);
        btnK = (Button) findViewById(R.id.btnK);
        btnL = (Button) findViewById(R.id.btnL);
        btnM = (Button) findViewById(R.id.btnM);
        btnN = (Button) findViewById(R.id.btnN);
        btnO = (Button) findViewById(R.id.btnO);
        btnP = (Button) findViewById(R.id.btnP);
        btnQ = (Button) findViewById(R.id.btnQ);
        btnR = (Button) findViewById(R.id.btnR);
        btnS = (Button) findViewById(R.id.btnS);
        btnT = (Button) findViewById(R.id.btnT);
        btnU = (Button) findViewById(R.id.btnU);
        btnV = (Button) findViewById(R.id.btnV);
        btnW = (Button) findViewById(R.id.btnW);
        btnX = (Button) findViewById(R.id.btnX);
        btnY = (Button) findViewById(R.id.btnY);
        btnZ = (Button) findViewById(R.id.btnZ);

        imgView = (ImageView) findViewById(R.id.imgView);
        txtHaslo = (TextView) findViewById(R.id.txtHaslo);
        txtResult = (TextView) findViewById(R.id.txtResult);

        buttonHandler = new ButtonHandler(this);

        btnA.setOnClickListener(buttonHandler);
        btnB.setOnClickListener(buttonHandler);
        btnC.setOnClickListener(buttonHandler);
        btnD.setOnClickListener(buttonHandler);
        btnE.setOnClickListener(buttonHandler);
        btnF.setOnClickListener(buttonHandler);
        btnG.setOnClickListener(buttonHandler);
        btnH.setOnClickListener(buttonHandler);
        btnI.setOnClickListener(buttonHandler);
        btnJ.setOnClickListener(buttonHandler);
        btnK.setOnClickListener(buttonHandler);
        btnL.setOnClickListener(buttonHandler);
        btnM.setOnClickListener(buttonHandler);
        btnN.setOnClickListener(buttonHandler);
        btnO.setOnClickListener(buttonHandler);
        btnP.setOnClickListener(buttonHandler);
        btnQ.setOnClickListener(buttonHandler);
        btnR.setOnClickListener(buttonHandler);
        btnS.setOnClickListener(buttonHandler);
        btnT.setOnClickListener(buttonHandler);
        btnU.setOnClickListener(buttonHandler);
        btnV.setOnClickListener(buttonHandler);
        btnW.setOnClickListener(buttonHandler);
        btnX.setOnClickListener(buttonHandler);
        btnY.setOnClickListener(buttonHandler);
        btnZ.setOnClickListener(buttonHandler);

        resetGame();
        updateScreen();
    }

    private void resetGame() {
        this.game = new HangmanGame();

        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnI.setEnabled(true);
        btnJ.setEnabled(true);
        btnK.setEnabled(true);
        btnL.setEnabled(true);
        btnM.setEnabled(true);
        btnN.setEnabled(true);
        btnO.setEnabled(true);
        btnP.setEnabled(true);
        btnQ.setEnabled(true);
        btnR.setEnabled(true);
        btnS.setEnabled(true);
        btnT.setEnabled(true);
        btnU.setEnabled(true);
        btnW.setEnabled(true);
        btnX.setEnabled(true);
        btnY.setEnabled(true);
        btnZ.setEnabled(true);
    }

    public HangmanGame getGame() {
        return game;
    }

    public void updateScreen() {
        this.txtHaslo.setText(game.getGuessedLetters());

        switch (game.numLives()) {
        case 11:
            imgView.setImageResource(R.drawable.img0);
            break;
        case 10:
            imgView.setImageResource(R.drawable.img1);
            break;
        case 9:
            imgView.setImageResource(R.drawable.img2);
            break;
        case 8:
            imgView.setImageResource(R.drawable.img3);
            break;
        case 7:
            imgView.setImageResource(R.drawable.img4);
            break;
        case 6:
            imgView.setImageResource(R.drawable.img5);
            break;
        case 5:
            imgView.setImageResource(R.drawable.img6);
            break;
        case 4:
            imgView.setImageResource(R.drawable.img7);
            break;
        case 3:
            imgView.setImageResource(R.drawable.img8);
            break;
        case 2:
            imgView.setImageResource(R.drawable.img9);
            break;
        case 1:
            imgView.setImageResource(R.drawable.img10);
            break;
        case 0:
            imgView.setImageResource(R.drawable.img11);
            break;
        }

        if(game.isOver()) {
            if(game.isWon()) {
                txtResult.setText("Wygra³eœ");
            } else {
                txtResult.setText("Przegra³eœ");
            }
        }
    }
}
