package blog.tech.salman.libx.ui.book_manage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import blog.tech.salman.libx.R

/**
 * A simple [Fragment] subclass.
 */
class BookManagerFm : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fm_book_manager, container, false)
    }

}
