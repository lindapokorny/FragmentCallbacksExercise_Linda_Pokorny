package com.pursuit.fragmentexercisescallbackcommunicationrevisited;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFrag extends Fragment {
    private FragmentInterface fragmentInterface;
    private TextView textView;
    private RecyclerView mRecyclerView;
    private AdapterView mAdapter;

    public static RecyclerViewFrag newInstance(){
        return new RecyclerViewFrag();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentInterface){
            fragmentInterface = (FragmentInterface)context;
        }else {
            throw new  RuntimeException(context.toString() + "Lindas Interface");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerViewAdapter = RecyclerView.Adapter
        findView(view);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentInterface.toDisplayFrag();
            }
        });

    }
    public void findView(View view){
        textView.findViewById(R.id.text_view_1);
    }
}
