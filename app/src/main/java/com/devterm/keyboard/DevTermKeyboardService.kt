package com.devterm.keyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.view.inputmethod.InputConnection
import android.widget.Button
import android.widget.LinearLayout


class DevTermKeyboardService :
    InputMethodService() {


    override fun onCreateInputView(): View {

        val layout =
            LinearLayout(this)


        val aiButton =
            Button(this)

        aiButton.text =
            "🤖 AI"


        val micButton =
            Button(this)

        micButton.text =
            "🎤 Voice"


        val fixButton =
            Button(this)

        fixButton.text =
            "✨ Fix"


        aiButton.setOnClickListener {

            val ic =
                currentInputConnection

            ic.commitText(
                "AI suggestion...",
                1
            )
        }


        micButton.setOnClickListener {

            currentInputConnection
                .commitText(
                "Voice text...",
                1
            )

        }


        fixButton.setOnClickListener {

            currentInputConnection
                .commitText(
                "Corrected text...",
                1
            )

        }


        layout.addView(aiButton)
        layout.addView(micButton)
        layout.addView(fixButton)


        return layout
    }

}
