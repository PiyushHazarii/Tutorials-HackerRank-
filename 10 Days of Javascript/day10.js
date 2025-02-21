// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Try, Catch, and Finally >>>>>>>>>>>>>>>>>>>>>>>>>>>>>


function reverseString(s) {
    try {
        // Attempt to reverse the string
        let reversed = s.split('').reverse().join('');
        console.log(reversed);
    } catch (error) {
        // Catch and print the error message
        console.log(error.message);
        console.log(s);
    }
}

