// Calcule usando a função reduce:

// Total de gols de todos os jogadores;
// Crie um array com o total de gols por posição;
// Crie uma página onde serão exibidos estes dados, pode se basear nas tabelas anteriores ou usar a imaginação :)

const jogadores = [
    {
        nome: 'Taffarel',
        posicao: 'Goleiro',
        gols: 0,
    },
    {
        nome: 'Jorginho',
        posicao: 'Lateral Direito',
        gols: 2,
    },
    {
        nome: 'Ricardo Rocha',
        posicao: 'Zagueiro',
        gols: 0,
    },
    {
        nome: 'Mauro Silva',
        posicao: 'Volante',
        gols: 1,
    },
    {
        nome: 'Bebeto',
        posicao: 'Atacante',
        gols: 5,
    },
    {
        nome: 'Romário',
        posicao: 'Atacante',
        gols: 8,
    },
    {
        nome: 'Dunga',
        posicao: 'Volante',
        gols: 2,
    },
];

const totalGeralGols = jogadores.reduce((tGols, j) => tGols += j.gols, 0);

const totalGolsPorPosicao = jogadores.reduce((gPorPosicao, jogador) => {
    const pAtual = gPorPosicao.find(iPosicao => iPosicao.posicao === jogador.posicao);

    if (pAtual) {
        pAtual.gols += jogador.gols;
    } else {
        gPorPosicao.push({
            posicao: jogador.posicao,
            gols: jogador.gols,
        });
    }
        return gPorPosicao
        

},[])

console.log(totalGolsPorPosicao);


console.log('Total de Geral de Gols: '+totalGeralGols);