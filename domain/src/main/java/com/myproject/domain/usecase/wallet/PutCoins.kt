package com.myproject.domain.usecase.wallet

import com.myproject.domain.repository.wallet.WalletRepository

class PutCoins(
    private val walletRepository : WalletRepository
) {
    fun execute(coins: Int): Boolean = walletRepository.putCoins(coins)
}
