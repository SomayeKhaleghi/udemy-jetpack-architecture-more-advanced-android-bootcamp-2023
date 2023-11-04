package com.somaye.myapplication

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor(){

        init {
            Log.i("MyTag", "MemoryCard Constructed!")
        }

        fun getSpaceAvailability()
        {
            Log.i("MyTag", "Memory space  is available")
        }
}