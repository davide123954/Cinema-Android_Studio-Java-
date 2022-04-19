package com.example.projectigor;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_form);
        VideoView videoview= findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.cranktrailer;
        Uri uri= Uri.parse(videoPath);
        videoview.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
    public  void Bad_Boys(View view)
    {
        VideoView videoview= findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.badboystrailer;
        Uri uri= Uri.parse(videoPath);
        videoview.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
    public  void Ghostbuster(View view)
    {
        VideoView videoview= findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.ghostubstertrailer;
        Uri uri= Uri.parse(videoPath);
        videoview.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
    public  void Fast_Fourius(View view)
    {
        VideoView videoview= findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.fastfouroustrailer;
        Uri uri= Uri.parse(videoPath);
        videoview.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
    public  void The_Goodfather(View view)
    {
        VideoView videoview= findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.ilpadrinotrailer;
        Uri uri= Uri.parse(videoPath);
        videoview.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
    public  void Crank(View view)
    {
        VideoView videoview= findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.cranktrailer;
        Uri uri= Uri.parse(videoPath);
        videoview.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
    public  void Black_Widow(View view)
    {
        VideoView videoview= findViewById(R.id.video_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.blackwidowtrailer;
        Uri uri= Uri.parse(videoPath);
        videoview.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
}
