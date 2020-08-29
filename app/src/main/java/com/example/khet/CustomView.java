package com.example.khet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import static android.content.ContentValues.TAG;

public class CustomView extends View {

    int init_posn=0;

    Bitmap mDrawBitmap;
    Canvas mBitmapCanvas;
Paint black;
int i_r_s_1=0,i_r_s_2=0;
Paint grey,red,white,maroon,light_grey;
int left=150,top=550;

int r_s=0;
int flag=0;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init()
    {
        black=new Paint(Paint.ANTI_ALIAS_FLAG);
        black.setColor(Color.BLACK);
        grey=new Paint(Paint.ANTI_ALIAS_FLAG);
        grey.setColor(Color.GRAY);

        black.setTextSize(100);

        red=new Paint(Paint.ANTI_ALIAS_FLAG);
        red.setColor(Color.RED);

        white=new Paint(Paint.ANTI_ALIAS_FLAG);
        white.setColor(Color.WHITE);


        maroon=new Paint(Paint.ANTI_ALIAS_FLAG);
        int c1=Color.parseColor("#800000");
        maroon.setColor(c1);

        int c2=Color.parseColor("#D3D3D3");
        light_grey=new Paint(Paint.ANTI_ALIAS_FLAG);
        light_grey.setColor(c2);

    }

    public void rotate_piece()
    {

    }

    public void rotate_sphinx_red()
    {if(i_r_s_1==0)
    { i_r_s_1=1;}
    else
    {
        i_r_s_1=0;
    }
        Log.d(TAG, "rotate_sphinx: ");
        postInvalidate();
    }



    public void rotate_sphinx_white()
    {
        if(i_r_s_2==0)
        { i_r_s_2=1;}
        else
        {
            i_r_s_2=0;
        }
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        if (mDrawBitmap == null) {
            mDrawBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            mBitmapCanvas = new Canvas(mDrawBitmap);
        }//initialising bitmap

      mBitmapCanvas.drawRect(125,500,1010,1400,black);




        if(flag==0) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {



                    if (j == 9) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, white);
                        if (i == 3) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, -45, 180, true, light_grey);
                        }
                        if (i == 4) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, -135, 180, true, light_grey);
                        }
if(i==7) {
    if (i_r_s_2 == 1) {
        mBitmapCanvas.drawText("<", 920, 1330, black);
    } else {

        mBitmapCanvas.drawText("^", 920, 1330, black);

    }
}



                    } else if (j == 0) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, red);

                        if(i==0 )
                        {
                            if(i_r_s_1==1)
                            {
                                mBitmapCanvas.drawText(">", 170, 620, black);
                            }
                            else
                            {
                                black.setTextSize(70);
                                mBitmapCanvas.drawText("v", 170, 620, black);
                                black.setTextSize(100);
                            }

                        }

                        if (i == 3) {

                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, 45, 180, true, maroon);
                        } else if (i == 4) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, 135, 180, true, maroon);

                        }
                        left += 84;
                    } else if (i == 0 && j == 1) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, white);
                        left += 84;
                    } else if (i == 7 && j == 1) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, white);
                        left += 84;
                    } else if (i == 0 && j == 8) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, red);
                        left += 84;
                    } else if (i == 7 && j == 8) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, red);
                        left += 84;
                    } else if (j == 2) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, grey);

                        if (i == 1) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, -135, 180, true, maroon);
                        }
                        if (i == 3) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, -135, 180, true, light_grey);

                        }
                        if (i == 4) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, -45, 180, true, light_grey);
                        }
                        if (i == 7) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, -45, 180, true, light_grey);
                        }
                        left += 84;
                    } else if (j == 3) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, grey);
                        if (i == 2) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, -45, 180, true, light_grey);
                        }
                        if (i == 7) {
                            // RectF r = new RectF(left, top, left+80, top+80);
                            //mBitmapCanvas.drawArc(r,-45,180,true,light_grey);
                            light_grey.setTextSize(80);
                            mBitmapCanvas.drawText("A", left + 10, top + 70, light_grey);
                        }
                        left += 84;
                    } else if (j == 4) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, grey);
                        if (i == 0) {

                            maroon.setTextSize(80);
                            mBitmapCanvas.save();
                            mBitmapCanvas.rotate(180, left + 40, top + 40);
                            mBitmapCanvas.drawText("A", left + 10, top + 70, maroon);
                            mBitmapCanvas.restore();

                        }
                        if (i == 3) {

                            maroon.setStrokeWidth(10);
                            mBitmapCanvas.drawLine(left, top, left + 80, top + 80, maroon);

                        }
                        if (i == 4) {
                            light_grey.setStrokeWidth(10);
                            mBitmapCanvas.drawLine(left + 80, top, left, top + 80, light_grey);
                        }
                        if (i == 7) {
                            mBitmapCanvas.drawCircle(left + 40, top + 40, 20, light_grey);
                        }
                        left += 84;
                    } else if (j == 5) {

                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, grey);


                        if (i == 0) {
                            mBitmapCanvas.drawCircle(left + 40, top + 40, 20, maroon);
                        }

                        if (i == 7) {
                            light_grey.setTextSize(80);
                            mBitmapCanvas.drawText("A", left + 10, top + 70, light_grey);
                        }
                        if (i == 3) {

                            maroon.setStrokeWidth(10);
                            mBitmapCanvas.drawLine(left + 80, top, left, top + 80, maroon);

                        }
                        if (i == 4) {
                            light_grey.setStrokeWidth(10);
                            mBitmapCanvas.drawLine(left, top, left + 80, top + 80, light_grey);
                        }


                        left += 84;
                    } else if (j == 6) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, grey);

                        if (i == 0) {

                            maroon.setTextSize(80);
                            mBitmapCanvas.save();
                            mBitmapCanvas.rotate(180, left + 40, top + 40);
                            mBitmapCanvas.drawText("A", left + 10, top + 70, maroon);
                            mBitmapCanvas.restore();
                        }


                        if (i == 5) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, 135, 180, true, maroon);
                        }

                        left += 84;
                    } else if (j == 7) {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, grey);

                        if (i == 0) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, 135, 180, true, maroon);
                        }
                        if (i == 3) {

                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, 135, 180, true, maroon);
                        }
                        if (i == 4) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, 45, 180, true, maroon);
                        }
                        if (i == 6) {
                            RectF r = new RectF(left, top, left + 80, top + 80);
                            mBitmapCanvas.drawArc(r, 45, 180, true, light_grey);
                        }


                        left += 84;

                    }


                    else {
                        mBitmapCanvas.drawRect(left, top, left + 80, top + 80, grey);
                        left += 84;

                    }



                   // mBitmapCanvas.drawText("^", 920, 1330, black);


                }
                top += 100;
                left = 150;

            }

            top=550;

        }




        canvas.drawBitmap(mDrawBitmap, 0, 0, red);


    }
}
