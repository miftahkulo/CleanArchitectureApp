package com.example.presentation.base

import com.example.domain.base.Model

interface ItemMapper<M : Model, MI : ModelItem> {
    fun mapToPresentation(model: M): MI

    fun mapToDomain(modelItem: MI): M
}