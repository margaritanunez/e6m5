package com.example.e6m5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e6m5.databinding.FragmentPlaceBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlaceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlaceFragment extends Fragment {
    private FragmentPlaceBinding binding;

    ArrayList<Paisaje> placeNames = new ArrayList<>();

    PlaceAdapter adapter = new PlaceAdapter();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PlaceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BookFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PlaceFragment newInstance(String param1, String param2) {
        PlaceFragment fragment = new PlaceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPlaceBinding.inflate(getActivity().getLayoutInflater(), container, false);
        //initData();
        initAdapter();

        return binding.getRoot();
    }

        public void initAdapter() {

            adapter.setData(initData());
            binding.placeRV.setAdapter(adapter);

    }

    public ArrayList<Paisaje> initData() {

        Paisaje place1 = new Paisaje("Londres", "https://images.unsplash.com/photo-1529655683826-aba9b3e77383?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8TE9ORE9OfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place1);
        Paisaje place2 = new Paisaje("Paris", "https://images.unsplash.com/photo-1502602898657-3e91760cbb34?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cGFyaXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place2);
        Paisaje place3 = new Paisaje("California", "https://images.unsplash.com/photo-1501594907352-04cda38ebc29?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FsaWZvcm5pYXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place3);
        Paisaje place4 = new Paisaje("Rio de Janeiro", "https://images.unsplash.com/photo-1620218776119-2bc322e2d7ad?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8YnJhc2lsfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place4);
        Paisaje place5 = new Paisaje("Venecia", "https://images.unsplash.com/photo-1523906834658-6e24ef2386f9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8aXRhbGlhfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place5);
        Paisaje place6 = new Paisaje("Torres del Paine", "https://images.unsplash.com/photo-1596423668247-f94229f7c679?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8dG9ycmVzJTIwZGVsJTIwcGFpbmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place6);
        Paisaje place7 = new Paisaje("Jujuy", "https://images.unsplash.com/photo-1599094792743-7df3e8870800?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8YXJnZW50aW5hfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place7);
        Paisaje place8 = new Paisaje("Cusco", "https://images.unsplash.com/photo-1584929722858-99c20bb8e28d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGN1c2NvfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place8);
        Paisaje place9 = new Paisaje("Rapanui", "https://media.istockphoto.com/id/186718520/es/foto/isla-tropical-aereal-vista.jpg?s=612x612&w=0&k=20&c=4gQBmt3FNSAVqYxJM4fk3Xja7rPQZbF3-WuI2EmLvZc");
        placeNames.add(place9);
        Paisaje place10 = new Paisaje("Mallorca", "https://images.unsplash.com/photo-1561369408-1e91d37fd2c5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGVzcGElQzMlQjFhfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place10);
        Paisaje place11 = new Paisaje("Tokio", "https://images.unsplash.com/photo-1554797589-7241bb691973?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGphcCVDMyVCM258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place11);
        Paisaje place12 = new Paisaje("Vancouver", "https://images.unsplash.com/photo-1554321585-ef3194b190cd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8dmFuY291dmVyfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60");
        placeNames.add(place12);
        return placeNames;
    }
}