function fobonacci(n) {
	if (n <= 2) {
		return 1;
	}
	let n1 = 1;
	let n2 = 1;
	let result = 0;
	let range = n + 1;
	for (let index = 3; index <= range; index++) {
		result = n1 + n2;
		n2 = n1;
		n1 = result;
	}

	return result;
}

function track_execution_speed() {
	console.log('Average time to execute f(90) in nanoseconds\n');
	for (let index = 0; index < 200; index++) {
		let start_time = Date.now();
		for (let index2 = 0; index2 < 50; index2++) {
			fobonacci(90);
		}
		let totaltime = Date.now() - start_time;
		console.log(`time : ${totaltime}`);
	}
}

track_execution_speed();
