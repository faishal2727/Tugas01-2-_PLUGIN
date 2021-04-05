package com.example.tugas01_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_dua.*

class FragmentDua : Fragment() {

    companion object{
        var EXTRA_NAME : String? = "nama"
        var EXTRA_NAME2 : String? = "squad"
        var EXTRA_NAME3 : String?= "angkatan"
        var EXTRA_NAME4 : String?= "hobi"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentSatu =FragmentSatu()
        btn_kembali.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragmentSatu, FragmentSatu::class.java.simpleName)
                commit()


            }

        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null){
        }
        if (arguments != null){
            EXTRA_NAME = arguments?.getString("nama")
            EXTRA_NAME2 = arguments?.getString("squad")
            EXTRA_NAME3 = arguments?.getString("angkatan")
            EXTRA_NAME4 = arguments?.getString("hobi")
            teks1.text = EXTRA_NAME
            teks2.text = EXTRA_NAME2
            teks3.text = EXTRA_NAME3
            teks4.text = EXTRA_NAME4
        }
    }
}