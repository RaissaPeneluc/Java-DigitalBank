class ServicoConta {
    public void realizarDeposito(Conta conta, double valor) {
        conta.depositar(valor);
    }

    public void realizarSaque(Conta conta, double valor) {
        conta.sacar(valor);
    }

    public void realizarTransferencia(Conta origem, Conta destino, double valor) {
        origem.transferir(destino, valor);
    }
}
