package com.mohan.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.sufficientlysecure.htmltextview.HtmlTextView;

public class AboutUsFragment extends Fragment {

    String htmlCode=    "<ul><h2>Founder</h2><li>Deepak S</li></ul>"+
            "<ol><h2>Board of Supervising</h2><li>Ramyashree</li><li>Sunmathi</li></ol>"+
    "<ol><h2>Board of Teaching</h2><li>Bavanesh</li><li>Nikitha</li><li>Nantha Kishore</li><li>Kamali</li><li>Prahasini</li><li>Yoga Devi</li><li>Uma</li><li>Dhivya</li><li>Thenmozhi</li></ol>" +
    "<ol><h2>Board of Editing and Filming</h2><li>Joshika</li><br /><p>App &hearts; by Mohan Prasath S</p></ol>";

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedinstanceState){
        return inflater.inflate(R.layout.aboutus_fragment,container,false);





    }

}
