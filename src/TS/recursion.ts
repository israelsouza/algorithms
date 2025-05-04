{
    // 4.1  
    let vetor:number[] = [5, 12, 8, 20, 3, 15, 7, 10, 18, 2];
    let i:number = 0;
    let total:number = 0;
    let maior:number = 0;

    function somar(v:number[]) {
        if( i > (v.length - 1) ) 
            console.log("O total da soma é de: ", total)
        else {
            total += v[i];
            i++;
            somar(vetor);
        }
    }
    somar(vetor) 

    
    // 4.2
    function contarTamanhoArray(v:number[]) {
        if( i > (v.length - 1) ) 
            console.log("A quantidade de itens é: ", total)
        else {
            console.log("O ",i+1,"º item é o: ", v[i])
            total = i+1;
            i++;
            contarTamanhoArray(vetor);
        }
    }
    contarTamanhoArray(vetor) 


    // 4.3
    function encontrarMaiorValorArray(v:number[]) {
        if( i > (v.length-1) ) console.log("O maior valor é: ", maior)
        else {
            if (v[i] > maior) maior = v[i];
            i++;
            encontrarMaiorValorArray(vetor);
        }
    }
    encontrarMaiorValorArray(vetor) 
}