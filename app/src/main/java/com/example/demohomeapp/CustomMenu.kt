package com.example.demohomeapp

import android.content.Context
import android.view.View
import android.widget.ExpandableListView
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenu
{
    fun showMenu(context: Context,view: View)
    {
        val pop = PopupMenu(context,view)
        pop.inflate(R.menu.menu)
        pop.setOnMenuItemClickListener {

            when (it !!.itemId)
            {
                R.id.new_edit -> {
                    Toast.makeText(context, "EDITED", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.new_delete -> {
                    Toast.makeText(context, "DELETED", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.new_group -> {
                    Toast.makeText(context, "NEW GROUP", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.new_search -> {
                    Toast.makeText(context, "SEARCH APPEARED", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.new_profile -> {
                    Toast.makeText(context, "GET YOUR PROFILE", Toast.LENGTH_LONG).show()
                    true
                }

                else ->false
            }
        }
        pop.show()
    }
}