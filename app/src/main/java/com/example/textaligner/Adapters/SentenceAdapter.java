package com.example.textaligner.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.textaligner.R;

import java.util.ArrayList;
import java.util.List;

public class SentenceAdapter extends RecyclerView.Adapter<SentenceAdapter.SentenceViewHolder> {

    private List<String> sentences;

    public SentenceAdapter(List<String> sentences) {
        this.sentences = sentences;
    }

    @NonNull
    @Override
    public SentenceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_text, parent, false);
        return new SentenceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SentenceViewHolder holder, int position) {
        String sentence = sentences.get(position);
        holder.textView.setText(sentence);
    }

    @Override
    public int getItemCount() {
        return sentences.size();
    }

    public class SentenceViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public SentenceViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.sentence_text_view);
        }
    }
}

