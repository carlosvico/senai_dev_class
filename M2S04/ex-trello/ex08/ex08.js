// Adicionamos ao nosso array de jogadores a quantidade de gols de cada um:

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

// verifica se todos os volantes fizeram gol
const volantes = jogadores.filter(jogador =>jogador.posicao === 'Volante').every(volante => volante.gols >= 1);

const atacantes = jogadores.filter(jogador => jogador.posicao === 'Atacante').some(a => a.gols > 7);


console.log('Todos os volantes fizeram gols: ' + volantes);
console.log('Algum atacante fez mais de 7 gols: '+atacantes);
// Com este novo array execute as atividades:

// Utilizando a função every, verifique se todos os volantes fizeram gols
// Utilizando some, verifique e algum atacante fez mais de 7 gols
// Lembre-se que você pode utilizar outras funções do array para facilitar o seu desenvolvimento