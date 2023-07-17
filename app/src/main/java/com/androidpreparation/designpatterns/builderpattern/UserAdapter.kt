package com.androidpreparation.designpatterns.builderpattern

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androidpreparation.R

class UserAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.findViewById<TextView>(R.id.textFirstName).text = user.firstName
            itemView.findViewById<TextView>(R.id.textLastName).text = user.lastName
            itemView.findViewById<TextView>(R.id.textAge).text = user.age.toString()
            itemView.findViewById<TextView>(R.id.textEmail).text = user.email
            itemView.findViewById<TextView>(R.id.textPhoneNumber).text = user.phoneNumber
        }
    }
}
