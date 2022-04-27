package com.example.splashscreen;


/*import android.app.Activity;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FirestoreESP {
    private static final String TAG = "FirestoreESP";

    public enum RESULT_CODE {
        STARTED, PLAYER2_ACTION, ERROR
    }

    public interface OnAuthenticatedListener {
        void onAuthenticated(boolean success, String status);
    }


    private static Random prng = new Random();


    private static FirestoreESP INSTANCE;
    private FirebaseUser user;
    private FirebaseFirestore db;
    private DocumentReference currentGame;
    private ListenerRegistration currentGameListener;


    private FirestoreESP() {
    }

    public static synchronized FirestoreESP getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FirestoreESP();
        }
        return INSTANCE;
    }

    public void authenticate(Activity activity, final OnAuthenticatedListener listener) {
        if (user == null) {
            db = FirebaseFirestore.getInstance();

            final FirebaseAuth auth = FirebaseAuth.getInstance();
            auth.signInAnonymously()
                    .addOnCompleteListener(activity, task -> {
                        if (task.isSuccessful()) {
                            user = auth.getCurrentUser();
                            listener.onAuthenticated(true, "Logged in with id: " + user.getUid());
                        } else {
                            listener.onAuthenticated(false, null);
                        }
                    });
        } else {
            listener.onAuthenticated(true, "Already logged in with id: " + user.getUid());
        }
    }













}


*/


