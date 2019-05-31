package com.cead.androidonce.activities.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.cead.androidonce.R


class SecondFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {


        var view = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }


}
