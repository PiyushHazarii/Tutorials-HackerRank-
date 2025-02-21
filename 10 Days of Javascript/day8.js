// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loops <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


function vowelsAndConsonants(s) {
    const vowels = 'aeiou';  // Define vowels as a reference
    let consonants = [];     // Array to store consonants

    // First, print all vowels in the order they appear
    for (let i = 0; i < s.length; i++) {
        if (vowels.includes(s[i])) {
            console.log(s[i]); // Print vowel directly
        } else {
            consonants.push(s[i]); // Store consonants for later printing
        }
    }

    // Second, print all consonants in the order they appear
    for (let char of consonants) {
        console.log(char);
    }
}
