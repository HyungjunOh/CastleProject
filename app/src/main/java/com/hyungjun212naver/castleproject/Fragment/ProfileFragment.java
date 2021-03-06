package com.hyungjun212naver.castleproject.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.hyungjun212naver.castleproject.R;

public class ProfileFragment extends Fragment {

    private WebView getInstarhashtag;
    private WebSettings mWebSettings;
    private OnFragmentInteractionListener mListener;

    public ProfileFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        getInstarhashtag = (WebView)view.findViewById(R.id.about_place_getinstarhashtag);
        mWebSettings = getInstarhashtag.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        //getInstarhashtag.loadUrl("https://congcheck.herokuapp.com/");
        getInstarhashtag.loadUrl("https://www.instagram.com/explore/tags/%EB%82%99%EC%82%B0/");
        return view;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Uri uri);
    }
}
