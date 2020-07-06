package com.dan.funinandroid.groupie

import com.dan.funinandroid.R
import com.dan.funinandroid.databinding.GroupieItemuserBinding
import com.dan.funinandroid.nomalrecyclerview.data.User
import com.xwray.groupie.databinding.BindableItem

class UserItemGroupie(private val user: User) : BindableItem<GroupieItemuserBinding>() {
    override fun getLayout() = R.layout.groupie_itemuser

    override fun bind(viewBinding: GroupieItemuserBinding, position: Int) {
        viewBinding.setUser(user)
    }
}