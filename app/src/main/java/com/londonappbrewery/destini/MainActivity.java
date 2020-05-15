package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int toppress=0,bottompress=0,storylevel=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView=findViewById(R.id.storyTextView);
        mButtonTop=findViewById(R.id.buttonTop);
        mButtonBottom=findViewById(R.id.buttonBottom);
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



            mButtonTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ++toppress;
                    if (toppress == 1 & bottompress==0 ) {
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);


                    }
                    else if(toppress==2 && bottompress==0){
                        mStoryTextView.setText(R.string.T6_End);
                        mButtonTop.setText("Happy Ending");
                        mButtonBottom.setText("Happy Ending");

                    }
                    else if(toppress==1 && bottompress==1){
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);

                    }
                    else if(toppress==2 && bottompress==1){
                        mStoryTextView.setText(R.string.T6_End);
                        mButtonTop.setText("Happy Ending");
                        mButtonBottom.setText("Happy Ending");

                    }


                }



            });





            mButtonBottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ++bottompress;
                    if(toppress==0 && bottompress==1) {
                        mStoryTextView.setText(R.string.T2_Story);
                        mButtonTop.setText(R.string.T2_Ans1);
                        mButtonBottom.setText(R.string.T2_Ans2);
                    }
                    else if(toppress==0 && bottompress==2){
                        mStoryTextView.setText(R.string.T4_End);
                        mButtonTop.setText("Disappointing End");
                        mButtonBottom.setText("Disappointing End");
                    }
                    else if(toppress==1 && bottompress==1){
                        mStoryTextView.setText(R.string.T5_End);
                        mButtonTop.setText("Tragic Ending");
                        mButtonBottom.setText("Tragic Ending");

                    }
                    else if(toppress==1 && bottompress==2){
                        mStoryTextView.setText(R.string.T5_End);
                        mButtonTop.setText("Tragic Ending");
                        mButtonBottom.setText("Tragic Ending");
                    }
                }
            });





        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
