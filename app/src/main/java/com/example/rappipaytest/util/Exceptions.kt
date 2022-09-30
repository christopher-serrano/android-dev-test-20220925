package moe.cachapa.companionfou.utils

import java.io.IOException

class NoConnectivityException : IOException()

class LocationPermissionNotGrantedException : Exception()

class DateNotFoundException : Exception()

class ApiException(message: String) : IOException(message)

class WorkManagerException: Throwable()
