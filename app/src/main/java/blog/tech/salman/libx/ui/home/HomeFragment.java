package blog.tech.salman.libx.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import blog.tech.salman.libx.R;
import blog.tech.salman.libx.ui.book_manage.BookManageAc;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate( R.layout.fragment_home, container, false );

        // Member manage button
        root.findViewById( R.id.FmHomeMemberMangeBtn ).setOnClickListener( v -> {
            startActivity( new Intent( getContext(), MemberAc.class ) );
        } );

        // Book manage button
        root.findViewById( R.id.FmHomeBookManageBtn ).setOnClickListener( v -> {
            startActivity( new Intent( getContext(), BookManageAc.class ) );
        } );

        return root;
    }
}
