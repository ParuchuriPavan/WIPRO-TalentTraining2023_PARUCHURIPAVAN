int sum = 0;//getSumOfDigits(input1, 0);
		int digitCount = String.valueOf(input1).length();
		int number = input1;
		if (input1 < 0) number *= -1;
		
		if (digitCount == 1) sum = number;
		
		while (digitCount != 1) {
			//sum = getSumOfDigits(input1);
			int currentSum = 0;
			while (number != 0) {
				currentSum += number % 10;
				number /= 10;
			}
			sum = currentSum;
			
			digitCount = String.valueOf(sum).length();
			number = sum;
		    //System.out.println(input1);
		}
		
		if (input1 < 0) sum *= -1;
		
		return sum;
	}
