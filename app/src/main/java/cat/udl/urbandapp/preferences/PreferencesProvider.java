package cat.udl.urbandapp.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesProvider {
    private static String SHARED_PREFERENCES = "mPreferences";

    //TODO: Arreglar el error
    private static SharedPreferences sPreferences;

    public static SharedPreferences providePreferences() {
        return sPreferences;
    }

    //En la classe APP, on inicialitzem la aplicació, no inicialitzavem el PreferenceProvider utilitzant el init
    //Si no ho fem , no podrem tenir aquestes SharedPreferences en compte
    public static void init(Context context) {

        sPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);

    }
}
