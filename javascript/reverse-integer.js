var reverse = function(x) {
	const number = Math.abs(x).toString().split('').reverse().join('');

	 if (number > Math.pow(2, 31) - 1) {
			 return 0
	 }

	 return x < 0 ? -number : number;
};
let x=1234;
result=reverse(x)
console.log(result);
