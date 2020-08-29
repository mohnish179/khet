package com.example.khet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CustomView mc;
    Button[] v = new Button[80];
    int[] x=new int[80];
    Button rotate,right,left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mc = findViewById(R.id.cv);
        right=findViewById(R.id.right);
        left=findViewById(R.id.left);

        for (int i = 0; i < 80; i++) {
            String b = "button" + (i + 1);
            v[i] = findViewById(getResources().getIdentifier(b, "id", getPackageName()));
            v[i].setOnClickListener(this);

            x[i]=0;
            v[i].setBackgroundColor(Color.TRANSPARENT);

        }//for
        rotate=findViewById(R.id.rotate);
       rotate.setVisibility(View.GONE);
        right.setVisibility(View.GONE);
        left.setVisibility(View.GONE);
init();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:

                mc.rotate_sphinx_red();



                break;
            case R.id.button2:


                //(0, 1,2);
                //1]=1;
                break;
            case R.id.button3:


                //(0, 2,2);
                //2]=1;

                break;
            case R.id.button4:


                //(0, 3,2);
                //3]=1;
                break;
            case R.id.button5:


                //(0, 4,2);
                //4]=1;
                break;
            case R.id.button6:


                //(1, 0,2);
                //5]=1;
                break;
            case R.id.button7:


                //(1, 1,2);
                //6]=1;
                break;
            case R.id.button8:


                //(1, 2,2);
                //7]=1;
                break;
            case R.id.button9:

                //(1, 3,2);
                //8]=1;
                break;
            case R.id.button10:


                //(1, 4,2);
                //9]=1;
                break;
            case R.id.button11:


                //(2, 0,2);
                //10]=1;
                break;
            case R.id.button12:


                //(2, 1,2);
                //11]=1;
                break;
            case R.id.button13:

                //12]=1;
                //(2, 2,2);
                break;
            case R.id.button14:

                //13]=1;
                //(2, 3,2);
                break;
            case R.id.button15:

                //14]=1;
                //(2, 4,2);
                break;
            case R.id.button16:

                //15]=1;
                //(3, 0,2);
                break;
            case R.id.button17:

                //16]=1;
                //(3, 1,2);
                break;
            case R.id.button18:

                //17]=1;
                //(3, 2,2);
                break;
            case R.id.button19:

                //18]=1;
                //(3, 3,2);
                break;
            case R.id.button20:

                //19]=1;
                //(3, 4,2);
                break;
            case R.id.button21:

                //20]=1;
                //(4, 0,2);
                break;
            case R.id.button22:

                //21]=1;
                //(4, 1,2);
                break;
            case R.id.button23:

                //22]=1;
                //(4, 2,2);
                break;
            case R.id.button24:

                //23]=1;
                //(4, 3,2);
                break;
            case R.id.button25:

                //24]=1;
                //(4, 4,2);
                break;
            case R.id.button26:

                //25]=1;
                //(5, 0,2);
                break;
            case R.id.button27:

                //26]=1;
                //(5, 1,2);

                break;
            case R.id.button28:

                //27]=1;
                //(5, 2,2);
                break;
            case R.id.button29:


                //(5, 3,2);
                //28]=1;
                break;
            case R.id.button30:

                //29]=1;
                //(5, 4,2);
                break;
            case R.id.button31:

                if(x[30]==1)
                {
                   // rotate.setBackgroundColor(Color.GREEN);
                    rotate.setVisibility(View.VISIBLE);
                    rotate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            rotate.setVisibility(View.GONE);
                            right.setVisibility(View.VISIBLE);
                            right.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    left.setVisibility(View.GONE);
                                    right.setVisibility(View.GONE);


                                }
                            });
                            left.setVisibility(View.VISIBLE);
                        }
                    });

                }

                break;
            case R.id.button32:

                //(0, 1,2);
                //31]=1;
                break;
            case R.id.button33:

                //(0, 2,2);
                //32]=1;
                break;
            case R.id.button34:

                //33]=1;
                //(0, 3,2);
                break;
            case R.id.button35:

                //34]=1;
                //(0, 4,2);

                break;
            case R.id.button36:

                //(0, 5,2);
                //35]=1;
                break;
            case R.id.button37:

                //(1,0,2);
                //36]=1;
                break;
            case R.id.button38:

                //(1, 1,2);
                //37]=1;
                break;
            case R.id.button39:

                //(1, 2,2);
                //38]=1;
                break;
            case R.id.button40:

                //(1, 3,2);
                //39]=1;
                break;
            case R.id.button41:

                //(1, 4,2);
                //40]=1;
                break;
            case R.id.button42:

                //(1, 5,2);
                //41]=1;
                break;
            case R.id.button43:

                //(2, 0,2);
                //42]=1;
                break;
            case R.id.button44:

                //(2, 1,2);
                //43]=1;
                break;
            case R.id.button45:

                //(2, 2,2);
                //44]=1;
                break;
            case R.id.button46:

                //(2, 3,2);
                //45]=1;
                break;
            case R.id.button47:

                //(2, 4,2);
                //46]=1;
                break;
            case R.id.button48:

                //(2, 5,2);
                //47]=1;
                break;
            case R.id.button49:

                //(3, 0,2);
                //48]=1;
                break;
            case R.id.button50:

                //(3, 1,2);
                //49]=1;
                break;
            case R.id.button51:

                //(3, 2,2);
                //50]=1;
                break;
            case R.id.button52:

                //(3, 3,2);
                //51]=1;
                break;
            case R.id.button53:

                //(3, 4,2);
                //52]=1;
                break;
            case R.id.button54:

                //(3, 5,2);
                //53]=1;
                break;
            case R.id.button55:

                //(4, 0,2);
                //54]=1;
                break;
            case R.id.button56:

                //(4, 1,2);
                //55]=1;
                break;
            case R.id.button57:

                //(4, 2,2);
                //56]=1;
                break;
            case R.id.button58:

                //(4, 3,2);
                //57]=1;
                break;
            case R.id.button59:

                //(4, 4,2);
                //58]=1;
                break;
            case R.id.button60:

                //(4, 5,2);
                //59]=1;
                break;
            case R.id.button61:
                break;
            case R.id.button62:
                break;
            case R.id.button63:
                break;
            case R.id.button64:
                break;
            case R.id.button65:
                break;
            case R.id.button66:
                break;
            case R.id.button67:
                break;
            case R.id.button68:
                break;
            case R.id.button69:
                break;
            case R.id.button70:
                break;
            case R.id.button71:
                break;
            case R.id.button72:
                break;

            case R.id.button73:
                break;
            case R.id.button74:
                break;
            case R.id.button75:
                break;
            case R.id.button76:
                break;
            case R.id.button77:
                break;
            case R.id.button78:
                break;
            case R.id.button79:
                break;
            case R.id.button80:
                mc.rotate_sphinx_white();
                break;



        }
    }
public void init()
{
    x[30]=1;
    x[42]=1;
    x[32]=1;
    x[34]=1;
    x[35]=1;
    x[44]=1;
    x[45]=1;
    x[37]=1;
    x[47]=1;
    x[40]=1;
    x[39]=1;
    x[49]=1;
    x[56]=1;
    x[67]=1;


    for(int j=4;j<8;j++)
    {
        x[j]=1;
    }
    for(int j=72;j<76;j++)
    {
        x[j]=1;
    }
    x[12]=1;
    x[23]=1;
}




}