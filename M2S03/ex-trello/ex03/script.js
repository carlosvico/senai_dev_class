function inverteString(s) {

    // split separa todos os caracteres 
    // reverse propiamente inverte 
    // join uni tudo novamente 
    var arrayInvertido = s.split('').reverse().join(''); 
    return console.log(arrayInvertido);
}

let minhaString = 'Estudando javaScript'
inverteString(minhaString);