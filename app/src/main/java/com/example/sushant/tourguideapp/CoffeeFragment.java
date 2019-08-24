package com.example.sushant.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoffeeFragment extends Fragment {


    public CoffeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the list
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create the ArrayList for the places
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the places to the ArrayList
        places.add(new Place(getString(R.string.rose_cafe), getString(R.string.rose_cafe_address), getString(R.string.rose_cafe_desc), R.drawable.rose_cafe));
        places.add(new Place(getString(R.string.kunzum_travel_cafe), getString(R.string.kunzum_travel_cafe_address), getString(R.string.rose_cafe_desc), R.drawable.kunzum_tavel_cafe));
        places.add(new Place(getString(R.string.ama_cafe), getString(R.string.ama_cafe_address), getString(R.string.rose_cafe_desc), R.drawable.ama_cafe));
        places.add(new Place(getString(R.string.united_coffee_house), getString(R.string.united_coffee_house_address), getString(R.string.rose_cafe_desc), R.drawable.united_coffee_house));
        places.add(new Place(getString(R.string.cha_bar), getString(R.string.cha_bar_address), getString(R.string.rose_cafe_desc), R.drawable.cha_bar));
        places.add(new Place(getString(R.string.cafe_turtle), getString(R.string.cafe_turtle_address), getString(R.string.rose_cafe_desc), R.drawable.cafe_turtle));
        places.add(new Place(getString(R.string.cafe_lota), getString(R.string.cafe_lota_address), getString(R.string.rose_cafe_desc), R.drawable.cafe_lota));
        places.add(new Place(getString(R.string.triveni_terrance), getString(R.string.triveni_terrance_address), getString(R.string.rose_cafe_desc), R.drawable.triveni_terrance));


        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }

}
