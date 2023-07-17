package com.androidpreparation.designpatterns.dependencyinjectionpattern.withoutdagger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androidpreparation.R

class UserAdapter(private val userRepository: UserRepository) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private val userList: List<User> = userRepository.getUsers()

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

        fun bind(user: User) {
            idTextView.text = user.id
            nameTextView.text = user.name
            emailTextView.text = user.email
        }
    }
}
