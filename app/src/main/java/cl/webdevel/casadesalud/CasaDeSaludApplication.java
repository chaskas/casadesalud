package cl.webdevel.casadesalud;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;


public class CasaDeSaludApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "QM2925ctnOK6M0ZdEY6ftVmt7ARSJg2lv6xjSqtc", "PPiZeMx1sdAB4r4sVoME9wT0MQhtKs1CD2AgRsGg");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
