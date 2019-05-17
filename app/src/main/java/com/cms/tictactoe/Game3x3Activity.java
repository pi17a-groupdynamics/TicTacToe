package com.cms.tictactoe;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Game3x3Activity extends AppCompatActivity {

    public int turn;
    public int[][] cell = new int[3][3];
    public boolean end = false;
    public int computer_difficulty;
    public int mark_type;
    public int player_type;
    public int[] bot_choice = new int[2];

    Button mButton_0_0;
    Button mButton_0_1;
    Button mButton_0_2;
    Button mButton_1_0;
    Button mButton_1_1;
    Button mButton_1_2;
    Button mButton_2_0;
    Button mButton_2_1;
    Button mButton_2_2;
    Button mButton_white_flag;
    TextView mTextViewTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_game3x3);
        Bundle SavedData = getIntent().getExtras();
        if (SavedData != null) {
            computer_difficulty = SavedData.getInt("VrFQ}Ig}5Vn$M", 1);
            mark_type = SavedData.getInt("h&3gt(*h%tr48", 2);
            player_type = SavedData.getInt("*M68m=bvBn6%5", 2);
            turn = mark_type;
        }
        mButton_0_0 = findViewById(R.id.cell_0_0);
        mButton_0_1 = findViewById(R.id.cell_0_1);
        mButton_0_2 = findViewById(R.id.cell_0_2);
        mButton_1_0 = findViewById(R.id.cell_1_0);
        mButton_1_1 = findViewById(R.id.cell_1_1);
        mButton_1_2 = findViewById(R.id.cell_1_2);
        mButton_2_0 = findViewById(R.id.cell_2_0);
        mButton_2_1 = findViewById(R.id.cell_2_1);
        mButton_2_2 = findViewById(R.id.cell_2_2);
        mButton_white_flag = findViewById(R.id.button_white_flag);
        mTextViewTurn = findViewById(R.id.TextViewTurn);
        if (mark_type == 1) {
            if (player_type == 1) {
                turn = 2;
                ComputerTurn();
                turn = 1;
            }
        }
        updateTurnText();
    }

    public void cell_0_0_pressed(View view) {
        if (cell[0][0] != 1 && cell[0][0] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[0][0] = 1;
                mButton_0_0.setText("O");
            } else {
                cell[0][0] = 2;
                mButton_0_0.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_0_1_pressed(View view) {
        if (cell[0][1] != 1 && cell[0][1] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[0][1] = 1;
                mButton_0_1.setText("O");
            } else {
                cell[0][1] = 2;
                mButton_0_1.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_0_2_pressed(View view) {
        if (cell[0][2] != 1 && cell[0][2] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[0][2] = 1;
                mButton_0_2.setText("O");
            } else {
                cell[0][2] = 2;
                mButton_0_2.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_1_2_pressed(View view) {
        if (cell[1][2] != 1 && cell[1][2] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[1][2] = 1;
                mButton_1_2.setText("O");
            } else {
                cell[1][2] = 2;
                mButton_1_2.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_1_1_pressed(View view) {
        if (cell[1][1] != 1 && cell[1][1] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[1][1] = 1;
                mButton_1_1.setText("O");
            } else {
                cell[1][1] = 2;
                mButton_1_1.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_1_0_pressed(View view) {
        if (cell[1][0] != 1 && cell[1][0] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[1][0] = 1;
                mButton_1_0.setText("O");
            } else {
                cell[1][0] = 2;
                mButton_1_0.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_2_0_pressed(View view) {
        if (cell[2][0] != 1 && cell[2][0] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[2][0] = 1;
                mButton_2_0.setText("O");
            } else {
                cell[2][0] = 2;
                mButton_2_0.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_2_1_pressed(View view) {
        if (cell[2][1] != 1 && cell[2][1] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[2][1] = 1;
                mButton_2_1.setText("O");
            } else {
                cell[2][1] = 2;
                mButton_2_1.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void cell_2_2_pressed(View view) {
        if (cell[2][2] != 1 && cell[2][2] != 2) { // 1 - нолик, 2 - крестик
            if (turn == 1) {
                cell[2][2] = 1;
                mButton_2_2.setText("O");
            } else {
                cell[2][2] = 2;
                mButton_2_2.setText("X");
            }
            updateTurnValue();
            updateTurnText();
            checkWin();
            if (player_type == 1) ComputerTurn();
        } else {
            Toast.makeText(this, "Данная клетка уже занята", Toast.LENGTH_SHORT).show();
        }
    }

    public void white_flag_pressed(View view) {
        if (!end && player_type == 1)
            Toast.makeText(this, "Вы проиграли!", Toast.LENGTH_SHORT).show();
        else if (!end && turn == 1)
            Toast.makeText(this, "Нолики проиграли!", Toast.LENGTH_SHORT).show();
        else if (!end && turn == 2)
            Toast.makeText(this, "Крестики проиграли!", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void updateTurnText() {
        if (turn == 1) {
            mTextViewTurn.setText("Ход ноликов");
        } else {
            mTextViewTurn.setText("Ход крестиков");
        }
    }

    public void updateTurnValue() {
        if (turn == 1) turn = 2;
        else turn = 1;
    }

    public void updateButtonsUsabilty(boolean Enable) {
        mButton_0_0.setEnabled(Enable);
        mButton_0_1.setEnabled(Enable);
        mButton_0_2.setEnabled(Enable);
        mButton_1_0.setEnabled(Enable);
        mButton_1_1.setEnabled(Enable);
        mButton_1_2.setEnabled(Enable);
        mButton_2_0.setEnabled(Enable);
        mButton_2_1.setEnabled(Enable);
        mButton_2_2.setEnabled(Enable);
    }

    public void checkWin() {
        int res;
        LogicCalculation3x3 Calc = new LogicCalculation3x3();
        res = Calc.LogicCheck(cell);
        switch (res) {
            case 0:
                mTextViewTurn.setText("Ничья!");
                updateButtonsUsabilty(false);
                mButton_white_flag.setText("Назад");
                end = true;
                break;
            case 1:
                mTextViewTurn.setText("Нолики победили!");
                mButton_white_flag.setText("Назад");
                updateButtonsUsabilty(false);
                end = true;
                break;
            case 2:
                mTextViewTurn.setText("Крестики победили!");
                updateButtonsUsabilty(false);
                mButton_white_flag.setText("Назад");
                end = true;
                break;
            case -1:
                break;
            default:
                mTextViewTurn.setText("Произошла какая-то ошибка(");
                updateButtonsUsabilty(false);
                mButton_white_flag.setText("Валим отсюда");
                end = true;
                break;
        }
    }

    public void ComputerTurn() {
        if (!end) {
            ComputerPlayer Bot = new ComputerPlayer();
            switch (computer_difficulty) {
                case 1:
                    bot_choice = Bot.EasyComputer(cell, turn);
                    SetComputerMark(bot_choice);
                    break;
                case 2:
                    bot_choice = Bot.NormalComputer(cell, turn);
                    SetComputerMark(bot_choice);
                    break;
                case 3:
                    bot_choice = Bot.HardComputer3x3(cell, turn);
                    SetComputerMark(bot_choice);
                    break;
                default:
                    Toast.makeText(this, "Возникла ошибка в работе бота!", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    public void SetComputerMark(int[] bot_choice) {
        if (!end) {
            if ((bot_choice[0] == 0) && (bot_choice[1] == 0)) {
                if (turn == 1) {
                    cell[0][0] = 1;
                    mButton_0_0.setText("O");
                } else {
                    cell[0][0] = 2;
                    mButton_0_0.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 0) && (bot_choice[1] == 1)) {
                if (turn == 1) {
                    cell[0][1] = 1;
                    mButton_0_1.setText("O");
                } else {
                    cell[0][1] = 2;
                    mButton_0_1.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 0) && (bot_choice[1] == 2)) {
                if (turn == 1) {
                    cell[0][2] = 1;
                    mButton_0_2.setText("O");
                } else {
                    cell[0][2] = 2;
                    mButton_0_2.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 1) && (bot_choice[1] == 0)) {
                if (turn == 1) {
                    cell[1][0] = 1;
                    mButton_1_0.setText("O");
                } else {
                    cell[1][0] = 2;
                    mButton_1_0.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 1) && (bot_choice[1] == 1)) {
                if (turn == 1) {
                    cell[1][1] = 1;
                    mButton_1_1.setText("O");
                } else {
                    cell[1][1] = 2;
                    mButton_1_1.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 1) && (bot_choice[1] == 2)) {
                if (turn == 1) {
                    cell[1][2] = 1;
                    mButton_1_2.setText("O");
                } else {
                    cell[1][2] = 2;
                    mButton_1_2.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 2) && (bot_choice[1] == 0)) {
                if (turn == 1) {
                    cell[2][0] = 1;
                    mButton_2_0.setText("O");
                } else {
                    cell[2][0] = 2;
                    mButton_2_0.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 2) && (bot_choice[1] == 1)) {
                if (turn == 1) {
                    cell[2][1] = 1;
                    mButton_2_1.setText("O");
                } else {
                    cell[2][1] = 2;
                    mButton_2_1.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            } else if ((bot_choice[0] == 2) && (bot_choice[1] == 2)) {
                if (turn == 1) {
                    cell[2][2] = 1;
                    mButton_2_2.setText("O");
                } else {
                    cell[2][2] = 2;
                    mButton_2_2.setText("X");
                }
                updateTurnValue();
                updateTurnText();
                checkWin();
            }
        }
    }


}
