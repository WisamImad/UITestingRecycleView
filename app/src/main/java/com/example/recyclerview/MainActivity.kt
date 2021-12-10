package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CardLoctionInfoAdapter.onClick {

    var address: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        address = intent.getStringExtra("titleLoction")
        getListLoctionInfo()
    }

    private fun getListLoctionInfo() {
        val data = mutableListOf<CardLoctionInfo>()
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque1"))
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque2"))
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque3"))
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque4"))
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque5"))
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque6"))
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque7"))
        data.add(CardLoctionInfo(R.drawable.l1, "Alaqsa Mosque8"))

        rvLoctionInfo.layoutManager = LinearLayoutManager(this)
        rvLoctionInfo.setHasFixedSize(true)

        val Adapter = CardLoctionInfoAdapter(this, data, this)
        rvLoctionInfo.adapter = Adapter
    }

    override fun onClickItem(position: Int) {
        TODO("Not yet implemented")
    }
}
