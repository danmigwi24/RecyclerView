package com.dan.funinandroid.nomalrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.dan.funinandroid.R
import com.dan.funinandroid.databinding.RecyclerItemuserBinding
import com.dan.funinandroid.nomalrecyclerview.data.User


class UserAdapter(private val user: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.recycler_itemuser,
            parent,
            false
        )
    )

    override fun getItemCount() = user.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.recyclerItemuserBinding.user = user[position]
    }

    inner class ViewHolder(val recyclerItemuserBinding: RecyclerItemuserBinding) :
        RecyclerView.ViewHolder(recyclerItemuserBinding.root)
}