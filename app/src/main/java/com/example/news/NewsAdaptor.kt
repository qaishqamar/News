package com.example.news

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import java.net.URL
import kotlinx.android.synthetic.main.news_row.view.*

class NewsAdaptor(val news: News):Item<GroupieViewHolder>(){
    override fun getLayout(): Int {
        return R.layout.news_row

    }

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
       // viewHolder.itemView.tv_list_news.text=news.title

    }

}