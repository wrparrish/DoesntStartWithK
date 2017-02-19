package com.ruthlessprogramming.doesntstartwithk.domain.commands

/**
 * Created by billyparrish on 2/18/17 for DoesntStartWithK.
 */

interface Command<T> {
    fun execute(): T
}