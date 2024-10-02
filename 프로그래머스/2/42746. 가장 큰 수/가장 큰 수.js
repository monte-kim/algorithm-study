function solution(numbers) {
    const stringNumbers = numbers.map(number => number + '');
    const sortedNumbers = stringNumbers.sort((a, b) => {
        if(a.charAt(0) === b.charAt(0)){
            return (b + a) - (a + b);
        }
        
        return b.charAt(0) -  a.charAt(0);
    });
    
    return sortedNumbers[0] === "0" ? "0" : sortedNumbers.join('');
}