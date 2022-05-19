// Tenha em mente o seguinte código:

// Este código irá gerar uma exception, trate-a para que seja impresso no console do browser:

//"Não há ninguém aqui..."


const meuArray = [];

try {
    console.log(`Meu nome é ${meuArray[10].nome}`);
    
} catch (error) {

    console.log("Não há ninguém aqui...");
    
}