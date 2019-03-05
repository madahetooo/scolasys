package touch.com.scolasys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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
        ScolasysWebView.loadUrl("http://mob.scolasys.com/");
    }
}
