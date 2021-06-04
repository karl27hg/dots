package kr.qedlab.dots.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.qedlab.dots.R;
import kr.qedlab.dots.adapter.DotRvAdapter;

/**
 */
public class DotFragment extends Fragment {
    private final String TAG = getClass().getSimpleName();
    RecyclerView dotRv;
    DotRvAdapter dotRvAdapter;

    public DotFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dot, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
        init();
    }

    void init() {
        dotRv = getView().findViewById(R.id.dot_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        dotRv.setLayoutManager(layoutManager);
        dotRvAdapter = new DotRvAdapter();
        dotRvAdapter.addItem("hello");
        dotRvAdapter.addItem("world");
        dotRv.setAdapter(dotRvAdapter);
    }

}