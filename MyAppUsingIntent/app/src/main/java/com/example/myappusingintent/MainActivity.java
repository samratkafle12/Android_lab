package com.example.myappusingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        //Web Browsing
//        Uri uri = Uri.parse("http://www.baidu.com");
//        Intent intent = new Intent(Intent.ACTION_VIEW ,uri);
//        startActivity(intent);

//
        //showing address in map

//        Uri urigmap = Uri.parse("geo:39.9,116.3");
//        Intent intentgmap = new Intent(Intent.ACTION_VIEW, urigmap);
//        startActivity(intentgmap);
//
//        Uri urismap = Uri.parse("http://maps.google.com/maps?f=d&saddr=startLat%20startLng&daddr=endLat%20endLng&hl=en");
//        Intent intentsmap = new Intent(Intent.ACTION_VIEW, urismap);
//        startActivity(intentsmap);

//
//        //send sms or mms
//
//        Uri urisms = Uri.parse("smsto:10086");
//        Intent intentsms = new Intent(Intent.ACTION_SENDTO, urisms);
//        intentsms.putExtra("sms_body", "Hello");
//        startActivity(intentsms);
//
//        Intent intentmms = new Intent(Intent.ACTION_SEND);
//        intentmms.putExtra("sms_body", "Hello");
//        Uri urimms = Uri.parse("content:/home/kafle-samrat/Downloads/21523.jpg");
//        intentmms.putExtra(Intent.EXTRA_STREAM, urimms);
//        intentmms.setType("image/jpg");
//        startActivity(intentmms);


//        //Play multimedia
//
//        Uri uriplay = Uri.withAppendedPath(MediaStore.Audio.Media.INTERNAL_CONTENT_URI, "1");
//        Intent intentplay = new Intent(Intent.ACTION_VIEW, uriplay);
//        startActivity(intentplay);
//
//
//        Intent intentpm = new Intent(Intent.ACTION_VIEW);
//        Uri uripm = Uri.parse("/home/kafle-samrat/Downloads/DenDenMushi.mp3");
//        intentpm.setDataAndType(uripm, "audio/mp3");
//        startActivity(intentpm);
//

        //
      //  Taking pictures






//
//        Intent intentpic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(intentpic, 0);
//
//        Bundle extras = intentpic.getExtras();


//           //sending email through gmail
//
//        Intent emailIntent = new Intent(Intent.ACTION_SEND);
//        emailIntent.setType("plain/text");
//        String address[] = new String[] { "kafqq12@gmail.com" };
//        String subject = "I'm Sam";
//        String content = "www.google.com";
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, address);
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
//        emailIntent.putExtra(Intent.EXTRA_TEXT, content);
//        startActivity(emailIntent);



             //Showing call dialing screen

//
//        Uri uri = Uri.parse("tel:10086");
//        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
//        startActivity(intent);




    }
}