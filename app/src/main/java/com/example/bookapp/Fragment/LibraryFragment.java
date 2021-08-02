package com.example.bookapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bookapp.HomeAdapter.CatogeriesAdapter;
import com.example.bookapp.HomeAdapter.CatogeriesHelperClass;
import com.example.bookapp.HomeAdapter.LibraryAdapter;
import com.example.bookapp.HomeAdapter.LibraryAdapter2;
import com.example.bookapp.HomeAdapter.LibraryHelperClass;
import com.example.bookapp.HomeAdapter.LibraryHelperClass2;
import com.example.bookapp.R;

import java.util.ArrayList;


public class LibraryFragment extends Fragment {


    RecyclerView library_recycler,library_recycler2;
    RecyclerView.Adapter adapter,adapter1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_library, container, false);

        library_recycler =view.findViewById(R.id.library_recycler);
        library_recycler2 =view.findViewById(R.id.library_recycler2);

        Libraryrecycler();
        Libraryrecycler2();

        return view;
    }

    private void Libraryrecycler2() {
        library_recycler2.setHasFixedSize(true);
        library_recycler2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<LibraryHelperClass2> Library2 = new ArrayList<>();
        Library2.add(new LibraryHelperClass2(R.drawable.card_3,"Gravity of us","by Author Name"));
        Library2.add(new LibraryHelperClass2(R.drawable.card_3,"Wildcats","by Author Name"));
        Library2.add(new LibraryHelperClass2(R.drawable.card_3,"Misery","by Author Name"));
        Library2.add(new LibraryHelperClass2(R.drawable.card_3,"Merchant","by Author Name"));
        Library2.add(new LibraryHelperClass2(R.drawable.card_3,"Harry Potter","by Author Name"));

        adapter1 = new LibraryAdapter2(Library2);
        library_recycler2.setAdapter(adapter1);
    }

    private void Libraryrecycler() {
        library_recycler.setHasFixedSize(true);
        library_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<LibraryHelperClass> Library = new ArrayList<>();
        Library.add(new LibraryHelperClass(R.drawable.card_3,"Gravity of us","by Author Name"));
        Library.add(new LibraryHelperClass(R.drawable.card_3,"Wildcats","by Author Name"));
        Library.add(new LibraryHelperClass(R.drawable.card_3,"Misery","by Author Name"));
        Library.add(new LibraryHelperClass(R.drawable.card_3,"Merchant","by Author Name"));
        Library.add(new LibraryHelperClass(R.drawable.card_3,"Harry Potter","by Author Name"));

        adapter = new LibraryAdapter(Library);
        library_recycler.setAdapter(adapter);
    }
}