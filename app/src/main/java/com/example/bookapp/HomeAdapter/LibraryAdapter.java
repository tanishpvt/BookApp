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

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.LibraryViewHolder> {

    ArrayList<LibraryHelperClass> Library;

    public LibraryAdapter(ArrayList<LibraryHelperClass> library) {
        this.Library = library;
    }


    @NonNull
    @Override
    public LibraryAdapter.LibraryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.library_card_design,parent,false);
          LibraryViewHolder libraryViewHolder = new LibraryViewHolder(view);

        return libraryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LibraryAdapter.LibraryViewHolder holder, int position) {
        LibraryHelperClass libraryHelperClass = Library.get(position);
        holder.image.setImageResource(libraryHelperClass.getImage());
        holder.title.setText(libraryHelperClass.getTitle());
        holder.desc.setText(libraryHelperClass.getDescription());


    }

    @Override
    public int getItemCount() {
        return Library.size();
    }

    public class LibraryViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title,desc;

        public LibraryViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.t1);
            desc = itemView.findViewById(R.id.d1);

        }
    }
}
