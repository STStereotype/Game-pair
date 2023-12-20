package com.myproject.domain.usecase.wallet

import com.myproject.domain.model.Wallet
import com.myproject.domain.repository.wallet.WalletRepository

class GetWalletUseCase(
    private val walletRepository : WalletRepository
) {
    fun execute(): Wallet = walletRepository.getWallet()
}
