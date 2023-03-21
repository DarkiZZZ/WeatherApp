package ru.msokolov.weatherapp.dagger

interface Dependencies

typealias DependenciesMap = Map<Class<out Dependencies>, @JvmSuppressWildcards Dependencies>

interface HasDependencies{
    val dependenciesMap: DependenciesMap
}