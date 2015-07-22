package cl.webdevel.casadesalud;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = new WebView(this);
        setContentView(webview);

        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://www.casadesalud.cl");

    }

}
