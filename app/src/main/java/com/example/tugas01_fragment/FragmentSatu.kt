package com.example.tugas01_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_satu.*
import kotlinx.android.synthetic.main.fragment_satu.view.*

class FragmentSatu : Fragment() {
    private lateinit var da : tampilan
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
            da = activity as tampilan
        val pantek = inflater.inflate(R.layout.fragment_satu, container, false)
        pantek.btn_simpan.setOnClickListener {
            da.setData(pantek.et1.text.toString())
            da.setData2(pantek.et2.text.toString())
            da.setData3(pantek.et3.text.toString())
            da.setData4(pantek.et4.text.toString())

        }
        return  pantek
        }
    }




