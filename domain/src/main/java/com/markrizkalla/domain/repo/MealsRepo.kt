package com.markrizkalla.domain.repo

import com.markrizkalla.domain.entity.CategoryResponse

interface MealsRepo {

    fun getMealsFromRemote() : CategoryResponse
}