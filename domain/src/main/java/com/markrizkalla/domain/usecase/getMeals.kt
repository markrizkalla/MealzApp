package com.markrizkalla.domain.usecase

import com.markrizkalla.domain.repo.MealsRepo

class getMeals(private val mealsRepo: MealsRepo) {

    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}