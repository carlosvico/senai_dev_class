const categoriaDeLivros = [
    {
    categoria: "Riqueza",
    livros: [
    {
    titulo: "Os segredos da mente milionária",
    autor: "T. Harv Eker",
    },
    {
    titulo: "O homem mais rico da babilônia",
    autor: "George S. Clason",
    },
    {
    titulo: "Pai rico, pai pobre",
    autor: "Robert T. Kiyosaki e Sharon L. Lechter",
    },
    ],
    },
    {
    categoria: "Inteligência Emocional",
    livros: [
    {
    titulo: "Você é insubstituível",
    autor: "Augusto Cury",
    },
    {
    titulo: "Ansiedade - Como enfrentar o mal do século",
    autor: "Augusto Cury",
    },
    {
    titulo: "Os 7 hábitos das pessoas altamente eficazes",
    autor: "Stephen R. Covey",
    },
    ],
    },
    ];


    // lista categorias de livros
    const nomesCategorias = categoriaDeLivros.map(e => e.categoria);

    for (const key in nomesCategorias) {
        let nlivro = categoriaDeLivros.filter(e => e.titulo)
    }


