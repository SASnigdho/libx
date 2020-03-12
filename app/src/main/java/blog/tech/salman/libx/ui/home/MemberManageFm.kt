package blog.tech.salman.libx.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import blog.tech.salman.libx.R
import kotlinx.android.synthetic.main.fm_member_manage.view.*

class MemberManageFm : Fragment() {
    // Member variable
    private lateinit var inflate: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        inflate = inflater.inflate(R.layout.fm_member_manage, container, false)

        // Find view by id.
        reference()

        return inflate
    }

    private fun reference() {
        inflate.AddMemberBtn.setOnClickListener {
            // Pass fragment to replace
            replaceFragment(AddMemberFm())
        }

        inflate.UpdateMemenrBtn.setOnClickListener {
            Toast.makeText(context, "Update member", Toast.LENGTH_SHORT).show()
        }

        inflate.DisableMemberBtn.setOnClickListener {
            Toast.makeText(context, "Disable member", Toast.LENGTH_SHORT).show()
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
                .replace(R.id.AcMemberFragmentContainerView, fragment, getString(R.string.back_stack))
                .addToBackStack(getString(R.string.back_stack))
                .commit()
    }
}
