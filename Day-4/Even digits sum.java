import java.io.*;

import java.util.*;

// Read only region start

class Evendigitssum

{

public int EvenDigitsSum(int input1){

// Read only region end

int r,sum=0;

while(input1>0){

r=input1%10;

if(r%2==0){

sum=sum+r;

}

input1=input1/10;

}

return sum;

}

}
