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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
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
        places.add(new Place(getString(R.string.indian_accent), getString(R.string.indian_accent_address), getString(R.string.indian_accent_desc), R.drawable.indian_accent));
        places.add(new Place(getString(R.string.zaffran), getString(R.string.zaffran_address), getString(R.string.zaffran_desc), R.drawable.zaffran));
        places.add(new Place(getString(R.string.oriental_octopus), getString(R.string.oriental_octopus_address), getString(R.string.zaffran_desc), R.drawable.oriental_octopus));
        places.add(new Place(getString(R.string.dakshin), getString(R.string.dakshin_address), getString(R.string.zaffran_desc), R.drawable.dakshin));
        places.add(new Place(getString(R.string.baluchi), getString(R.string.baluchi_address), getString(R.string.zaffran_desc), R.drawable.baluchi));
        places.add(new Place(getString(R.string.delhi_pavilion), getString(R.string.delhi_pavilion_address), getString(R.string.zaffran_desc), R.drawable.delhi_pavilion));
        places.add(new Place(getString(R.string.akira_back), getString(R.string.akira_back_address), getString(R.string.zaffran_desc), R.drawable.akira_back));
        places.add(new Place(getString(R.string.jamavar), getString(R.string.jamavar_address), getString(R.string.zaffran_desc), R.drawable.jamavar));
        places.add(new Place(getString(R.string.tamra), getString(R.string.tamra_address), getString(R.string.zaffran_desc), R.drawable.tamra));
        places.add(new Place(getString(R.string.lodi_the_garden), getString(R.string.lodhi_garden_address), getString(R.string.zaffran_desc), R.drawable.lodi_the_garden));


        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }

}
