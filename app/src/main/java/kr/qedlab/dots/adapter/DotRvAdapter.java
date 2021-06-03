package kr.qedlab.dots.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kr.qedlab.dots.R;

public class DotRvAdapter extends RecyclerView.Adapter<DotRvAdapter.DotRvVh> {
    private final String TAG = getClass().getSimpleName();
    private List<String> values = new ArrayList<>();
    protected ItemListener itemListener;

    public interface ItemListener {
        void onItemClick(int position);
    }

    public DotRvAdapter() {
        // todo dummy data
        Log.d(TAG, "value.size: " + values.size());
    }

    public void setOnItemClick(ItemListener itemListener) {
        this.itemListener = itemListener;
    }

    public void addItem(String text) {
        values.add(text);
    }
    /**
     *
     */
    public class DotRvVh extends RecyclerView.ViewHolder {
        TextView textView;
        String item;

        public DotRvVh(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.dot_rv_tv);
        }

        public void setItem(String item) {
            Log.d(TAG, "set item: " + item);
            this.item = item;
            textView.setText(item);
        }

    }

    @NonNull
    @Override
    public DotRvVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.dot_rv_layout, parent, false);
        return new DotRvVh(view);
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    @Override
    public void onBindViewHolder(@NonNull DotRvAdapter.DotRvVh holder, int position) {
        String item = values.get(position);
        holder.setItem(item);
    }
}
