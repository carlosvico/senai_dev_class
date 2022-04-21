let familia =  {
    receita : [5000.01],
    despesa : [5000.00],


    checa: function(){
        return this.receita 
    },
    checa: function(){
        return this.despesa 
    }
}


let resultado = (arrayA, arrayB) => {
    
    let r ;
    let d ;
    let saldo;
    
    r = arrayA.reduce((a,b)=> a+b);
    d = arrayB.reduce((a,b)=> a+b);
    
    return  saldo = (r > d) ? 'positivo':'negativo';
    
    //  console.log(`A família esta com o saldo ${saldo}`);
    
}


let sReceita = familia.receita ;
let sDespesa = familia.despesa ;

console.log("A familia esta com o saldo: " + resultado(sReceita, sDespesa));