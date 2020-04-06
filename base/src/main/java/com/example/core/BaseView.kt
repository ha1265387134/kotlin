package com.example.core

/**
 * Created by huan on 2020/4/6.
 */
interface BaseView<T> {
    fun getPresenter(): T
}