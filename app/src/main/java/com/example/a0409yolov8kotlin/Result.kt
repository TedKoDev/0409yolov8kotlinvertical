package com.example.a0409yolov8kotlin

import android.graphics.RectF

data class Result(val classIndex: Int, val score: Float, val rectF: RectF)