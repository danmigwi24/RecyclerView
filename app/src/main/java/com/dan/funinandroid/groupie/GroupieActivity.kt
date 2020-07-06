package com.dan.funinandroid.groupie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dan.funinandroid.R
import com.dan.funinandroid.nomalrecyclerview.data.User
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_groupie.*

class GroupieActivity : AppCompatActivity() {
    val user: ArrayList<User> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groupie)

        user.add(User("Daniel", "Kimani"))
        user.add(User("Daniel", "Migwi"))
        user.add(User("Daniel", "Njoki"))
        user.add(User("Daniel", "Mwaura"))
        user.add(User("Daniel", "Jose"))
        user.add(User("Daniel", "Chasrls"))

        groupirRecyclerview.apply {
            layoutManager = LinearLayoutManager(this@GroupieActivity)
            val groupieAdapter = GroupAdapter<GroupieViewHolder>().apply {
                val use = user.toUserItem()
                addAll(use)
            }
            adapter = groupieAdapter
        }
    }

    private fun ArrayList<User>.toUserItem(): List<UserItemGroupie> {
        return this.map {
            UserItemGroupie(it)
        }
    }
}
