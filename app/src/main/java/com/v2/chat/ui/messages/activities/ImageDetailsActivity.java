package com.v2.chat.ui.messages.activities;

import android.graphics.Bitmap;
import android.os.Bundle;

import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.v2.chat.R;
import com.v2.chat.core.messages.models.Message;
import com.v2.chat.ui.ChatUI;
import com.v2.chat.utils.StringUtils;
import com.v2.chat.utils.TimeUtils;
import com.v2.chat.utils.views.TouchImageView;

import java.util.Map;


/**
 * Created by stefanodp91 on 25/11/2016.
 * <p>
 * Resolve Issue #32
 */
public class ImageDetailsActivity extends AppCompatActivity {
    private static final String TAG = ImageDetailsActivity.class.getName();

    private Message message;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_details);

        message = (Message) getIntent().getExtras().getSerializable(ChatUI.BUNDLE_MESSAGE);

        // ### begin toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // ### end toolbar


        registerViews();

        // ### begin image
        String imgUrl = getImageUrl(message);
        setImage(imgUrl);
        // ### end image

        // ### begin title
        String title = message.getText();
        if (StringUtils.isValid(title)) {
            TextView mTitle = findViewById(R.id.image_title);
            mTitle.setText(title);
        }
        // ### end title

        // ### begin sender
        String sender = message.getSenderFullname();
        if (StringUtils.isValid(sender)) {
            TextView mSender = findViewById(R.id.sender);
            mSender.setText(sender);
        }
        // ### end sender

        // ### begin timestamp
        TextView mTimestamp = findViewById(R.id.timestamp);
        try {
            long timestamp = message.getTimestamp();
            String formattedTimestamp = TimeUtils.getFormattedTimestamp(this, timestamp);
            mTimestamp.setText(formattedTimestamp);
        } catch (Exception e) {
            Log.e(TAG, "cannot retrieve the timestamp. " + e.getMessage());
        }
        // ### end timestamp
    }


    private void registerViews() {
        Log.i(TAG, "registerViews");
    }

    private String getImageUrl(Message message) {
        String imgUrl = "";

        Map<String, Object> metadata = message.getMetadata();
        if (metadata != null) {
            imgUrl = (String) metadata.get("src");
        }

        return imgUrl;
    }

    private void setImage(String imgUrl) {
        Log.i(TAG, "setImage");

        final TouchImageView mImage = findViewById(R.id.image);

        mImage.setOnTouchImageViewListener(new TouchImageView.OnTouchImageViewListener() {
            @Override
            public void onMove() {
//                RectF rect = mImage.getZoomedRect();
//                float currentZoom = mImage.getCurrentZoom();
//                boolean isZoomed = mImage.isZoomed();
            }
        });


        // https://github.com/MikeOrtiz/TouchImageView/issues/135
        Glide.with(this)
                .load(imgUrl)
                .asBitmap()
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        mImage.setImageBitmap(resource);
                    }
                });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}