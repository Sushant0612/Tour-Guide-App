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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
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
        places.add(new Place(getString(R.string.national_gandhi_museum), getString(R.string.national_gandhi_museum_address), getString(R.string.national_gandhi_museum_desc), R.drawable.national_gandhi_museum
        ));
        places.add(new Place(getString(R.string.national_gallery_of_modern_art), getString(R.string.national_gallery_of_modern_art_address), getString(R.string.national_gallery_of_modern_art_desc), R.drawable.national_gallery_of_art));
        places.add(new Place(getString(R.string.indira_gandhi_memorial_museum), getString(R.string.indira_gandhi_memorial_museum_address), getString(R.string.indian_air_force_museum_desc), R.drawable.indira_gandhi_museum));
        places.add(new Place(getString(R.string.national_rail_museum), getString(R.string.national_rail_museum_address), getString(R.string.national_rail_museum_desc), R.drawable.national_rail_museum));
        places.add(new Place(getString(R.string.crafts_museum), getString(R.string.crafts_museum_address), getString(R.string.crafts_museum_desc), R.drawable.crafts_museum));
        places.add(new Place(getString(R.string.national_museum), getString(R.string.national_museum_address), getString(R.string.national_museum_desc), R.drawable.national_museum));
        places.add(new Place(getString(R.string.shankars_international_dolls_museum), getString(R.string.shankars_international_dolls_museum_address), getString(R.string.shankars_international_dolls_museum_desc), R.drawable.shankars_international_dolls_museum));
        places.add(new Place(getString(R.string.indian_air_force_museum), getString(R.string.indian_air_force_museum_address), getString(R.string.indian_air_force_museum_desc), R.drawable.indian_air_force_museum));
        places.add(new Place(getString(R.string.vedic_expo), getString(R.string.vedic_expo_address), getString(R.string.vedic_expo_desc), R.drawable.the_vedic_expo));
        places.add(new Place(getString(R.string.mumtaz_mahal), getString(R.string.mumtaz_mahal_address), getString(R.string.mumtaz_mahal_desc), R.drawable.mumtaz_mahal_jewel_palace));


        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }

}
