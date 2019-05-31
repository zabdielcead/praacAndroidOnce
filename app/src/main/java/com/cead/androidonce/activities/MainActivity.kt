package com.cead.androidonce.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.widget.Toast
import com.cead.androidonce.R
import com.cead.androidonce.activities.adapter.PagerAdapter

class MainActivity : AppCompatActivity() {


    /*
        https://developer.android.com/training/appbar/setting-up.html?hl=es

        Toolbar : de android 3.0 ó api 11 y posteriores es mejor usar TOOLBAR POR LA COMPATIBILIDAD (barra de arriba)
        Tabs:

     */

    var myToolbar: Toolbar ? =  null
    var tabLayout: TabLayout ? = null
    var viewPager: ViewPager ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        myToolbar =  findViewById(R.id.my_toolbar)
        myToolbar!!.title = "logo1"
        myToolbar!!.subtitle = "sublogo2"
        myToolbar!!.setLogo(android.R.drawable.ic_menu_info_details)
        setSupportActionBar(myToolbar)


        tabLayout = findViewById(R.id.tabLayout)
        tabLayout!!.addTab(tabLayout!!.newTab().setText("TAB 1"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("TAB 2"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("TAB 3"))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL



        viewPager =  findViewById(R.id.viewPager)
        var adapter  = PagerAdapter(supportFragmentManager, tabLayout!!.tabCount)
        viewPager!!.adapter = adapter
        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))   // listener del cambio de pagina con swipe llama  tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{


        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
                Log.i("TOOLBAR", "onTabReselected -> ${tab!!.text}")
                Toast.makeText(this@MainActivity,"onTabReselected -> ${tab!!.text}", Toast.LENGTH_SHORT).show()

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Log.i("TOOLBAR", "onTabUnselected -> ${tab!!.text}")
                Toast.makeText(this@MainActivity,"onTabUnselected ->${tab!!.text}", Toast.LENGTH_SHORT).show()

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.i("TOOLBAR", "onTabSelected -> ${tab!!.text}")
                Toast.makeText(this@MainActivity,"onTabSelected -> ${tab!!.text}", Toast.LENGTH_SHORT).show()
                var position = tab!!.position
                viewPager!!.currentItem = position
            }

        })





    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
