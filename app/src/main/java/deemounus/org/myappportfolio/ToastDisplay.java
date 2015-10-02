package deemounus.org.myappportfolio;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by deemounus on 10/1/15.
 */

public class ToastDisplay {

    public void showToast (Context ctx, String message) {
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(ctx, message, duration).show();
    }
}
