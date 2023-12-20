package com.myproject.domain.usecase.wallet

import com.myproject.domain.repository.wallet.WalletRepository

class WithdrawCoins(
    private val walletRepository : WalletRepository
) {
    fun execute(coins: Int): Boolean = walletRepository.withdrawCoins(coins)
}
