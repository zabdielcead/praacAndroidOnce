package com.cead.androidonce.activities.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.cead.androidonce.R


class FirstFragment : Fragment() {




    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle? ): View? {


        var view = inflater.inflate(R.layout.fragment_first, container, false)

        return view
    }



}
