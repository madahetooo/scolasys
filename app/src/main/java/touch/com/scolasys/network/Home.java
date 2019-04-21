package touch.com.scolasys.network;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import touch.com.scolasys.R;

public class Home extends AppCompatActivity {
WebView ScolasysWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        ScolasysWebView=findViewById(R.id.webViewScolasys);
        ScolasysWebView.getSettings().setJavaScriptEnabled(true);
        ScolasysWebView.setWebViewClient(new WebViewClient());
        ScolasysWebView.loadUrl("https://isms.scolasys.com/");
    }
}


