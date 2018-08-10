package vsl.bhavesh.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var fManager = supportFragmentManager // get support fragment manageger

        // When click on Project Tab
        projects.setOnClickListener {

            var tx = fManager.beginTransaction()  // get fragmenet transation class object
            tx.replace(R.id.fragment1,ProjectFragment())
            tx.commit()
        }


        // Call Home fragment
        home.setOnClickListener {

            var tx = fManager.beginTransaction()  // get fragmenet transation class object
            tx.replace(R.id.fragment1,HomeFragment())
            tx.commit()
        }


        // Call Course fragment
        courses.setOnClickListener {
            var tx = fManager.beginTransaction()  // get fragmenet transation class object
            tx.replace(R.id.fragment1,CourseFragment())
            tx.commit()

        }

    }// On Create

}
