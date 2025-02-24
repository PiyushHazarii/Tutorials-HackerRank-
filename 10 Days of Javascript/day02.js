// >>>>>>>>>>>>>>>>>>>>>>>>>>> Data Types <<<<<<<<<<<<<<<<<<<<<<<<<<


function performOperation(secondInteger, secondDecimal, secondString) {

    const firstInteger = 4;
    
    const firstDecimal = 4.0;
    
    const firstString = 'HackerRank ';
    
    // Convert inputs to appropriate number types
    secondInteger = parseInt(secondInteger, 10);
    secondDecimal = parseFloat(secondDecimal);

    console.log(firstInteger + secondInteger);

    console.log(firstDecimal + secondDecimal);

    console.log(firstString + secondString);    
}
