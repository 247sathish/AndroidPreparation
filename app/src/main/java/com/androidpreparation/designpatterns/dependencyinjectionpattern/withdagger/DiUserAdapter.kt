package com.androidpreparation.designpatterns.dependencyinjectionpattern.withdagger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androidpreparation.R
import javax.inject.Inject

class DiUserAdapter @Inject constructor(private val userRepository: DiUserRepository) : RecyclerView.Adapter<DiUserAdapter.UserViewHolder>() {

    private val userList: List<DiUser> = userRepository.getUsers()



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

        fun bind(Diuser: DiUser) {
            idTextView.text = Diuser.id
            nameTextView.text = Diuser.name
            emailTextView.text = Diuser.email
        }
    }
}

