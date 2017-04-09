package com.example.bryanshebeck.metisreferrals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        EditText edittext = (EditText)findViewById(R.id.passResp1);
        edittext.setTransformationMethod(new AsteriskPasswordTransformationMethod());

        ImageButton nextButton = (ImageButton) findViewById(R.id.nextRegistrationButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, SignInCont.class));
            }
        });
    }

    public class AsteriskPasswordTransformationMethod extends PasswordTransformationMethod {
        @Override
        public CharSequence getTransformation(CharSequence source, View view) {
            return new PasswordCharSequence(source);
        }

        private class PasswordCharSequence implements CharSequence {
            private CharSequence mSource;
            public PasswordCharSequence(CharSequence source) {
                mSource = source; // Store char sequence
            }
            public char charAt(int index) {
                return '*'; // This is the important part
            }
            public int length() {
                return mSource.length(); // Return default
            }
            public CharSequence subSequence(int start, int end) {
                return mSource.subSequence(start, end); // Return default
            }
        }
    };
}
