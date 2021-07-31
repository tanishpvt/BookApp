package com.example.bookapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookapp.HomeAdapter.CatogeriesAdapter;
import com.example.bookapp.HomeAdapter.CatogeriesHelperClass;
import com.example.bookapp.HomeAdapter.FeaturedAdpater;
import com.example.bookapp.HomeAdapter.FeaturedHelperClass;
import com.example.bookapp.HomeAdapter.MostViewHelperClass;
import com.example.bookapp.HomeAdapter.MostViewedAdpater;
import com.example.bookapp.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    RecyclerView featuredRecycler,MostViewedRecycler,CatogeriesRecycler;
    RecyclerView.Adapter adapter,adapter1,adapter2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_home, container, false);


        // receycler view function calls
        MostViewedRecycler();
        featuredRecycler();
        CatogeriesRecycler();



        return view;
    }

    private void CatogeriesRecycler() {
        CatogeriesRecycler.setHasFixedSize(true);
        CatogeriesRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<CatogeriesHelperClass> catogeriesLocations = new ArrayList<>();
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Restaurant"));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Education"));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Hospital"));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Shopping"));
        catogeriesLocations.add(new CatogeriesHelperClass(R.drawable.card_4,"Transport"));

        adapter2 = new CatogeriesAdapter(catogeriesLocations);
        CatogeriesRecycler.setAdapter(adapter2);

        // GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{0xffeff400,0xffaff600});
    }
    private void MostViewedRecycler() {
        MostViewedRecycler.setHasFixedSize(true);
        MostViewedRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<MostViewHelperClass> mostViewedLocation = new ArrayList<>();

        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"Mcdonlad's","This place is very nice evry one should visit this place high quality food"));
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"vashi","This place is very nice evry one should visit this place high quality food"));
        mostViewedLocation.add(new MostViewHelperClass(R.drawable.card_4,"brazil","This place is very nice evry one should visit this place high quality food"));

        adapter1 = new MostViewedAdpater(mostViewedLocation);
        MostViewedRecycler.setAdapter(adapter1);
    }
    private void featuredRecycler() {

        //load only those views which are visible to user
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"Mcdonlad's","This place is very nice evry one should visit this place high quality food"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"vashi","This place is very nice evry one should visit this place high quality food"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.card_4,"brazil","This place is very nice evry one should visit this place high quality food"));

        adapter = new FeaturedAdpater(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }

}