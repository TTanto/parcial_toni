package cat.udl.urbandapp;
import android.app.Application;

import cat.udl.urbandapp.preferences.PreferencesProvider;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //En cap moment no feiem el init del preferencesProvider, llavors no poder
        //fer cap acció en ell
        PreferencesProvider.init(this);
    }
}