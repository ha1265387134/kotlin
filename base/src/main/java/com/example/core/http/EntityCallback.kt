package com.example.core.http

/**
 * Created by huan on 2020/4/6.
 */
interface EntityCallback<T> {
    fun onSuccess(entity: T)

    fun onFailure(message: String?)
}