package com.example.t_nakajima.webviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView varWebView;

//    public MainActivity(webView varWebView) {
//        this.varWebView = varWebView;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView1 = (WebView) findViewById(R.id.webView01);

        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("file:///android_asset/index.html");
     //   webView1.loadUrl("https://google.co.jp");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, "google");
        menu.add(0, 1, 1, "yahoo");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        int iid = item.getItemId();
        switch (iid) {
            case 0:
                varWebView.loadUrl("http://www.google.com");
                break;
            case 1:
                varWebView.loadUrl("http://www.yahoo.co.jp");
                break;
            default:
                break;

        }

        return true;
    }
}
