// Usando map para criar uma nova array com os mesmos dados da array  original tendo o atributo idade de cada um acrescido de 10 anos


// const novaLista = pessoas.map((valor, index, array) => {
// 	valor.idade += 10;
// 	return valor;
// })

// ------------

// Aqui fiter gera uma nova lista com os elementos que passarem na condição : idade maio ou igual a 15
const novaLista = pessoas.filter((valor, index, array) => valor.idade >= 20);

// ---------------

// Pegamos o indice do elementos encontrado
const carlos = pessoas.findIndex((valor, index, array) => valor.nome === 'Carlos');


console.log(carlos);