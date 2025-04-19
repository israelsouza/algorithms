let vetor: number[] = [-7, -6, -3, -1, 0, 1, 3, 4, 5, 6, 7, 8, 9];

function binary_search_1(v: number[], item: number) {
    let inicio: number = 0;
    let fim: number = v.length-1;

    while (inicio <= fim) {
        let meio: number = Math.floor( (inicio + fim) / 2 );
        let chute: number = v[meio];

        if (chute == item) return meio;
        else if (chute > item) fim = meio - 1;
        else inicio = meio + 1;
    }

    return null;
}

binary_search_1(vetor,9);