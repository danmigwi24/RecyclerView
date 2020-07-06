package com.dan.funinandroid.nomalrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dan.funinandroid.R
import com.dan.funinandroid.nomalrecyclerview.data.User
import kotlinx.android.synthetic.main.user_fragment.*
import java.util.*


class UserFragment : Fragment() {
    private lateinit var userAdapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.user_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val user: ArrayList<User> = ArrayList()
        user.add(User("Daniel", "Kimani"))
        user.add(User("Daniel", "Migwi"))
        user.add(User("Daniel", "Njoki"))
        user.add(User("Daniel", "Mwaura"))
        user.add(User("Daniel", "Jose"))
        user.add(User("Daniel", "Chasrls"))
        userAdapter =
            UserAdapter(user)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this.context!!)
            setHasFixedSize(true)
            adapter = userAdapter
        }


    }

}
