package com.example.tugas01_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_satu.*

class MainActivity : AppCompatActivity() ,tampilan {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bebas(FragmentSatu())

        }
    private fun bebas(fragment : Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.container,fragment)
                .commit()
    }

    override fun setData(Input: String) {
        val bundle = Bundle()
        val fragmentdua = FragmentDua()
        bundle.putString("nama", Input)
        val suport = this.supportFragmentManager.beginTransaction()
        fragmentdua.arguments = bundle
        suport.replace(R.id.container,fragmentdua)
        suport.commit()
    }
    override fun setData2(Input2: String) {
        val bundle = Bundle()
        val fragmentdua = FragmentDua()
        bundle.putString("squad", Input2)
        val suport = this.supportFragmentManager.beginTransaction()
        fragmentdua.arguments = bundle
        suport.add(R.id.container, fragmentdua)
        suport.commit()
    }
    override fun setData3(Input3: String) {
        val bundle = Bundle()
        val fragmentdua = FragmentDua()
        bundle.putString("angkatan", Input3)
        val suport = this.supportFragmentManager.beginTransaction()
        fragmentdua.arguments = bundle
        suport.add(R.id.container, fragmentdua)
        suport.commit()
    }
    override fun setData4(Input4: String) {
        val bundle = Bundle()
        val fragmentdua = FragmentDua()
        bundle.putString("hobi", Input4)
        val suport = this.supportFragmentManager.beginTransaction()
        fragmentdua.arguments = bundle
        suport.add(R.id.container, fragmentdua)
        suport.commit()
    }
}