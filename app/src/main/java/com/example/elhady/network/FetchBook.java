package com.example.elhady.network;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class FetchBook extends AsyncTask <String,Void,String> {

    private WeakReference<TextView> mTitleText;
    private WeakReference<TextView>mAuthorText;

    public FetchBook (TextView mTitleText,TextView mAuthorText){
        this.mTitleText = new WeakReference<>(mTitleText);
        this.mAuthorText = new WeakReference<>(mAuthorText);
    }

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}

