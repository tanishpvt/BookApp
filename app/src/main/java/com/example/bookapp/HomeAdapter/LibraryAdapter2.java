package com.example.bookapp.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookapp.R;

import java.util.ArrayList;

public class LibraryAdapter2 extends RecyclerView.Adapter<LibraryAdapter2.LibViewHolder> {

    ArrayList<LibraryHelperClass2> Library2;

    public LibraryAdapter2(ArrayList<LibraryHelperClass2> Library2) {
        this.Library2 = Library2;
    }

    @NonNull
    @Override
    public LibViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.library_card_design2, parent, false);
        LibViewHolder libViewHolder = new LibViewHolder(view);
        return libViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LibViewHolder holder, int position) {

        LibraryHelperClass2 LibraryHelperClass2 = Library2.get(position);
        holder.image.setImageResource(LibraryHelperClass2.getImage());
        holder.title.setText(LibraryHelperClass2.getTitle());
        holder.desc.setText(LibraryHelperClass2.getDescription());

    }

    @Override
    public int getItemCount() {
        return Library2.size();
    }

    public static class LibViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, desc;

        public LibViewHolder(@NonNull View itemView) {
            super(itemView);

            //Hooks
            image = itemView.findViewById(R.id.img1);
            title = itemView.findViewById(R.id.t2);
            desc = itemView.findViewById(R.id.d2);

        }
    }
}
