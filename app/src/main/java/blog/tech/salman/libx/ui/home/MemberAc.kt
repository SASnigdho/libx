package blog.tech.salman.libx.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import blog.tech.salman.libx.R

class MemberAc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_member)

        // find view by id
        reference()
    }

    // Find view by id
    private fun reference() {
        supportFragmentManager.beginTransaction()
                .add(R.id.AcMemberFragmentContainerView, MemberManageFm())
                .commit()
    }
}
