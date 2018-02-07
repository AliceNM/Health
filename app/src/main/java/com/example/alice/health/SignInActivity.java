package com.example.alice.health;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API;

public class SignInActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, View.OnClickListener {

    Button signInButton;
    TextView stastusTextView;
    GoogleApiClient mGoogleApiClient;
    private static final String TAG ="SignInActivity";
    private static final int PC_SIGN_IN = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        GoogleSignInOptions geo = new GoogleSignInOptions.Builder.DEFAULT_SIGN_IN
                .requestEmail()
                .build();
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this,this)
                .addApi(GOOGLE_SIGN_IN_API)
                .build();
stastusTextView =(TextView) findViewById(R.id.status_text);
signInButton =(Button) findViewById(R.id.sign_in_button);
signInButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
