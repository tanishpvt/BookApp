package com.example.bookapp.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookapp.HomeAdapter.CatogeriesAdapter;
import com.example.bookapp.HomeAdapter.CatogeriesHelperClass;
import com.example.bookapp.HomeAdapter.FeaturedAdpater;
import com.example.bookapp.HomeAdapter.FeaturedHelperClass;
import com.example.bookapp.HomeAdapter.MostViewHelperClass;
import com.example.bookapp.HomeAdapter.MostViewedAdpater;
import com.example.bookapp.MainActivity;
import com.example.bookapp.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    RecyclerView featuredRecycler,MostViewedRecycler,CatogeriesRecycler;
    RecyclerView.Adapter adapter,adapter1,adapter2;
    private TextView Search;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_home, container, false);

        //hooks
        featuredRecycler = view.findViewById(R.id.featured_recycler);
        MostViewedRecycler = view.findViewById(R.id.MostViewedRecycler);
        Search = view.findViewById(R.id.Search);
      //  MostViewedRecycler = view.findViewById(R.id.most_viewed_recycler);
//        CatogeriesRecycler =view.findViewById(R.id.catogeries_recycler);


        // receycler view function calls
        MostViewedRecycler();
        featuredRecycler();
        //featuredRecyclerr();
//        CatogeriesRecycler();

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Fragment fragment = new SearchFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
//    }
    private void featuredRecycler() {

        //load only those views which are visible to user
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"by Phil Stamper's","The Gravity of us"));


        adapter = new FeaturedAdpater(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }

    private void MostViewedRecycler() {

        //load only those views which are visible to user
        MostViewedRecycler.setHasFixedSize(true);
        MostViewedRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        ArrayList<MostViewHelperClass> mostViewedLocation = new ArrayList<>();
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"Carval","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs. the Homo Sapiens Agenda Cal wants to be a journalist, and he's already well underway with almost half a million followers on his FlashFame app and an upcoming internship at Buzzfeed"));
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"Slice of life","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs. the Homo Sapiens Agenda Cal wants to be a journalist, and he's already well underway with almost half a million followers on his FlashFame app and an upcoming internship at Buzzfeed"));
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"Gravity of us","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs. the Homo Sapiens Agenda Cal wants to be a journalist, and he's already well underway with almost half a million followers on his FlashFame app and an upcoming internship at Buzzfeed"));
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"Gravity of us","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs. the Homo Sapiens Agenda Cal wants to be a journalist, and he's already well underway with almost half a million followers on his FlashFame app and an upcoming internship at Buzzfeed"));
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"Gravity of us","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs. the Homo Sapiens Agenda Cal wants to be a journalist, and he's already well underway with almost half a million followers on his FlashFame app and an upcoming internship at Buzzfeed"));
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"Gravity of us","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs. the Homo Sapiens Agenda Cal wants to be a journalist, and he's already well underway with almost half a million followers on his FlashFame app and an upcoming internship at Buzzfeed"));

        adapter1 = new MostViewedAdpater(mostViewedLocation);
        MostViewedRecycler.setAdapter(adapter1);
    }

//        private void CatogeriesRecycler() {
//        CatogeriesRecycler.setHasFixedSize(true);
//        CatogeriesRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
//
//        ArrayList<CatogeriesHelperClass> catogeriesLocations = new ArrayList<>();
//        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Restaurant","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
//        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Education","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
//        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Hospital","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
//        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Shopping","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
//        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Transport","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
//
//        adapter2 = new CatogeriesAdapter(catogeriesLocations);
//        CatogeriesRecycler.setAdapter(adapter2);
//
//        // GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{0xffeff400,0xffaff600});
//    }

}
