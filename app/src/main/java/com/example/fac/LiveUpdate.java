package com.example.fac;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LiveUpdate#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiveUpdate extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Test.OnFragmentInteractionListener mListener;

    private TextView TvCases, TvRecovered, TvCritical, TvActive, TvTodayCases, TvTotalDeaths, TvTodayDeaths;

    public LiveUpdate() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LiveUpdate.
     */
    // TODO: Rename and change types and number of parameters
    private static LiveUpdate newInstance(String param1, String param2) {
        LiveUpdate fragment = new LiveUpdate();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_live_update, container, false);
        TvCases = (TextView) view.findViewById(R.id.tvCases);
        TvRecovered= (TextView) view.findViewById(R.id.tvRecovered);
        TvCritical = (TextView) view.findViewById(R.id.tvCritical);
        TvActive = (TextView) view.findViewById(R.id.tvActive);
        TvTodayCases = (TextView) view.findViewById(R.id.tvTodayCases);
        TvTotalDeaths = (TextView) view.findViewById(R.id.tvTotalDeaths);
        TvTodayDeaths = (TextView) view.findViewById(R.id.tvTodayDeaths);

        fetchData();
        return view;
    }

    private void fetchData() {
        String url = "https://corona.lmao.ninja/v2/all";

        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>(){
            @Override
            public void onResponse(String response)
            {
                try {
                    JSONObject jsonObject = new JSONObject(response.toString());

                    TvCases.setText(jsonObject.getString("cases"));
                    TvRecovered.setText(jsonObject.getString("recovered"));
                    TvCritical.setText(jsonObject.getString("critical"));
                    TvActive.setText(jsonObject.getString("active"));
                    TvTodayCases.setText(jsonObject.getString("todayCases"));
                    TvTotalDeaths.setText(jsonObject.getString("deaths"));
                    TvTodayDeaths.setText(jsonObject.getString("todayDeaths"));
                }
                catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(request);
    }

    public void onButtonPressed(Uri uri) {
        if(mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof Test.OnFragmentInteractionListener) {
            mListener = (Test.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentListener");
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

