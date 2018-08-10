package vsl.bhavesh.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.home.view.*

class HomeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.home, container, false)

            v.clickme.setOnClickListener {

                var fManager = activity!!.supportFragmentManager

                var tx = fManager.beginTransaction()  // get fragmenet transation class object
                tx.replace(R.id.fragment1,CourseFragment())
                tx.commit()

            }

        return v
        //return super.onCreateView(inflater, container, savedInstanceState)

    }
}