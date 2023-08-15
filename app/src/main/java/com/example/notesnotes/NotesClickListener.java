package com.example.notesnotes;

import androidx.cardview.widget.CardView;

import com.example.notesnotes.Model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
