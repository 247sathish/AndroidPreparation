package com.androidpreparation.designpatterns.dependencyinjectionpattern.hilt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.androidpreparation.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HUserAdapter @Inject constructor(private val userRepository: HUserRepository) : RecyclerView.Adapter<HUserAdapter.UserViewHolder>() {

    private val userList: List<HUser> = userRepository.getUsers()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_manual_injection, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val idTextView: TextView = itemView.findViewById(R.id.idTextView)
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        private val emailTextView: TextView = itemView.findViewById(R.id.emailTextView)

        fun bind(huser: HUser) {
            idTextView.text = huser.id.toString()
            nameTextView.text = huser.name
            emailTextView.text = huser.email
        }
    }
}
