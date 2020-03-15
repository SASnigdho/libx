package blog.tech.salman.libx.ui.book_manage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import blog.tech.salman.libx.R

class BookManageAc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_book_manage)

        // Load first fragment
        supportFragmentManager
                .beginTransaction()
                .add(R.id.AcBookManageFCV, BookManagerFm())
                .commit()
    }
}
