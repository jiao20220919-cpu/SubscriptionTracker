package com.appfactory.subscriptiontracker.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class Subscription(
    val id: Long = System.currentTimeMillis(),
    val name: String,
    val price: Double,
    val currency: String = "USD",
    val billingCycle: String,
    val firstPaymentDate: Long,
    val nextPaymentDate: Long,
    val autoRenew: Boolean = true,
    val category: String,
    val notes: String = "",
    val isActive: Boolean = true
)

class SubscriptionRepository {
    private val _subscriptions = MutableStateFlow<List<Subscription>>(emptyList())
    val subscriptions: Flow<List<Subscription>> = _subscriptions.asStateFlow()
    
    suspend fun addSubscription(subscription: Subscription) {
        _subscriptions.value = _subscriptions.value + subscription
    }
    
    suspend fun updateSubscription(subscription: Subscription) {
        _subscriptions.value = _subscriptions.value.map { 
            if (it.id == subscription.id) subscription else it 
        }
    }
    
    suspend fun deleteSubscription(subscription: Subscription) {
        _subscriptions.value = _subscriptions.value.filter { it.id != subscription.id }
    }
    
    fun getMonthlyTotal(): Double {
        return _subscriptions.value.filter { it.isActive }.sumOf { it.price }
    }
}
