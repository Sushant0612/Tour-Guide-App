package com.example.sushant.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {


    public SightsFragment() {
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
        places.add(new Place(getString(R.string.red_fort), getString(R.string.red_fort_address), getString(R.string.red_fort_desc), R.drawable.red_fort));
        places.add(new Place(getString(R.string.akshardham), getString(R.string.akshardham_address), getString(R.string.akshardham_desc), R.drawable.akshardham));
        places.add(new Place(getString(R.string.india_gate), getString(R.string.india_gate_address), getString(R.string.india_gate_desc), R.drawable.india_gate));
        places.add(new Place(getString(R.string.lodhi_garden), getString(R.string.lodhi_garden_address), getString(R.string.lodhi_garden_desc), R.drawable.lodhi_garden));
        places.add(new Place(getString(R.string.jantar_mantar), getString(R.string.jantar_mantar_address), getString(R.string.jantar_mantar_desc), R.drawable.jantar_mantar));
        places.add(new Place(getString(R.string.old_fort), getString(R.string.old_fort_address), getString(R.string.old_fort_desc), R.drawable.old_fort));
        places.add(new Place(getString(R.string.lotus_temple), getString(R.string.lotus_temple_address), getString(R.string.lotus_temple_desc), R.drawable.lotus_temple));
        places.add(new Place(getString(R.string.jama_masjid), getString(R.string.jama_masjid_address), getString(R.string.jama_masjid_desc), R.drawable.jama_masjid));
        places.add(new Place(getString(R.string.humayun_tomb), getString(R.string.humayun_tomb_address), getString(R.string.humayun_tomb_desc), R.drawable.humayun_tomb));
        places.add(new Place(getString(R.string.qutub_minar), getString(R.string.qutub_minar_address), getString(R.string.qutub_minar_desc), R.drawable.qutub_minar));


        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }

}
