const jogadoresSelecao94 = [
    {
        nome: 'Taffarel',
        posicao: 'Goleiro',
    },
    {
        nome: 'Jorginho',
        posicao: 'Lateral Direito',
    },
    {
        nome: 'Ricardo Rocha',
        posicao: 'Zagueiro',
    },
    {
        nome: 'Mauro Silva',
        posicao: 'Volante',
    },
    {
        nome: 'Bebeto',
        posicao: 'Atacante',
    },
    {
        nome: 'Romário',
        posicao: 'Atacante',
    },
    {
        nome: 'Dunga',
        posicao: 'Volante',
    },
]

// Pegar posição
const posicoes = jogadoresSelecao94.map((jogador)=>{
    return jogador.posicao;
})

// posiçoes unicas
const posicoesUnicas = []

posicoes.forEach((posicao) => {
    if(!posicoesUnicas.includes(posicao)){
        posicoesUnicas.push(posicao);
    }
})



// Criar array com os nome dos jogadores para cada posição
const resultado = []

posicoesUnicas.forEach((posicao) => {
    // filtra da mesma posição
    const jogadoresPorPosicao = jogadoresSelecao94.filter(jogador => jogador.posicao === posicao);

    console.log('Posição:',posicao)
    console.log('Jogadores: ',jogadoresPorPosicao.map(jogPorPosicao => jogPorPosicao.nome))
    console.log('-------------');

    // cria o item com posição e os jogadores
    const iResultado = {
        posicao: posicao,
        jogadores: jogadoresPorPosicao.map(jogPorPosicao => jogPorPosicao.nome),
    }

    resultado.push(iResultado);
});


