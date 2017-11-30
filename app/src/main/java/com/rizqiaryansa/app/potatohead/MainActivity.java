package com.rizqiaryansa.app.potatohead;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbShoes, cbEars, cbMouth, cbGlasses, cbEyes, cbBody;
    RatingBar rbHat, rbEyebrows, rbNose, rbMoustache, rbArms;
    ImageView ivBody, ivShoes, ivHat, ivGlasses, ivEyebrows, ivEyes, ivMouth, ivEars, ivMoustache,
    ivNose, ivArms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbShoes = (CheckBox) findViewById(R.id.checkbox_shoes);
        cbEars = (CheckBox) findViewById(R.id.checkbox_ears);
        cbMouth = (CheckBox) findViewById(R.id.checkbox_mouth);
        cbGlasses = (CheckBox) findViewById(R.id.checkbox_glasses);
        cbEyes = (CheckBox) findViewById(R.id.checkbox_eyes);
        cbBody = (CheckBox) findViewById(R.id.checkbox_body);

        rbHat = (RatingBar) findViewById(R.id.rb_hat);
        rbEyebrows = (RatingBar) findViewById(R.id.rb_eyebrows);
        rbNose = (RatingBar) findViewById(R.id.rb_nose);
        rbMoustache = (RatingBar) findViewById(R.id.rb_moustache);
        rbArms = (RatingBar) findViewById(R.id.rb_arms);

        ivBody = (ImageView) findViewById(R.id.body);
        ivShoes = (ImageView) findViewById(R.id.shoes);
        ivHat = (ImageView) findViewById(R.id.hat);
        ivGlasses = (ImageView) findViewById(R.id.glasses);
        ivEyebrows = (ImageView) findViewById(R.id.eyebrows);
        ivEyes = (ImageView) findViewById(R.id.eyes);
        ivMouth = (ImageView) findViewById(R.id.mouth);
        ivEars = (ImageView) findViewById(R.id.ears);
        ivMoustache = (ImageView) findViewById(R.id.moustache);
        ivNose = (ImageView) findViewById(R.id.nose);
        ivArms = (ImageView) findViewById(R.id.arms);


        cbShoes.setOnTouchListener(mShoesListener);
        cbEars.setOnTouchListener(mEarsListener);
        cbMouth.setOnTouchListener(mMouthListener);
        cbGlasses.setOnTouchListener(mGlassesListener);
        cbEyes.setOnTouchListener(mEyesListener);
        cbBody.setOnTouchListener(mBodyListener);

        rbHat.setOnTouchListener(mHatListener);
        rbEyebrows.setOnTouchListener(mEyeBrowsListener);
        rbNose.setOnTouchListener(mNoseListener);
        rbMoustache.setOnTouchListener(mMoustacheListener);
        rbArms.setOnTouchListener(mArmsListener);

    }

    private View.OnTouchListener mBodyListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivBody.getVisibility() == View.INVISIBLE) {
                    ivBody.setVisibility(View.VISIBLE);
                    cbBody.setChecked(true);
                } else if (ivBody.getVisibility() == View.VISIBLE) {
                    ivBody.setVisibility(View.INVISIBLE);
                    cbBody.setChecked(false);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mShoesListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivShoes.getVisibility() == View.INVISIBLE) {
                    ivShoes.setVisibility(View.VISIBLE);
                    cbShoes.setChecked(true);
                } else if (ivShoes.getVisibility() == View.VISIBLE) {
                    ivShoes.setVisibility(View.INVISIBLE);
                    cbShoes.setChecked(false);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mEarsListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivEars.getVisibility() == View.INVISIBLE) {
                    ivEars.setVisibility(View.VISIBLE);
                    cbEars.setChecked(true);
                } else if (ivEars.getVisibility() == View.VISIBLE) {
                    ivEars.setVisibility(View.INVISIBLE);
                    cbEars.setChecked(false);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mMouthListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivMouth.getVisibility() == View.INVISIBLE) {
                    ivMouth.setVisibility(View.VISIBLE);
                    cbMouth.setChecked(true);
                } else if (ivMouth.getVisibility() == View.VISIBLE) {
                    ivMouth.setVisibility(View.INVISIBLE);
                    cbMouth.setChecked(false);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mGlassesListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivGlasses.getVisibility() == View.INVISIBLE) {
                    ivGlasses.setVisibility(View.VISIBLE);
                    cbGlasses.setChecked(true);
                } else if (ivGlasses.getVisibility() == View.VISIBLE) {
                    ivGlasses.setVisibility(View.INVISIBLE);
                    cbGlasses.setChecked(false);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mEyesListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivEyes.getVisibility() == View.INVISIBLE) {
                    ivEyes.setVisibility(View.VISIBLE);
                    cbEyes.setChecked(true);
                } else if (ivEyes.getVisibility() == View.VISIBLE) {
                    ivEyes.setVisibility(View.INVISIBLE);
                    cbEyes.setChecked(false);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mHatListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivHat.getVisibility() == View.INVISIBLE) {
                    ivHat.setVisibility(View.VISIBLE);
                    LayerDrawable rbHatProgress = (LayerDrawable) rbHat.getProgressDrawable();
                    rbHatProgress.getDrawable(0).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
                } else if (ivHat.getVisibility() == View.VISIBLE) {
                    ivHat.setVisibility(View.INVISIBLE);
                    LayerDrawable rbHatProgress = (LayerDrawable) rbHat.getProgressDrawable();
                    rbHatProgress.getDrawable(0).setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mEyeBrowsListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivEyebrows.getVisibility() == View.INVISIBLE) {
                    ivEyebrows.setVisibility(View.VISIBLE);
                    LayerDrawable rbEyebrowsProgress = (LayerDrawable) rbEyebrows.getProgressDrawable();
                    rbEyebrowsProgress.getDrawable(0).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
                } else if (ivEyebrows.getVisibility() == View.VISIBLE) {
                    ivEyebrows.setVisibility(View.INVISIBLE);
                    LayerDrawable rbEyebrowsProgress = (LayerDrawable) rbEyebrows.getProgressDrawable();
                    rbEyebrowsProgress.getDrawable(0).setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mNoseListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivNose.getVisibility() == View.INVISIBLE) {
                    ivNose.setVisibility(View.VISIBLE);
                    LayerDrawable rbNoseProgress = (LayerDrawable) rbNose.getProgressDrawable();
                    rbNoseProgress.getDrawable(0).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
                } else if (ivNose.getVisibility() == View.VISIBLE) {
                    ivNose.setVisibility(View.INVISIBLE);
                    LayerDrawable rbNoseProgress = (LayerDrawable) rbNose.getProgressDrawable();
                    rbNoseProgress.getDrawable(0).setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mMoustacheListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivMoustache.getVisibility() == View.INVISIBLE) {
                    ivMoustache.setVisibility(View.VISIBLE);
                    LayerDrawable rbMouseProgress = (LayerDrawable) rbMoustache.getProgressDrawable();
                    rbMouseProgress.getDrawable(0).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
                } else if (ivMoustache.getVisibility() == View.VISIBLE) {
                    ivMoustache.setVisibility(View.INVISIBLE);
                    LayerDrawable rbMoustacheProgress = (LayerDrawable) rbMoustache.getProgressDrawable();
                    rbMoustacheProgress.getDrawable(0).setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
                }
            }
            return true;
        }
    };

    private View.OnTouchListener mArmsListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            // Do what you want
            if(event.getAction() == MotionEvent.ACTION_UP) {
                if (ivArms.getVisibility() == View.INVISIBLE) {
                    ivArms.setVisibility(View.VISIBLE);
                    LayerDrawable rbArmsProgress = (LayerDrawable) rbArms.getProgressDrawable();
                    rbArmsProgress.getDrawable(0).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
                } else if (ivArms.getVisibility() == View.VISIBLE) {
                    ivArms.setVisibility(View.INVISIBLE);
                    LayerDrawable rbArmsProgress = (LayerDrawable) rbArms.getProgressDrawable();
                    rbArmsProgress.getDrawable(0).setColorFilter(Color.LTGRAY, PorterDuff.Mode.SRC_ATOP);
                }
            }
            return true;
        }
    };

}
