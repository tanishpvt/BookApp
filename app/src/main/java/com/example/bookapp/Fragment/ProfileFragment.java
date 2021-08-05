package com.example.bookapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bookapp.HomeAdapter.BookHelperClass;
import com.example.bookapp.HomeAdapter.BooksAdapter;
import com.example.bookapp.HomeAdapter.FeaturedAdpater;
import com.example.bookapp.HomeAdapter.FeaturedHelperClass;
import com.example.bookapp.HomeAdapter.MostViewHelperClass;
import com.example.bookapp.HomeAdapter.MostViewedAdpater;
import com.example.bookapp.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    ImageView settings;
    TextView subscribed,internal,purchased;

    RecyclerView Books_recycler;
    RecyclerView.Adapter adapter5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        settings = view.findViewById(R.id.settings);


        subscribed = view.findViewById(R.id.subscribed);
        internal = view.findViewById(R.id.internal);
        purchased = view.findViewById(R.id.purchased);

        Books_recycler = view.findViewById(R.id.Books_recycler);
        Books_recycler = view.findViewById(R.id.Books_recycler);

        Books_recycler();

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new SettingFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

                subscribed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Books_recycler2();
            }
        });

        internal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Books_recycler3();
            }
        });

        purchased.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Books_recycler();
            }
        });








        return view;
    }


    private void Books_recycler() {

        //load only those views which are visible to user
        Books_recycler.setHasFixedSize(true);
        Books_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<BookHelperClass> books = new ArrayList<>();
        books.add(new BookHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));


        adapter5 = new BooksAdapter(books);
        Books_recycler.setAdapter(adapter5);
    }

    private void Books_recycler2() {

        Books_recycler.setHasFixedSize(true);
        Books_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<BookHelperClass> books = new ArrayList<>();
        books.add(new BookHelperClass(R.drawable.card_3,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_3,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_3,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_3,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_3,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card_3,"by Phil Stamper's","The Gravity of us"));


        adapter5 = new BooksAdapter(books);
        Books_recycler.setAdapter(adapter5);
    }

    private void Books_recycler3() {

        //load only those views which are visible to user
        Books_recycler.setHasFixedSize(true);
        Books_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<BookHelperClass> books = new ArrayList<>();
        books.add(new BookHelperClass(R.drawable.card2,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card2,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card2,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card2,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card2,"by Phil Stamper's","The Gravity of us"));
        books.add(new BookHelperClass(R.drawable.card2,"by Phil Stamper's","The Gravity of us"));


        adapter5 = new BooksAdapter(books);
        Books_recycler.setAdapter(adapter5);
    }

}