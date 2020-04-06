package com.example.app.entity

import java.util.*

/**
 * Created by huan on 2020/4/6.
 */
data class User constructor(val username: String?, val password: String?, val code: String?) {
    constructor() : this(null, null, null)
}