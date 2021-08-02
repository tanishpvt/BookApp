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

import com.example.bookapp.HomeAdapter.CatogeriesAdapter;
import com.example.bookapp.HomeAdapter.CatogeriesHelperClass;
import com.example.bookapp.R;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    RecyclerView featuredRecycler,MostViewedRecycler,CatogeriesRecycler;
    RecyclerView.Adapter adapter,adapter1,adapter2;

    ImageView back;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_search, container, false);

        CatogeriesRecycler =view.findViewById(R.id.catogeries_recycler);
        back =view.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new HomeFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        CatogeriesRecycler();

        return view;
    }




    private void CatogeriesRecycler() {
        CatogeriesRecycler.setHasFixedSize(true);
        CatogeriesRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        ArrayList<CatogeriesHelperClass> catogeriesLocations = new ArrayList<>();
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Man Tiger","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Milkman","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Maps for lost lovers","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Merchant","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Harry Potter","I'm so starry-eyed for this wise, romantic gem of a book.Becky Albertalli, bestselling author of Simon vs."));

        adapter2 = new CatogeriesAdapter(catogeriesLocations);
        CatogeriesRecycler.setAdapter(adapter2);

        // GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{0xffeff400,0xffaff600});
    }
}