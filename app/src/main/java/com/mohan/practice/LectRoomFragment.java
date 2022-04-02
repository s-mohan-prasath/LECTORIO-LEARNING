package com.mohan.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LectRoomFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedinstanceState){
        return inflater.inflate(R.layout.lectroom_fragment,container,false);
    }

}
