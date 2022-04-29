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
];

let filtroInvertido = jogadoresSelecao94.filter( e => e.posicao == 'Atacante').reverse();

//  Aguarda todo carregamento da pagina
window.onload = () => {
    
    pegaFiltro(filtroInvertido)
}



function pegaFiltro(filtroInvertido) {
    const tabela = document.getElementById('dados');
    let dadosHtml = '';

    for (let dado of filtroInvertido) {
        dadosHtml += `<tr><td>${dado.nome}</td><td>${dado.posicao}</td></tr>`;

    }
    console.log(dadosHtml);
    tabela.innerHTML = dadosHtml;
}





