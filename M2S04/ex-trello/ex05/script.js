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



//  Aguarda todo carregamento da pagina

let entrada = document.getElementById('inPosicao').value
let botao =  document.getElementById('inBtn')

let filtro = []
filtro = jogadoresSelecao94.filter(function(e){
    return e.posicao == `${entrada}`     
});


 
 botao.addEventListener('click', function (event) {
     event.preventDefault();
     console.log('asfgasdffagsd');
     criaTabela(filtro)
    })
 
    
    function criaTabela(dados) {
        
        console.log('Pegou o Botão');
        
        const tabela = document.getElementById('dados');
        let dadosHtml = '';
        
        for (let dado of dados) {
            dadosHtml += `<tr><td>${dado.nome}</td><td>${dado.posicao}</td></tr>`;
        }
        tabela.innerHTML = dadosHtml;
        // limpar()
    
 }





