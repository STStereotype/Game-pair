package com.myproject.domain.repository.wallet

import com.myproject.domain.model.Wallet

interface WalletRepository {

    fun getWallet(): Wallet

    fun putCoins(coins: Int): Boolean

    fun withdrawCoins(coins: Int): Boolean
}
