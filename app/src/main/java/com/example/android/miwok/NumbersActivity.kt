/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

import java.lang.reflect.Array
import android.widget.ArrayAdapter
import android.widget.ListView


class NumbersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        val words = arrayListOf<String>("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

        val itemsAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words)

        val listView = findViewById(R.id.list) as ListView?

        listView!!.setAdapter(itemsAdapter)
    }
}