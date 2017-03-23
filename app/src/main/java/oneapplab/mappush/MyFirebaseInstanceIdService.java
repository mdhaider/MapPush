package oneapplab.mappush;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by haider on 22-03-2017.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
  private static final String REG_TOK="REG_TOK";
    @Override
    public void onTokenRefresh() {
        String refreshedToken= FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOK,refreshedToken);

    }
}
