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

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksViewHolder> {

    ArrayList<BookHelperClass> books;

    public BooksAdapter(ArrayList<BookHelperClass> books) {
        this.books = books;
    }

    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        BooksViewHolder  booksViewHolder = new BooksViewHolder (view);
        return booksViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {

        BookHelperClass bookHelperClass = books.get(position);
        holder.image.setImageResource(bookHelperClass.getImage());
        holder.title.setText(bookHelperClass.getTitle());
        holder.desc.setText(bookHelperClass.getDescription());

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public static class BooksViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, desc;

        public BooksViewHolder(@NonNull View itemView) {
            super(itemView);

            //Hooks
            image = itemView.findViewById(R.id.iv);
            title = itemView.findViewById(R.id.ft);
            desc = itemView.findViewById(R.id.fd);

        }
    }
}
