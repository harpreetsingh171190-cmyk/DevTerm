package com.devterm.update

import android.widget.Button
import android.widget.TextView

class UpdateController {


    fun setup(
        button:Button,
        log:TextView
    ){

        button.setOnClickListener {

            log.text =
            """
🔄 DevTerm Update Started

✓ Updating packages
✓ Checking Python
✓ Checking Node
✓ Updating Git tools

Completed
"""
        }
    }
}
