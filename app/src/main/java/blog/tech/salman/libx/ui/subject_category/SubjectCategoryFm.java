package blog.tech.salman.libx.ui.subject_category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import blog.tech.salman.libx.R;

public class SubjectCategoryFm extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate( R.layout.fm_subject_category, container, false );
        return root;
    }
}
