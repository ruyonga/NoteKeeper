package com.ruyonga.notekeep

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_note_list.*
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            val activityIntent = Intent(this, NoteActivity::class.java)
            startActivity(activityIntent)
        }

        listitems.layoutManager = LinearLayoutManager(this)
        listitems.adapter = NoteRecyclerAdapter(this, DataManager.notes)

    }

    override fun onResume() {
        super.onResume()
        listitems.adapter?.notifyDataSetChanged()
    }
}

