package sv.edu.catolica.entrenapp_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

public class ej1gym_principianteActivity extends AppCompatActivity {
    private ViewGroup linearLayoutDetails, linearLayoutDetails2, linearLayoutDetails3;
    private ImageView imageViewExpand, imageViewExpand2, imageViewExpand3;

    private WebView video1, video2, video3;

    private static final int DURATION = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej1gym_principiante);
        getSupportActionBar().hide();
        linearLayoutDetails = findViewById(R.id.contenedor);
        imageViewExpand = findViewById(R.id.btn_expand);
        imageViewExpand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleDetails(linearLayoutDetails, imageViewExpand);
            }
        });

        linearLayoutDetails2 = findViewById(R.id.contenedor2);
        imageViewExpand2 = findViewById(R.id.btn_expand2);
        imageViewExpand2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleDetails(linearLayoutDetails2, imageViewExpand2);
            }
        });

        linearLayoutDetails3 = findViewById(R.id.contenedor3);
        imageViewExpand3 = findViewById(R.id.btn_expand3);
        imageViewExpand3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleDetails(linearLayoutDetails3, imageViewExpand3);
            }
        });

        video1 = findViewById(R.id.webView);
        video2 = findViewById(R.id.webView2);
        video3 = findViewById(R.id.webView3);

        CargarVideos("gd6B4kRgI78", video1);
        CargarVideos("gd6B4kRgI78", video2);
        CargarVideos("gd6B4kRgI78", video3);


    }

    private void CargarVideos(String id, WebView video){
        WebSettings webSettings = video.getSettings();
        webSettings.setJavaScriptEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }

        String videoId = id;
        String html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/" + videoId + "\" frameborder=\"0\" allowfullscreen></iframe>";
        String mimeType = "text/html";
        String encoding = "UTF-8";
        video.loadData(html, mimeType, encoding);
    }
    public void toggleDetails(ViewGroup viewGroup, ImageView img) {
        if (viewGroup.getVisibility() == View.GONE) {
            ExpandAndCollapseViewUtil.expand(viewGroup, DURATION);
            img.setImageResource(R.drawable.baseline_expand_less_24);
            rotate(-180.0f, img);
        } else {
            ExpandAndCollapseViewUtil.collapse(viewGroup, DURATION);
            img.setImageResource(R.drawable.baseline_expand_more_24);
            rotate(180.0f, img);
        }
    }

    private void rotate(float angle, ImageView img) {
        Animation animation = new RotateAnimation(0.0f, angle, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setFillAfter(true);
        animation.setDuration(DURATION);
        img.startAnimation(animation);
    }
}